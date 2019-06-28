/*
* 12403 - Save Setu: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=279&page=show_problem&problem=3834
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class Setu {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), b = 0;

        for (int i = 0; i < t; i++) {
            if (reader.next().charAt(0) == 'd') b += reader.nextInt();
            else writer.println(b);
        }
        reader.close();
        writer.close();
    }
}
