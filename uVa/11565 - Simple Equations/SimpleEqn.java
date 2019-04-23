/*
* 11565 - Simple Equations: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2612
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class SimpleEqn {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int z, a, b, c, n = reader.nextInt();

        Outer: for (int i = 0; i < n; i++) {
            a = reader.nextInt();
            b = reader.nextInt();
            c = reader.nextInt();

            for (int x = -100; x <= 100; x++)
                for (int y = -100; y <= 100; y++) {
                    z = a - x - y;
                    if (x * y * z == b && x * x + y * y + z * z == c && x != y  && y != z && x != z) {
                        writer.println(x + " " + y + " " + z);
                        continue Outer;
                    }
                }
            writer.println("No solution.");
        }
        reader.close();
        writer.close();
    }
}
