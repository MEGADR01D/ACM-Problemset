/*
* 10963 - The Swallowing Ground: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=16&page=show_problem&problem=1904
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class Swallow {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = reader.nextInt(), w, g = 0;
        boolean valid;

        for (int i = 0; i < n; i++) {
            w = reader.nextInt();
            valid = true;

            for (int j = 0; j < w; j++) {
                if (j == 0) g = Math.abs(reader.nextInt() - reader.nextInt());
                else if (g != Math.abs(reader.nextInt() - reader.nextInt())) valid = false;
            }
            writer.println((valid ? "yes" : "no") + (i < n - 1 ? "\n" : ""));
        }
        reader.close();
        writer.close();
    }
}
