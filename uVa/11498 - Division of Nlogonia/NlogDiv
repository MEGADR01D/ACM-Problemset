/*
* 11498 - Division of Nlogonia: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=26&page=show_problem&problem=2493
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class NlogDiv {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int k, divX, divY, x, y;

        while ((k = reader.nextInt()) != 0) {
            divX = reader.nextInt(); divY = reader.nextInt();

            for (int i = 0; i < k; i++) {
                x = reader.nextInt();
                y = reader.nextInt();
                if (x == divX || y == divY) writer.println("divisa");
                else if (y > divY) {
                    if (x > divX) writer.println("NE");
                    else writer.println("NO");
                } else {
                    if (x > divX) writer.println("SE");
                    else writer.println("SO");
                }
            }
        }
        reader.close();
        writer.close();
    }
}
