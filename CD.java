/*
* 11849 - CD https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2949
*/

import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class CD {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n, m, cd = 0;
        HashSet<Integer> hashSet = new HashSet<>();

        while ((n = reader.nextInt()) != 0 && (m = reader.nextInt()) != 0) {
            for (int i = 0; i < n; i++) hashSet.add(reader.nextInt());
            for (int i = 0; i < m; i++) if (hashSet.contains(reader.nextInt())) cd++;
            writer.println(cd);
            cd = 0;
            hashSet.clear();
        }
        reader.close();
        writer.close();
    }
}
