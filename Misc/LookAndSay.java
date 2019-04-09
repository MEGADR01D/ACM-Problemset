/*
* Problem: https://i.postimg.cc/c4b3Bzmr/Look-And-Say.jpg
*/

import java.io.PrintWriter;
import java.util.Scanner;

public class LookAndSay {
    private static void main2() {
        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n = reader.nextInt();
        System.out.println(lookAndSay(n));
        reader.close();
        writer.close();
    }

    private static String lookAndSay(int n) {
        if (n > 0) return "1" + ", " + maker("1", n - 1);
        else return "";
    }
    private static String maker(String s, int n) {
        String cur = !s.isEmpty() ? s : "", tmp = "";
        int count = 1;
        for (int i = 0; i < cur.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) count++;
            else if ((i + 1 < s.length() && s.charAt(i) != s.charAt(i + 1)) || i == cur.length() - 1 || i + 1 >= s.length()) {
                tmp = tmp + count + s.charAt(i);
                count = 1;
            }
        }
        return n > 1 ? tmp + ", " + maker(tmp, n - 1) : tmp;
    }
}
