/*
* 11364 - Parking: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=25&page=show_problem&problem=2349
*/

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class Parking {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), d;
        int[] x;

        for (int i = 0; i < t; i++) {
            x = new int[reader.nextInt()];
            d = 0;

            for (int j = 0; j < x.length; j++) x[j] = reader.nextInt();
            Arrays.sort(x);
            for (int j = 0; j < x.length - 1; j++) d += x[j + 1] - x[j];
            d += x[x.length - 1] - x[0];
            writer.println(d);
        }
        reader.close();
        writer.close();
    }
}
