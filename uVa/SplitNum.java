/*
* uVa 11933 - Splitting Numbers: https://uva.onlinejudge.org/index.php?option=onlinejudge&Itemid=99999999&page=show_problem&category=0&problem=3084&mosmsg=Submission+received+with+ID+22943613
*/

import java.io.PrintWriter;
import java.util.Scanner;

public class SplitNum {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n, a, b, c, e;
        StringBuilder resA, resB, bin;
        int[] ones;
        while ((n = reader.nextInt()) != 0) {
            bin = new StringBuilder(Integer.toBinaryString(n));
            ones = new int[bin.length()];
            bin.reverse();
            c = 0;
            e = 0;
            resA = new StringBuilder(); resB = new StringBuilder();
            for (int i = 0; i < bin.length(); i++) if (bin.charAt(i) == '1') c++;
            for (int i = 0; i < c; i++) ones[i] = i + 1;
            for (int i = 0; i < bin.length(); i++) {
                if (bin.charAt(i) == '0') {resA.append('0'); resB.append('0');}
                else {
                    if (ones[e] % 2 != 0) {
                        resA.append('1');
                        resB.append('0');
                    } else {
                        resB.append('1');
                        resA.append('0');
                    }
                    e++;
                }
            }
            resA.reverse();
            resB.reverse();
            a = Integer.parseInt(resA.toString(), 2);
            b = Integer.parseInt(resB.toString(), 2);
            writer.println(a + " " + b);
        }
        reader.close();
        writer.close();
    }
}
