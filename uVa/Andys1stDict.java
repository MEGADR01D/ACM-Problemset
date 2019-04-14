/*
* 10815 - Andy's First Dictionary: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1756
*/

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Andys1stDict {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        String in;
        ArrayList<String> w = new ArrayList<>();
        TreeSet<String> par = new TreeSet<>();

        while (reader.hasNextLine()) {
            in = reader.nextLine().toLowerCase();
            Collections.addAll(w, in.split("\\s"));
        }
        for (String s : w) if (!s.isEmpty()) Collections.addAll(par, s.split("[^a-z]"));
        for (String s: par) if (!s.isEmpty()) writer.println(s);
        reader.close();
        writer.close();
    }
}
