/*
* 621 - Secret Research: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=8&page=show_problem&problem=562
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class SecRe {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = reader.nextInt();
        String str;

        for (int i = 0; i < n; i++) {
            str = reader.next();
            if (str.equals("1") || str.equals("4") || str.equals("78")) writer.println('+');
            else if (str.endsWith("35")) writer.println('-');
            else if (str.charAt(0) == '9' && str.charAt(str.length() - 1) == '4') writer.println('*');
            else writer.println('?');
        }
        reader.close();
        writer.close();
    }
}
