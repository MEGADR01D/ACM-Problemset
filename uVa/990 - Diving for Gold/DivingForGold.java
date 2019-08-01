/*
* 990 - Diving for Gold: https://onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=931
*/

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class DivingForGold {

    private static int[][] memo, dv, tres;
    private static int[] wd;
    private static int c;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n, t, w;

        while (reader.hasNextInt()) {
            t = reader.nextInt();
            w = reader.nextInt();
            n = reader.nextInt();
            wd = new int[n];
            dv = new int[n][2];
            memo = new int[31][1001];
            tres = new int[31][31];
            c = 0;

            for (int[] m : memo) Arrays.fill(m, -1);
            for (int[] a : tres) Arrays.fill(a, -1);
            for (int i = 0; i < n; i++) {
                dv[i][0] = reader.nextInt();
                dv[i][1] = reader.nextInt();
                wd[i] = 3 * w * dv[i][0];
            }
            writer.println(dp(0, t));
            print(0, t);
            writer.println(c);
            for (int[] a : tres) if (a[0] != -1) writer.printf("%d %d%n", a[0], a[1]);
            writer.print(reader.hasNextInt() ? "\n" : "");
        }
        reader.close();
        writer.close();
    }

    private static int dp(int idx, int t) {

        if (t < 0 || idx == dv.length) return 0;
        if (memo[idx][t] != -1) return memo[idx][t];
        int take = t >= wd[idx] ? dv[idx][1] + dp(idx + 1,t - wd[idx]) : 0;
        int leave = dp(idx + 1, t);
        return memo[idx][t] = Math.max(take, leave);
    }

    private static void print(int idx, int t) {

        if (idx == 30 || t <= 0) return;
        if (memo[idx][t] > memo[idx + 1][t] && t >= wd[idx]) {
            tres[idx] = dv[idx];
            c++;
            print(idx + 1,t - wd[idx]);
        } else print(idx + 1, t);
    }
}
