package at.altin.strukturierteprogrammierung.class9_sort_and_search;

import java.util.Scanner;

public class SearchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //int n = 10;
        //int[] forward = getArray(n, "linear");

        int[] arr = new int[] {1, 2, 4, 5, 7, 11, 12, 33, 45, 77};
        print(arr);
        int idx = binarySearch(arr, 45);
        //System.out.println(idx);
        idx = linearSearch(arr, 45);
        //System.out.println(idx);



        sc.close();
    }

    public static int linearSearch(int sortedArray[], int x) {
        for(int i=0; i < sortedArray.length; i++){
            if(sortedArray[i] == x){
                System.out.printf("Linear Search: Found %d at index %d after %d comparisons.\n", x, i, i);
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int sortedArray[], int x) {
        int count = 0;
        int l = 0;
        int r = sortedArray.length - 1;
        while (l <= r) {
            count++;
            int m = l + (r - l) / 2;
            // Check if value x is found at position m
            if (sortedArray[m] == x){
                System.out.printf("Binary Search: Found %d at index %d after %d comparisons.\n", x, m, count);
                return m;
            }
            // If x is greater, ignore left half
            if (sortedArray[m] < x){
                l = m + 1;
            }
            // If x is smaller, ignore right half
            else{
                r= m - 1;
            }
        }
        // if the value x is not in the array we end up here
        return -1;
    }

    private static void print(int[] arr) {
        for(int e : arr)
            System.out.printf("%3d ", e);
        System.out.println();
    }

    public static int[] getArray(int n, String type){
        int[] arr = new int[n];
        for(int i=0; i < n; i++) {
            switch (type) {
                case "linear":
                    arr[i] = i;
                    break;
                case "reverse":
                    arr[i] = n-1-i;
                    break;
                case "random":
                    arr[i] = (int)(Math.random() * n);
            }
        }
        return arr;
    }


}
