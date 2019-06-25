/*
* 725 - Division: https://uva.onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=16&page=show_problem&problem=666
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class Division {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = reader.nextInt(), j;
        boolean sol;

        while (true) {
            sol = false;
            for (int i = 1234; i <= 98765; i++) {
                j = i * n;
                if (compare(j < 10000 ? "0" + j : j + "", i < 10000 ? "0" + i : i + "")) {
                    sol = true;
                    writer.println(j < 10000 ? "0" + j : j + " / " + (i < 10000 ? "0" + i : i) + " = " + n);
                }
            }
            if (!sol) writer.println("There are no solutions for " + n + ".");
            n = reader.nextInt();
            if (n == 0) break;
            else writer.println();
        }
        reader.close();
        writer.close();
    }

    private static boolean isUnique(String num) {

        for (int i = 0; i < num.length(); i++) for (int j = i + 1; j < num.length(); j++) if (num.charAt(i) == num.charAt(j)) return false;
        return true;
    }

    private static boolean compare(String num, String den) {

        boolean res = isUnique(num) && isUnique(den);

        if (res) for (int i = 0; i < num.length(); i++) for (int j = 0; j < den.length(); j++) if (num.charAt(i) == den.charAt(j)) return false;
        return res;
    }
}
