/*
* 11044 - Searching for Nessy: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=22&page=show_problem&problem=1985
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class Nessy {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), n, m;

        for (int i = 0; i < t; i++) {
            n = reader.nextInt();
            m = reader.nextInt();
            writer.println(n / 3 * (m / 3));
        }
        reader.close();
        writer.close();
    }
}
