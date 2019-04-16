/*
* Uva 11995 - I Can Guess the Data Structure!: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=3146
*/

import java.io.PrintWriter;
import java.util.*;
import java.util.Scanner;

public class GuessStructure {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n, x;

        while ((n = reader.nextInt()) != -1) {
            Stack<Integer> xs = new Stack<>();
            Queue<Integer> xq = new LinkedList<>();
            PriorityQueue<Integer> xp = new PriorityQueue<>(Collections.reverseOrder());
            boolean s = true, q = true, p = true;
            //n = reader.nextInt();
            for (int i = 0; i < n; i++) {
                if (reader.nextInt() == 1) {
                    x = reader.nextInt();
                    if (s) xs.push(x);
                    if (q) xq.add(x);
                    if (p) xp.add(x);
                    System.out.println("xp: " + xp);
                } else {
                    x = reader.nextInt();
                    if (s) if (xs.isEmpty() || x != xs.peek()) s = false; else xs.pop();
                    if (q) if (xq.isEmpty() || x != xq.peek()) q = false; else xq.remove();
                    if (p) if (xp.isEmpty() || x != xp.peek()) p = false; else xp.remove();
                }
            }
            if (s && !q && !p) writer.println("stack");
            else if (!s && q && !p) writer.println("queue");
            else if (!s && !q && p) writer.println("priority queue");
            else if (!s && !p) writer.println("impossible");
            else writer.println("not sure");
        }
        reader.close();
        writer.close();
    }
}
