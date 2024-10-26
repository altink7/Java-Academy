package at.altin.strukturierteprogrammierung.class7_arrays_and_functions;

import java.util.Scanner;

public class ScaleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 55, -4, 0, 3, 22};
        int[] arr2 = {1, 11, -4, 0, 3};

        int scale = sc.nextInt();

        scaleArray(arr, scale);
        scaleArray(arr2, scale);

        print(arr);


        sc.close();
    }

    public static void print(int[] arr) {
        for (int e : arr)
            System.out.printf("%d ", e);
    }

    public static void scaleArray(int[] array, int scale) {
        for(int i=0; i < array.length; i++)
            array[i] *= scale;
    }
}
