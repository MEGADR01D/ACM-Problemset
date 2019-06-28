/*
* 12577 - Hajj-e-Akbar: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=441&page=show_problem&problem=4022
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class Hajj {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int c = 1;
        String str;

        while (!(str = reader.nextLine()).equals("*")) writer.printf("Case %d: Hajj-e-A%sar%n", c++, str.charAt(0) == 'H' ? "kb" : "sgh");
        reader.close();
        writer.close();
    }
}
