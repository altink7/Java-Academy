package at.altin.strukturierteprogrammierung.self_study_j_compound_data_types.search_and_sort;

import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = testData(sc.nextInt(), sc.nextInt(), sc.nextInt());
        print(a);
        quicksort(a);
        print(a);
        sc.close();
    }

    private static void print(int[] a) {
        for(int i=0; i < a.length; i++) {
            System.out.printf(" %02d  ", a[i]);
        }
        System.out.println();
    }


    public static int[] testData(int size, int max, int seed) {
        int[] a = new int[size];
        Random r = new Random(seed);
        for (int i = 0; i < a.length; i++)
            a[i] = r.nextInt(max);
        return a;
    }
    public static void swap(int arr[], int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void quicksort(int numbers[], int left, int right) {
        int i;
        if (right <= left)
            return;
        i = partition(numbers, left, right);
        quicksort(numbers, left, i - 1);
        quicksort(numbers, i + 1, right);
    }

    /* driver */
    public static void quicksort(int a[]) {
        quicksort(a, 0, a.length - 1);
    }

    public static int partition(int numbers[], int left, int right) {
        int i = left - 1, j = right, pivot = numbers[right];
        for (;;) {
            while (numbers[++i] < pivot)
                ;
            while (pivot < numbers[--j])
                if (j == left)
                    break;
            if (i >= j)
                break;
            swap(numbers, i, j);
            for(int ii=0; ii < numbers.length; ii++) {
                if(ii == right)
                    System.out.printf("[%02d] ", numbers[ii]);
                else if(ii < left || ii > right)
                    System.out.printf("  .  ", numbers[ii]);
                else if(ii == i || ii == j)
                    System.out.printf("(%02d) ", numbers[ii]);
                else
                    System.out.printf(" %02d  ", numbers[ii]);
            }
            System.out.println();
        }
        swap(numbers, i, right);
        for(int ii=0; ii < numbers.length; ii++) {
            if(ii < left || ii > right)
                System.out.printf("  .  ", numbers[ii]);
            else if(ii == i || ii == right)
                System.out.printf("<%02d> ", numbers[ii]);
            else
                System.out.printf(" %02d  ", numbers[ii]);
        }
        System.out.println();
        return i;
    }
}
