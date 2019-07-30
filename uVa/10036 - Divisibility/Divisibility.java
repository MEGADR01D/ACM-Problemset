/*
* 10036 - Divisibility: https://onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=977
*/

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class Divisibility {

    private static int[][] memo;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int m = reader.nextInt(), n, k;
        int[] nums;

        for (int i = 0; i < m; i++) {
            n = reader.nextInt();
            k = reader.nextInt();
            nums = new int[n];
            for (int j = 0; j < n; j++) nums[j] = reader.nextInt();
            memo = new int[n][101];
            for (int[] a : memo) Arrays.fill(a, -1);
            writer.println(isDiv(nums, 0, k, nums[0]) == 1 ? "Divisible" : "Not divisible");
        }
        reader.close();
        writer.close();
    }

    private static int isDiv(int[] arr, int idx, int k, int val) {

        val = (val % k + k) % k;
        if (idx == arr.length - 1) return val % k == 0 ? 1 : 0;
        if (memo[idx][val] != -1) return memo[idx][val];
        boolean div = false;
        if (isDiv(arr,idx + 1, k,val + arr[idx + 1]) == 1 || isDiv(arr, idx + 1, k, val - arr[idx + 1]) == 1) div = true;
        return memo[idx][val] = div ? 1 : 0;
    }
}
