/*
* 272 - TEX Quotes: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=4&page=show_problem&problem=208
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class TEX {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        String str;
        boolean open = true;

        while (reader.hasNextLine()) {
            str = reader.nextLine();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '"') if (open) {
                    str = str.replaceFirst("\"", "``");
                    open = false;
                } else {
                    str = str.replaceFirst("\"", "''");
                    open = true;
                }
            }
            writer.println(str);
        }
        reader.close();
        writer.close();
    }
}
