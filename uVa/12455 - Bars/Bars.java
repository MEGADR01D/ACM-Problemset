/*
* 12455 - Bars: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=3886
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class Bars {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), n, p;
        int[] ps;

        for (int i = 0; i < t; i++) {
            n = reader.nextInt();
            p = reader.nextInt();
            ps = new int[p];
            for (int j = 0; j < p; j++) ps[j] = reader.nextInt();
            writer.println(n == 0 || isPerm(ps, 0, 0, n) ? "YES" : "NO");
        }
        reader.close();
        writer.close();
    }

    private static boolean isPerm(int[] arr, int idx, int sum, int target) {

        if (arr.length == idx) return false;

        int curSum = sum + arr[idx];

        if (curSum == target) return true;
        return isPerm(arr, idx + 1, sum, target) || isPerm(arr, ++idx, curSum, target);
    }
}
