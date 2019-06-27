/*
* 10360 - Rat Attack: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1301
*/

import java.io.PrintWriter;
import java.util.Scanner;

public class RatAttack {

    public static void main(String[] args) {

        java.util.Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int s = reader.nextInt(), d, n, rats, x, y, c, minX, minY, maxX, maxY;
        int[][] pop;

        for (int i = 0; i < s; i++) {
            d = reader.nextInt();
            n = reader.nextInt();
            pop = new int[1025][1025];
            rats = 0; x = 0; y = 0;
            minX = 1024; minY = 1024; maxX = 0; maxY = 0;

            for (int j = 0; j < n; j++) {
                x = reader.nextInt();
                y = reader.nextInt();
                c = reader.nextInt();
                minX = Math.min(x, minX);
                minY = Math.min(y, minY);
                maxX = Math.max(x, maxX);
                maxY = Math.max(y, maxY);

                for (int k = Math.max(x - d, 0); k <= Math.min(x + d, 1024); k++)
                    for (int l = Math.max(y - d, 0); l <= Math.min(y + d, 1024); l++) pop[k][l] += c;
            }
            for (int j = Math.max(minX - d, 0); j <= Math.min(maxX + d, 1024); j++) {
                for (int k = Math.max(minY - d, 0); k <= Math.min(maxY + d, 1024); k++) {
                    if (pop[j][k] > rats) {
                        rats = pop[j][k];
                        x = j;
                        y = k;
                    }
                }
            }
            writer.printf("%d %d %d%n", x, y, rats);
        }
        reader.close();
        writer.close();
    }
}
