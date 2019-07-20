/*
* 11420 - Chest of Drawers: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=16&page=show_problem&problem=2415
*/

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class ChestOfDrawers {

    private static long[][][] ways = new long[66][66][2];
    private static int n, s;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        for (long[][] way : ways) for (long[] w : way) Arrays.fill(w, -1);

        while ((n = reader.nextInt()) > -1 && (s = reader.nextInt()) > -1) writer.println(findWays(n, s, 1));
        reader.close();
        writer.close();
    }

    private static long findWays(int d, int c, int l) {

        if (n == s || s == n - 1) return 1;
        if (c < 0) return 0;
        if (d == 0) return c == 0 ? 1 : 0;
        if (ways[d][c][l] != -1) return ways[d][c][l];
        return ways[d][c][l] = findWays(d - 1, l == 1 ? c - 1 : c, 1) + findWays(d - 1, c, 0);
    }
}
