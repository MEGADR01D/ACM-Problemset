/*
* 10954 - Add All: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=1895
*/

import java.io.PrintWriter;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AddAll {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        PrintWriter writer = new PrintWriter(System.out);
        int n, t0, t1, ct;
        PriorityQueue<Integer> nums;

        while ((n = reader.nextInt()) != 0) {
            nums = new PriorityQueue<>();
            ct = 0;
            if (n == 1) {
                reader.nextInt();
                writer.println(0);
                continue;
            }
            for (int i = 0; i < n; i++) nums.add(reader.nextInt());
            while (nums.size() > 1) {
                t0 = nums.remove();
                t1 = nums.remove();
                ct += t0 + t1;
                nums.add(t0 + t1);
            }
            writer.println(ct);
        }
        reader.close();
        writer.close();
    }
}
