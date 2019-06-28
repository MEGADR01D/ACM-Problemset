/*
* 12250 - Language Detection: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=244&page=show_problem&problem=3402
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class LangDet {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        String str;
        int c = 0;

        while (!(str = reader.nextLine()).equals("#")) {
            writer.printf("Case %d: ", ++c);
            switch (str) {
                case "HELLO":
                    writer.println("ENGLISH");
                    break;
                case "HOLA":
                    writer.println("SPANISH");
                    break;
                case "HALLO":
                    writer.println("GERMAN");
                    break;
                case "BONJOUR":
                    writer.println("FRENCH");
                    break;
                case "CIAO":
                    writer.println("ITALIAN");
                    break;
                case "ZDRAVSTVUJTE":
                    writer.println("RUSSIAN");
                    break;
                default:
                    writer.println("UNKNOWN");
            }
        }
        reader.close();
        writer.close();
    }
}
