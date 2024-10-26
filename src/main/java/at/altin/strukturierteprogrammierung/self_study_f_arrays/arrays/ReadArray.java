package at.altin.strukturierteprogrammierung.self_study_f_arrays.arrays;

import java.util.Scanner;

public class ReadArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        for (int i=0; i < a.length; i++){
            System.out.print(i + ". number: ");
            a[i] = sc.nextInt();
        }
        System.out.println("Input finished.");

        for(int i=0; i < a.length; i++) {
            System.out.printf("[%d]: %d\n", i, a[i]);
        }
        System.out.println("Output finished.");

        sc.close();
    }
}
