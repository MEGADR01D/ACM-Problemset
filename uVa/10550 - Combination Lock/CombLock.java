/*
* 10550 - Combination Lock: https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&category=17&page=show_problem&problem=1491
*/

import java.util.Scanner;
import java.io.PrintWriter;

public class CombLock {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int deg, pos;
        int[] comb;

        while (true) {
            pos = reader.nextInt();
            comb = new int[3];
            deg = 1080;
            for (int i = 0; i < 3; i++) comb[i] = reader.nextInt();
            if (pos == 0 && comb[0] == 0 && comb[1] == 0 && comb[2] == 0) break;
            if (pos < comb[0]) deg += 360 - (comb[0] - pos) * 9;
            else deg += (pos - comb[0]) * 9;
            if (comb[0] < comb[1]) deg += (comb[1] - comb[0]) * 9;
            else if (comb[0] != comb[1]) deg += 360 - (comb[0] - comb[1]) * 9;
            if (comb[1] < comb[2]) deg += 360 - (comb[2] - comb[1]) * 9;
            else deg += (comb[1] - comb[2]) * 9;
            writer.println(deg);
        }
        reader.close();
        writer.close();
    }
}
