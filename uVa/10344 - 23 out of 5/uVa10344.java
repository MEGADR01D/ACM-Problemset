/*
* 10344 - 23 out of 5: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1285
*/

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class uVa10344 {

    private static int[][] numPerms = new int[120][5]; // 120 = 5!
    private static int c;
    private static boolean valid = false;

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int[] ints = new int[5], ops = new int[4];

        while (true) {
            for (int i = 0; i < 5; i++) ints[i] = reader.nextInt();
            if (ints[0] == 0) break;
            numPerm(ints, 0);
            c = 0;
            for (int[] perm: numPerms) {
                genPerm(perm, ops, 0);
                if (valid) break;
            }
            writer.println(valid ? "Possible" : "Impossible");
            valid = false;
        }
        reader.close();
        writer.close();
    }

    private static void numPerm(int[] arr, int idx) {

        if (idx > 3) {
            numPerms[c++] = Arrays.copyOf(arr, arr.length);
            return;
        }
        for (int i = idx; i < arr.length; i++) {
            int t = arr[idx];
            arr[idx] = arr[i];
            arr[i] = t;
            numPerm(arr, idx + 1);
            t = arr[idx];
            arr[idx] = arr[i];
            arr[i] = t;
        }
    }

    private static void genPerm(int[] arr, int[] ops, int idx) {

        if (valid) return;
        if (idx >= ops.length) {
            int res = 0;
            int[] tmp = Arrays.copyOf(arr, arr.length);
            for (int i = 0; i < ops.length; i++) {
                switch (ops[i]) {
                    case 0:
                        res = tmp[i] + tmp[i + 1];
                        tmp[i + 1] = res;
                        break;
                    case 1:
                        res = tmp[i] - tmp[i + 1];
                        tmp[i + 1] = res;
                        break;
                    case 2:
                        res = tmp[i] * tmp[i + 1];
                        tmp[i + 1] = res;
                }
            }
            valid = res == 23;
            return;
        }
        for (int i = 0; i < 3; i++) {
            ops[idx] = i;
            genPerm(arr, ops, idx + 1);
        }
    }
}
