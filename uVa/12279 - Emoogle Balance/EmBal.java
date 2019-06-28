/*
* 12279 - Emoogle Balance: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=244&page=show_problem&problem=3431
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class EmBal {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n, b, c = 0;

        while ((n = reader.nextInt()) != 0) {
            b = 0;

            for (int i = 0; i < n; i++) if (reader.nextInt() == 0) b--; else b++;
            writer.printf("Case %d: %d%n", ++c, b);
        }
        reader.close();
        writer.close();
    }
}
