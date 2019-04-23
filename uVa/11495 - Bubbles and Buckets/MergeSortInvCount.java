/*
* 11495 - Bubbles and Buckets: https://uva.onlinejudge.org/index.php?option=onlinejudge&page=show_problem&problem=2490
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MergeSortInvCount {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter writer = new PrintWriter(System.out);
        CountInv counter;
        int len;
        String in;
        int[] perms;
        String[] strs;

        while ((in = reader.readLine()).charAt(0) != '0') {
            strs = in.split("\\s");
            len = Integer.parseInt(strs[0]);
            perms = new int[len];
            counter = new CountInv();
            for (int j = 1; j < strs.length; j++) perms[j - 1] = Integer.parseInt(strs[j]);
            writer.println(counter.mergeSort(perms, 0, perms.length - 1) % 2 != 0 ? "Marcelo" : "Carlos");
        }
        reader.close();
        writer.close();
    }
}

class CountInv {

    long mergeSort(int[] arr, int start, int end) {

        long inv = 0;

        if (start < end) {
            inv = mergeSort(arr, start, (start + end) / 2);
            inv += mergeSort(arr, (start + end) / 2 + 1, end);
            inv += merge(arr, start, (start + end) / 2, end);
        }
        return inv;
    }

    private long merge(int[] arr, int start, int mid, int end) {

        int l = start, r = mid + 1, s = 0;
        long inv = 0;
        int[] sorted = new int[end + 1 - start];

        while (l <= mid || r <= end) {
            if (l > mid) sorted[s++] = arr[r++];
            else if (r > end) sorted[s++] = arr[l++];
            else if (arr[l] < arr[r]) sorted[s++] = arr[l++];
            else {
                sorted[s++] = arr[r++];
                inv += mid - l + 1;
            }
        }
        if (end + 1 - start >= 0) System.arraycopy(sorted, 0, arr, start, end + 1 - start);
        return inv;
    }
}
