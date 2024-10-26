package at.altin.strukturierteprogrammierung.self_study_j_compound_data_types.search_and_sort;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = testData(sc.nextInt(), sc.nextInt(), sc.nextInt());
        insertion(a);
        sc.close();
    }

    public static int[] testData(int size, int max, int seed) {
        int[] a = new int[size];
        Random r = new Random(seed);
        for (int i = 0; i < a.length; i++)
            a[i] = r.nextInt(max);
        return a;
    }

    public static void insertion(int numbers[]) {
        print(numbers, numbers.length, -1);
        print(numbers, 0, -1);
        /* i is the first idx of unsorted partition */
        for (int i = 1; i < numbers.length; i++) {
            int j = i;
            /* tmp holds value of next element to insert */
            int tmp = numbers[i];
            /* find correct position for tmp */
            while (j > 0 && tmp < numbers[j - 1]) {
                /* on the way there shift right */
                numbers[j] = numbers[j - 1];
                j--;
            }
            numbers[j] = tmp;
            print(numbers, i, j);
        }
        print(numbers, numbers.length, -1);
    }

    private static void print(int[] numbers, int idx, int insert) {
        for(int i=0; i < numbers.length; i++) {
            if(i == idx)
                System.out.printf(" %02d| ", numbers[i]);
            else if(i == insert)
                System.out.printf("(%02d) ", numbers[i]);
            else if (i <= idx + 1)
                System.out.printf(" %02d  ", numbers[i]);
            else
                System.out.printf("  .  ");
        }
        System.out.println();
    }


}
