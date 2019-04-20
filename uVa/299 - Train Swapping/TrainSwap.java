/*
* 299 - Train Swapping: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=235
*/

import java.io.PrintWriter;
import java.util.Scanner;

public class TrainSwap {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int l = reader.nextInt();
        int[] train;

        for (int i = 0; i < l; i++) {
            train = new int[reader.nextInt()];
            for (int j = 0; j < train.length; j++) {train[j] = reader.nextInt(); }
            writer.println("Optimal train swapping takes " + countInv(train) + " swaps.");
        }
        reader.close();
        writer.close();
    }

    private static int countInv(int[] arr) {

        int inv = 0;
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                arr[i] += arr[i + 1]; // swap without extra temp variable.
                arr[i + 1] = arr[i] - arr[i + 1];
                arr[i] -= arr[i + 1];
                inv++;
                sorted = false;
            }
        }
        if (sorted) return 0;
        return inv + countInv(arr);
    }
}
