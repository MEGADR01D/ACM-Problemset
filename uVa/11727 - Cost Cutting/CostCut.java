/*
* 11727 - Cost Cutting: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=117&page=show_problem&problem=2827
*/

import java.util.Arrays;
import java.util.Scanner;
import java.io.PrintWriter;

public class CostCut {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt();
        int[] s = new int[3];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < 3; j++) s[j] = reader.nextInt();
            Arrays.sort(s);
            writer.printf("Case %d: %d%n", i + 1, s[1]);
        }
        reader.close();
        writer.close();
    }
}
