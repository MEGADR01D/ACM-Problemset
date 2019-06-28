/*
* 12372 - Packing for Holiday: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=278&page=show_problem&problem=3794
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class HoliPack {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), l, w, h;

        for (int i = 1; i <= t; i++) {
            l = reader.nextInt();
            w = reader.nextInt();
            h = reader.nextInt();

            writer.printf("Case %d: %s%n", i, l <= 20 && w <= 20 && h <= 20 ? "good" : "bad");
        }
        reader.close();
        writer.close();
    }
}
