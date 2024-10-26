package at.altin.strukturierteprogrammierung.review_class5;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] werte = new int[10];

        werte[4] = 67;

        for(int i=0; i < werte.length; i++) {
            werte[i] = i;
        }

        printArray(werte);

        int[] werte2 = new int[] {1, 2, 3, 4, 5, 6};

        printArray(werte2);

        int[] inputArr = readArrayFromConsole(sc);
        printArray(inputArr);

        sc.close();
    }

    private static int[] readArrayFromConsole(Scanner sc) {
        int[] arr = new int[0];

        while(true) {
            System.out.print("Input: ");
            int in = sc.nextInt();
            if (in == 0)
                return arr;

            arr = resizeArrayAndAddNewElement(arr, in);
        }
    }

    private static int[] resizeArrayAndAddNewElement(int[] arr, int in) {
        int[] tmp = new int[arr.length+1];
        for (int i = 0; i < arr.length; i++){
            tmp[i] = arr[i];
        }
        tmp[tmp.length-1] = in;

        arr = tmp;
        return arr;
    }

    private static void printArray(int[] werte) {
        for (int i = 0; i < werte.length; i++) {
            System.out.printf("[%d]: %d\n", i, werte[i]);
        }
    }
}
