/*
* 10300 - Ecological Premium: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=15&page=show_problem&problem=1241
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = reader.nextInt(), f, s, ef;
        long b;

        for (int i = 0; i < n; i++) {
            f = reader.nextInt();
            b = 0;

            for (int j = 0; j < f; j++) {
                s = reader.nextInt();
                reader.nextInt(); // redundant
                ef = reader.nextInt();
                b += (long) s * ef;
            }
            writer.println(b);
        }
        reader.close();
        writer.close();
    }
}
