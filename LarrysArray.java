package com.company;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LarrysArray {

    // Complete the larrysArray function below.
    static String larrysArray(int[] A, int call) {
        int a, b, c, calls = call > 0 ? call : 0;
        boolean sorted = true;

        for(int i = 0; i < A.length - 2; i++) {
            a = A[i]; b = A[i + 1]; c = A[i + 2];
            if(willRotate(A[i], A[i + 1], A[i + 2])) {
                A[i] = b;
                A[i + 1] = c;
                A[i + 2] = a;
                if (willRotate(A[i], A[i + 1], A[i + 2])) {
                    A[i] = c;
                    A[i + 1] = a;
                    A[i + 2] = b;
                    if (willRotate(A[i], A[i + 1], A[i + 2])) {
                        A[i] = a;
                        A[i + 1] = b;
                        A[i + 2] = c;
                    }
                }
            }
        }
        for(int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1]) {sorted = false; break;}
        }
        calls++;
        if (sorted) return "YES";
        else if (calls < A.length) return larrysArray(A, calls);
        else return "NO";
    }

    private static boolean willRotate(int a, int b, int c) {
        return a > b || a > c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] A = new int[n];

            String[] AItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int AItem = Integer.parseInt(AItems[i]);
                A[i] = AItem;
            }

            String result = larrysArray(A, 0);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
