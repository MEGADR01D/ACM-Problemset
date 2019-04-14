/*
* 11286 - Conformity: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2261
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class Conformity {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        int n, pop, max, c;
        String tmp;
        TreeSet<String> s;
        StringBuilder sb;
        HashMap<String, Integer> hMap;

        while ((n = Integer.parseInt(reader.readLine())) != 0) {
            hMap = new HashMap<>();
            max = 1;
            c = 0;
            for (int i = 0; i < n; i++) {
                s = new TreeSet<>();
                sb = new StringBuilder();
                Collections.addAll(s, reader.readLine().split("\\s"));
                for (String b : s) {
                    sb.append(b);
                    sb.append(" ");
                }
                tmp = sb.toString();
                if (!hMap.containsKey(tmp)) {
                    hMap.put(tmp, 1);
                    if (max == 1) c++;
                } else {
                    hMap.replace(tmp, (pop = hMap.get(tmp)), ++pop);
                    if (pop > max) {
                        max = pop;
                        c = max;
                    } else if (max == pop) c += max;
                }
            }
            writer.println(c);
        }
        reader.close();
        writer.close();
    }
}
