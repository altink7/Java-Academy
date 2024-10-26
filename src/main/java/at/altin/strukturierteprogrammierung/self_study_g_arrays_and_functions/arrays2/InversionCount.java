package at.altin.strukturierteprogrammierung.self_study_g_arrays_and_functions.arrays2;

import java.util.Scanner;

public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for(int i = 0; i<n; i++) {
            a[i] = sc.nextInt();
        }

        int cnt=0;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if (a[i] > a[j]) {
                    b[i]++;
                    cnt++;
                }
            }
        }
        System.out.printf("%d inversions.\n", cnt);

        for(int i=0; i<n; i++)
            System.out.printf("%2d ", a[i]);
        System.out.printf("\n");
        for(int i=0; i<n; i++)
            System.out.printf("%2d ", b[i]);

        sc.close();
    }
}

