/*
* 11547 - Automatic Answer: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=27&page=show_problem&problem=2542
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class AutoAns {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), n, e;

        for (int i = 0; i < t; i++) {
            n = reader.nextInt();
            e = ((n * 567 / 9 + 7492) * 235 / 47 - 498) % 100 / 10;
            writer.println(e < 0 ? -e : e);
        }
        reader.close();
        writer.close();
    }
}
