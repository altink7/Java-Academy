package at.altin.strukturierteprogrammierung.self_study_j_compound_data_types.search_and_sort;

import java.util.Random;
import java.util.Scanner;

public class SortIndex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] a = testData(sc.nextInt(), sc.nextInt(), sc.nextInt());

        print(a);
        int[] idx = sort(a);
        print(a);
        print(idx);
        sc.close();

    }

    private static int[] sort(int[] a) {
        int[] idxArr = new int[a.length];
        for(int i = 1; i < idxArr.length; i++) {
            idxArr[i] = i;
        }
        for (int i = 1; i < a.length; i++) {
            int j = i;
            /* tmp holds value of next element to insert */
            int tmp = a[i];
            int tmpIdx = idxArr[i];
            /* find correct position for tmp */
            while (j > 0 && tmp < a[j - 1]) {
                /* on the way there shift right */
                a[j] = a[j - 1];
                idxArr[j] = idxArr[j-1];
                j--;
            }
            a[j] = tmp;
            idxArr[j] = tmpIdx;
        }

        return idxArr;
    }

    private static void swap(int[] a, int i, int min) {
        int t = a[min]; // Tausch
        a[min] = a[i];
        a[i] = t;
    }

    public static void print(int[] a) {
        System.out.print("[");
        for (int n : a)
            System.out.printf("%2d ", n);
        System.out.println("]\n");
    }

    public static int[] testData(int size, int max, int seed) {
        int[] a = new int[size];
        Random r = new Random(seed);
        for (int i = 0; i < a.length; i++)
            a[i] = r.nextInt(max);
        return a;
    }
}
