/*
* 12289 - One-Two-Three: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=244&page=show_problem&problem=3710
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class One23 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = reader.nextInt();
        String str;

        for (int i = 0; i < n; i++) {
            str = reader.next();

            if (str.length() == 5) writer.println(3);
            else if (str.contains("ne") || str.contains("on") || str.charAt(0) == 'o' && str.charAt(2) == 'e') writer.println(1);
            else writer.println(2);
        }
        reader.close();
        writer.close();
    }
}
