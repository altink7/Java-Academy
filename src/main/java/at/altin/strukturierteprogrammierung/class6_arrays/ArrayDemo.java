package at.altin.strukturierteprogrammierung.class6_arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        //int[] arr = new int[5];
        int[] arr = new int[] {1, 2, 3, 4, 5, 6, 1, 2, 1, 0};

        // count in a loop how many 1's are in the arr
        int counter = count(arr, 1);

        System.out.println(counter);








        //int[] arr = createArray(1, 1, 5);

        int[] arr2 = createArray(-2, 11);

        //print every second element of the array
        //printEverySecondElement(arr);

        printArray(arr2);
    }

    private static int count(int[] arr, int value) {
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                counter++;
            }
        }
        return counter;
    }

    private static boolean contains(int[] arr, int value) {
        int counter = 0;
        for(int i = 0; i < arr.length; i++){
            if (arr[i] == value){
                return true;
            }
        }

        return false;
    }

    public static int[] createArray(int length) {
        return createArray(0, 1, length);
    }

    public static int[] createArray(int increment, int length) {
        return createArray(0, increment, length);
    }

    public static int[] createArray(int start, int increment, int length) {
        int[] sequence = new int[length];

        int value = start;
        for (int i=0; i < sequence.length; i++) {
            sequence[i] = value;
            value += increment;
        }

        return sequence;
    }

    private static void printEverySecondElement(int[] arr) {
        for (int i = 1; i < arr.length; i += 2) {
            System.out.printf("[%d]: %d\n", i, arr[i]);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("[%d]: %d\n", i, arr[i]);
        }

        /*int i = 0;
        for (int element : arr) {
            System.out.printf("[%d]: %d\n", i, arr[i]);
            i++;
        }*/
    }
}
