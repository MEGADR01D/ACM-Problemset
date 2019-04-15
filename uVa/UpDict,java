/*
* 12504 - Updating a Dictionary: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=3948
*/

import java.io.PrintWriter;
import java.util.*;
import java.util.Scanner;

public class UpDict {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in).useDelimiter("[^a-z0-9:]");
        PrintWriter writer = new PrintWriter(System.out);
        int t = reader.nextInt(), c;
        reader.nextLine();
        String in, key, val;
        HashMap<String, String> oldMap;
        HashMap<String, String> newMap;
        TreeSet<String> add;
        TreeSet<String> rem;
        TreeSet<String> chg;
        boolean old, emptyOld;
        ArrayList<String> oldDict;
        ArrayList<String> newDict;

        for (int i = 0; i < t; i++) {
            oldDict = new ArrayList<>();
            newDict = new ArrayList<>();
            oldMap = new HashMap<>();
            newMap = new HashMap<>();
            add = new TreeSet<>();
            rem = new TreeSet<>();
            chg = new TreeSet<>();
            emptyOld = false;
            for (int j = 0; j < 2; j++) {
                val = "";
                key = "";
                c = 0;
                in = reader.nextLine();
                old = j % 2 == 0;
                in = in.substring(1, in.length() - 1);
                if (!in.isEmpty()) {
                    if (old && emptyOld) {
                        for (String s : newDict) for (String sub : s.split(":")) if (sub.charAt(0) >= 'a' && sub.charAt(0) <= 'z') rem.add(sub);
                    } else {
                        if (old) Collections.addAll(oldDict, in.split(","));
                        else Collections.addAll(newDict, in.split(","));
                        for (String s : (old ? oldDict : newDict)) {
                            for (String sub : s.split(":")) {
                                if (!key.isEmpty() && !val.isEmpty()) {
                                    if (old) oldMap.put(key, val);
                                    else newMap.put(key, val);
                                    key = "";
                                    val = "";
                                }
                                if (sub.charAt(0) >= 'a' && sub.charAt(0) <= 'z') key = sub;
                                else val = sub;
                            }
                            if (old) oldMap.put(key, val);
                            else newMap.put(key, val);
                        } if (!old) {
                            if (oldMap.equals(newMap)) writer.println("No changes");
                            else {
                                for (String s : newDict) {
                                    for (String sub : s.split(":")) {
                                        if (sub.charAt(0) >= 'a' && sub.charAt(0) <= 'z') {
                                            if (!oldMap.containsKey(sub)) {
                                                add.add(sub);
                                                key = "";
                                            } else key = sub;
                                        } else if (!key.isEmpty() && !oldMap.get(key).equals(sub)) chg.add(key);
                                    }
                                }
                                for (String s : oldDict)
                                    for (String sub : s.split(":"))
                                        if (sub.charAt(0) >= 'a' && sub.charAt(0) <= 'z')
                                            if (!newMap.containsKey(sub)) rem.add(sub);
                            }
                        }
                    }
                } else if (old) emptyOld = true;
                else if (emptyOld) writer.println("No changes");
                else for (String s : oldDict) for (String sub : s.split(":")) if (sub.charAt(0) >= 'a' && sub.charAt(0) <= 'z') rem.add(sub);
                if (!add.isEmpty()) {
                    writer.print("+");
                    for (String s : add) {
                        writer.print(s + (add.size() > 1 && c < add.size() - 1 ? "," : ""));
                        c++;
                    }
                    c = 0;
                    writer.println();
                } if (!rem.isEmpty()) {
                    writer.print("-");
                    for (String s : rem) {
                        writer.print(s + (rem.size() > 1 && c < rem.size() - 1 ? "," : ""));
                        c++;
                    }
                    c = 0;
                    writer.println();
                } if (!chg.isEmpty()) {
                    writer.print("*");
                    for (String s : chg) {
                        writer.print(s + (chg.size() > 1 && c < chg.size() - 1 ? "," : ""));
                        c++;
                    }
                    writer.println();
                }
            }
            writer.println();
        }
        reader.close();
        writer.close();
    }
}
