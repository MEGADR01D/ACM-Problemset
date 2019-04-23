/*
* 1260 - Sales: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=3701
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class Sales {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), n, sum;
        int[] a;

        for (int i = 0; i < t; i++) {
            sum = 0;
            n = reader.nextInt();
            a = new int[n];
            for (int j = 0; j < n; j++) a[j] = reader.nextInt();
            for (int j = 1; j < n; j++) for (int k = 0; k < j; k++) sum += a[j] >= a[k] ? 1 : 0;
            writer.println(sum);
        }
        reader.close();
        writer.close();
    }
}
