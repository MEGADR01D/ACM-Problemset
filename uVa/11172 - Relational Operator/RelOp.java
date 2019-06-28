/*
* 11172 - Relational Operator: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=23&page=show_problem&problem=2113
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class RelOp {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), opr0, opr1;

        for (int i = 0; i < t; i++) {
            opr0 = reader.nextInt();
            opr1 = reader.nextInt();
            if (opr0 == opr1) writer.println('=');
            else if (opr0 < opr1) writer.println('<');
            else writer.println('>');
        }
        reader.close();
        writer.close();
    }
}
