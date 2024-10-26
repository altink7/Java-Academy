package at.altin.strukturierteprogrammierung.class6_arrays;

import java.util.Scanner;

public class ArrayLinearFill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] sequence;

        System.out.printf(": ");
        // first value to fill in sequence[0]
        int start=sc.nextInt();

        System.out.printf(": ");
        // increase start value by this to fill in sequence[1]
        int inkrement=sc.nextInt();

        System.out.printf(": ");
        // size of the array
        int len=sc.nextInt();

        /*     DO NOT TOUCH CODE ABOVE THIS LINE   */

        sequence = new int[len];

        int value = start;
        for (int i=0; i < sequence.length; i++) {
            sequence[i] = value;
            value += inkrement;
        }










        /*     DO NOT TOUCH CODE BELOW THIS LINE   */

        print(sequence);
        sc.close();


    }

    public static void print(int[] a){
        for (int n : a)
            System.out.printf("%d ", n);
    }
}
