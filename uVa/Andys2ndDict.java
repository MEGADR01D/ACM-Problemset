import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Andys2ndDict {

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
        for (int i = 0; i < w.size() - 1; i++) {
            if (w.get(i).endsWith("-")) {
                w.set(i, w.get(i).substring(0, w.get(i).length() - 1) + w.get(i + 1));
                w.remove(i + 1);
                i--;
            }
        }
        for (String s : w) if (!s.isEmpty()) Collections.addAll(par, s.split("[^a-z-]"));
        for (String s: par) if (!s.isEmpty()) writer.println(s);
        reader.close();
        writer.close();
    }
}
