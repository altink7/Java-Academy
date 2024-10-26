package at.altin.strukturierteprogrammierung.class7_arrays_and_functions;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int [] arr = getLinearFillArray(sc);
        //int[] arr = getRandomFillArray(sc);
        int[] arr = {1, 20, 3, -4, 10};

        print(arr);

        System.out.print(": ");
        int scale = sc.nextInt();
        scaleArray(arr, scale);
        print(arr);

        System.out.print(": ");
        int v = sc.nextInt();
        System.out.printf("%d is in array: %s\n", v, contains(arr, v));
        System.out.printf("Index of %d: %d\n", v, find(arr, v));
        System.out.printf("Values below %d: %d\n", v, countBelow(arr, v));


        sc.close();
    }

    private static int countBelow(int[] arr, int v) {
        int cnt=0;
        for(int e : arr) {
            if (e < v) {
                cnt++;
            }
        }
        return cnt;
    }

    private static int find(int[] arr, int v) {
        for(int i=0; i < arr.length; i++){
            if (arr[i] == v)
                return i;
        }
        return -1;
    }

    private static boolean contains(int[] arr, int v) {
        for(int e : arr) {
            if (e == v)
                return true;
        }
        return false;
    }

    private static int[] getLinearFillArray(Scanner sc) {
        System.out.printf(": ");
        // first value to fill in sequence[0]
        int start= sc.nextInt();

        System.out.printf(": ");
        // increase start value by this to fill in sequence[1]
        int inkrement= sc.nextInt();

        System.out.printf(": ");
        // size of the array
        int len= sc.nextInt();

        int[] sequence = new int[len];

        int value = start;
        for (int i=0; i < sequence.length; i++) {
            sequence[i] = value;
            value += inkrement;
        }

        return sequence;
    }

    private static int[] getRandomFillArray(Scanner sc) {
        System.out.printf("Länge: ");
        // size of the array
        int len= sc.nextInt();

        System.out.printf("Maximal Wert: ");
        // size of the array
        int max= sc.nextInt();

        int[] sequence = new int[len];

        for (int i=0; i < sequence.length; i++) {
            sequence[i] = (int)(Math.random() * max);
        }

        return sequence;
    }

    public static void print(int[] arr) {
        for (int e : arr)
            System.out.printf("%d ", e);
        System.out.println();
    }

    public static void scaleArray(int[] array, int scale) {
        for(int i=0; i < array.length; i++)
            array[i] *= scale;
    }
}
