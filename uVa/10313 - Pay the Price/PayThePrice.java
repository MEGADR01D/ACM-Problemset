/*
* 10313 - Pay the Price: https://onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1254
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.PrintWriter;

public class PayThePrice {

    private static long[][][] memo = new long[301][301][301];

    public static void main(String[] args) throws java.io.IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        int n, l1, l2;
        long s;
        String[] num;
        String in;

        for (long[][] o : memo) for (long[] m : o) Arrays.fill(m, -1);
        while (reader.ready()) {
            in = reader.readLine();
            num = in.split("\\s");
            n = Integer.parseInt(num[0]); s = 0;
            l1 = -1; l2 = -1;
            if (num.length >= 2) l1 = Integer.parseInt(num[1]);
            if (num.length > 2)  l2 = Integer.parseInt(num[2]);
            for (int i = l2 == -1 ? 0 : l1; i <= (l2 == -1 ? l1 == -1 ? n : l1 : l2); i++) s += i > 300 ? 0 : ways(n, n, i);
            writer.println(s);
        }
        reader.close();
        writer.close();
    }

    private static long ways(int n, int c, int l) {

        if (n == 0 && l == 0) return 1;
        if (n < 0 || c < 1 || l < 0) return 0;
        if (memo[n][c][l] != -1) return memo[n][c][l];
        return memo[n][c][l] = ways(n - c, c, l - 1) + ways(n, c - 1, l);
    }
}
