/*
* 11341 - Term Strategy: https://onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2316
*/

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class TermStrategy {

    private static int[][] l, memo;
    private static int n, m;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt();
        double s;

        for (int i = 0; i < t; i++) {
            n = reader.nextInt();
            m = reader.nextInt();
            l = new int[n + 1][m + 1];
            memo = new int[n + 1][m + 1];

            for (int[] e : memo) Arrays.fill(e, -1);
            for (int j = 1; j <= n; j++) for (int k = 1; k <= m; k++) l[j][k] = reader.nextInt();
            if ((s = avgMark(m, 1) * 1.0 / n) >= 5) writer.printf("Maximal possible average mark - %.2f.%n", s);
            else writer.println("Peter, you shouldn't have played billiard that much.");
        }
        reader.close();
        writer.close();
    }

    private static int avgMark(int rem, int cn) {

        if (rem < 0) return -1000000;
        if (cn > n) return 0;
        if (memo[cn][rem] != -1) return memo[cn][rem];
        int max = 0;
        for (int i = 1; i <= m; i++) {
            if (l[cn][i] < 5) continue;
            max = Math.max(max, l[cn][i] + avgMark(rem - i,cn + 1));
        }
        return memo[cn][rem] = max == 0 ? -1000000 : max;
    }
}
