package at.altin.strukturierteprogrammierung.review_class6;

public class ArrayFunctionsDemo {
    public static void main(String[] args) {
        double[] a = new double[5];
        double[] b = new double[5];
        linearFill(a, 2.1, 3.1);
        linearFill(b, 0, 5);

        // print(a);
        // System.out.println();
        // print(b);


        int[] arr = new int[]{ 1, 0, 0, 10, 65, 11};
        boolean c = contains(arr, 5);
        System.out.println(c);

//        double v1 = 5.4;
//        print(v1);
//        System.out.println(v1);

    }

    private static void print(double[] a) {
        for(double e : a) {
            System.out.printf("%.2f\n", e);
        }
    }

    private static void print(double v) {
        v += 1;
        System.out.println(v);
    }

    public static void linearFill(double[] array, double start, double inc) {
        double value = start;
        for(int i=0; i < array.length; i++){
            array[i] = value;
            value += inc;
        }
    }

    public static boolean contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return true;
        }

        return false;
    }
}
