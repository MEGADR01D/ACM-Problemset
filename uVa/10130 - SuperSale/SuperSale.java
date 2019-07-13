/*
* 10130 - SuperSale: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=16&page=show_problem&problem=1071
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class SuperSale {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), n, g, k;
        int[] mw, res;
        int[][] pw;

        for (int i = 0; i < t; i++) {
            n = reader.nextInt();
            pw = new int[n][2];
            res = new int[31];
            k = 0;

            for (int j = 0; j < n; j++) {
                pw[j][0] = reader.nextInt();
                pw[j][1] = reader.nextInt();
            }
            for (int j = 0; j < n; j++) for (int l = 30; l > 0; l--)
                if (pw[j][1] <= l && res[l] < res[l - pw[j][1]] + pw[j][0]) res[l] = res[l - pw[j][1]] + pw[j][0];
            g = reader.nextInt();
            mw = new int[g];
            for (int j = 0; j < g; j++) {
                mw[j] = reader.nextInt();
                k += res[mw[j]];
            }
            writer.println(k);
        }
        reader.close();
        writer.close();
    }
}
