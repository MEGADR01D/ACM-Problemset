/*
* 11462 - Age Sort: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2457
*/

import java.util.Scanner;
import java.io.PrintWriter;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n, c;
        int[] ages;
        TreeMap<Integer, Integer> elements; // Custom implementation of CountingSort
        Object value;

        while ((n = reader.nextInt()) != 0) {
            c = 0;
            ages = new int[n];
            elements = new TreeMap<>();
            for (int i = 0; i < n; i++) ages[i] = reader.nextInt();
            for (int ele : ages) elements.put(ele, (value = elements.get(ele)) == null ? 1 : Integer.parseInt(value.toString()) + 1);
            for (int key : elements.keySet()) {
                for (int i = 0; i < elements.get(key); i++) writer.print(key + (c < elements.keySet().size() - 1 || i < elements.get(key) - 1 ? " " : ""));
                c++;
            }
            writer.println();
        }
        reader.close();
        writer.close();
    }
}
