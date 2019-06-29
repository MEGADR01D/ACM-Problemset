/*
* 10114 - Loansome Car Buyer: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=13&page=show_problem&problem=1055
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class CarBuyer {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int m, r, c;
        double down, loan, worth, rate;
        double[] rs;

        while ((m = reader.nextInt()) >= 0) {
            down = reader.nextDouble();
            loan = reader.nextDouble();
            r = reader.nextInt();
            rs = new double[101];
            c = 0;
            worth = down + loan;

            for (int i = 0; i < r; i++) rs[reader.nextInt()] = reader.nextDouble();
            rate = rs[0];
            down = loan / m;
            for (; c < m; c++) {
                rate = rs[c] > 0 ? rs[c] : rate;
                worth *= 1 - rate;
                if (loan < worth) break;
                loan -= down;
            }
            writer.printf("%d month%s%n", c, c != 1 ? "s" : "");
        }
        reader.close();
        writer.close();
    }
}
