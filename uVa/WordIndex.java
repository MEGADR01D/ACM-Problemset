/*
* 417 - Word Index: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=358
*/

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class WordIndex {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        HashMap<String, Integer> hMap = new HashMap<>();
        int in = 1;
        Queue<String> q = new LinkedList<>();

        for (char c = 'a'; c <= 'z'; hMap.put(Character.toString(c), in++), c++) q.add(Character.toString(c));
        while (!q.isEmpty()) {
            String s = q.poll();
            char l = s.charAt(s.length() - 1);
            if (s.length() == 5 || l == 'z') continue;
            for (char n = ++l; n <= 'z'; q.add(s + n), n++) hMap.put(s + n, in++);
        } while (reader.hasNext()) {
            Integer val = hMap.get(reader.next());
            writer.println(val == null ? 0 : val);
        }
        reader.close();
        writer.close();
    }
}
