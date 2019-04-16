/*
* 1203 - Argus: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=3644
*/

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Argus {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int k, period, curVal, min = Integer.MAX_VALUE, count = 1, key = -1, val, len;
        String s;
        PriorityQueue<Entry> pq = new PriorityQueue<>();
        Entry entry, curEntry;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashMap<Integer, Integer> originalVal = new HashMap<>();

        while (!(s = reader.next()).equals("#")) {
            if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
                if (key == -1) key = Integer.parseInt(s);
                else {
                    val = Integer.parseInt(s);
                    min = val < min ? val : min;
                    entry = new Entry(key, val);
                    pq.add(entry);
                    hashMap.put(key, 1);
                    originalVal.put(key, val);
                    key = -1;
                }
            }
        }
        period = min;
        len = pq.size();
        k = reader.nextInt();
        while (k > 0) {
            for (int j = 0; j < len; j++) {
                if (k == 0) break;
                curEntry = pq.poll();
                curVal = originalVal.get(Objects.requireNonNull(curEntry).getKey()) * hashMap.get(curEntry.getKey());
                if (curVal <= period) {
                    writer.println(curEntry.getKey());
                    hashMap.replace(curEntry.getKey(), hashMap.get(curEntry.getKey()),hashMap.get(curEntry.getKey()) + 1);
                    k--;
                }
                pq.add(new Entry(curEntry.getKey(), originalVal.get(curEntry.getKey()) * hashMap.get(curEntry.getKey())));
            }
            period = min * ++count;
        }
        reader.close();
        writer.close();
    }
}
class Entry implements Comparable<Entry> {

    private Integer key, val;

     Entry(int key, int val) {
        this.key = key;
        this.val = val;
    }
    @Override
    public int compareTo(Entry entry) {
         int val = this.val.compareTo(entry.val);
         if (val == 0) return this.key.compareTo(entry.key);
        return val;
    }
    int getKey() { return key; }
}
