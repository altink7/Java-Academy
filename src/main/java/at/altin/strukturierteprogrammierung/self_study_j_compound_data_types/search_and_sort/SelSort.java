package at.altin.strukturierteprogrammierung.self_study_j_compound_data_types.search_and_sort;

import java.util.Scanner;

public class SelSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[1024];
        System.out.print("Enter numbers: ");
        int i;
        for(i=0; i < arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0)
                break;
        }
        System.out.println();
        selection_sort(arr, i);

        sc.close();
    }

    public static void selection_sort(int a[], int N){
        int comps = 0;
        int swaps = 0;
        for(int i = 0; i < N-1; i++) {
            int min = i;
            for(int j = i+1; j < N; j++) { // Suche kleinstes El.
                comps++;
                if (a[j] < a[min])
                    min = j; // merke Position des kleinsten El.
            }
            System.out.printf("Step %d: ", i+1);
            print(a, i, min, N);
            int t = a[min]; // Tausch
            a[min] = a[i];
            a[i] = t;
            swaps++;
        }
        System.out.printf("Result: ");
        print(a, -1, -1, N);
        System.out.printf("\nNumber of comparisons: %d\n",comps);
        System.out.printf("Number of swaps: %d\n", swaps);
    }

    private static void print(int[] a, int idx, int min, int N) {

        for(int i = 0; i < N; i++) {
            if(i == idx && i == min)
                System.out.printf("[(%d)] ", a[i]);
            else if(i == idx)
                System.out.printf("(%d) ", a[i]);
            else if(i == min)
                System.out.printf("[%d] ", a[i]);
            else
                System.out.printf("%d ", a[i]);
        }
        System.out.println();
    }
}
