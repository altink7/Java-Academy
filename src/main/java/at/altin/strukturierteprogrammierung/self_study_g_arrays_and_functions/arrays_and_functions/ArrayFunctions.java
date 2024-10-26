package at.altin.strukturierteprogrammierung.self_study_g_arrays_and_functions.arrays_and_functions;



import java.util.Scanner;


public class ArrayFunctions {

    private static final int LINEAR_FILL = 1;
    private static final int CONTAINS = 2;
    private static final int COUNT_BELOW = 3;
    private static final int FIND_1 = 4;
    private static final int FIND_2 = 5;
    private static final int FILTER = 6;


    public static void main(String[] args) {
        go();
    }

    public static void go() {
        Scanner sc = new Scanner(System.in);
        double[] dArr = {1,4,23.3,12.3,0.5,432.53,-123.34,34.12};
        int[][] iArr2 = {
                { 0 },
                { 10, 11 },
                { 20, 21, 22 },
                { 30, 31, 32, 33, 34, 35, 36, 37, 38, 39 },
                { 5, 8, 58, 85, 5, 8, 8, 5, 8, 5 },
                {900,800,700,600,500,400,300,200,100}
        };

        String[] strings;

        System.out.println("choose method to test \n(LINEAR_FILL = 1, "
                + "CONTAINS = 2, 	COUNT_BELOW = 3, "
                + "FIND_1 = 4, FIND_2 = 5, FILTER = 6)");

        while (true) {

            System.out.println(":");
            int choice = sc.nextInt();
            int n;
            switch (choice) {
                case LINEAR_FILL:
                    System.out.println("LinearFill");
                    System.out.println("enter array length, start value and inc value:");
                    linearFill(dArr = new double[sc.nextInt()],
                            sc.nextDouble(), sc.nextDouble());
                    display(dArr);
                    continue;

                case CONTAINS:
                    System.out.println("enter value to look for:");
                    System.out.println("contains: "
                            + contains(iArr2, n = sc.nextInt())
                            + " (" + n + ")");
                    continue;

                case COUNT_BELOW:
                    System.out.println("CountBelow");
                    System.out.println("enter boundary:");
                    System.out.printf("%d",
                            countBelow(dArr, sc.nextDouble()));

                    continue;

                case FIND_1:
                    System.out.println("enter value to find:");
                    System.out.println("find 1: "
                            + find(iArr2[3], n = sc.nextInt())
                            + " (" + n + ")");
                    continue;

                case FIND_2:
                    System.out.println("enter value to find and starting index:");
                    System.out.println("find 2: "
                            + find(iArr2[4], n = sc.nextInt(),
                            sc.nextInt()) + " (" + n + ")");
                    continue;

                case FILTER:
                    System.out.println("enter size of String array, and strings for each position:");
                    System.out.println("Filter");
                    strings = new String[sc.nextInt()];
                    for (int i = 0; i < strings.length; i++) {
                        String it;
                        System.out.print(": ");
                        while ((it = sc.nextLine()).equals(""))
                            ;
                        strings[i] = it;
                    }
                    System.out.print("enter regex: ");
                    String regex;
                    while ((regex = sc.nextLine()).equals(""))
                        ;
                    display(strings);
                    display(filter(strings, regex));

                    continue;

            }
            break;
        }

        sc.close();
    }


    public static void display(double[] d) {
        System.out.print("[");
        for (double i : d)
            System.out.printf("%.2f ", i);
        System.out.println("]");
    }

    public static void display(int[] d) {
        System.out.print("[");
        for (int i : d)
            System.out.printf("%3d ", i);
        System.out.println("]");
    }

    public static void display(String[] d) {
        System.out.print("[");
        for (String s : d)
            System.out.printf("%s ", s);
        System.out.println("]");

    }


    public static void linearFill(double[] arr, double start, double inc) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start;
            start += inc;
        }
    }


    public static int countBelow(double[] arr, double a) {
        int n = 0;

        for (int i=0; i < arr.length; i++) {
            if (arr[i] < a)
                n++;
        }

        // alternative Lösung mit for each Schleife
        //for (double e : arr) {
        //    if (e < a)
        //        n++;
        //}

        return n;
    }


    public static boolean contains(int[][] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == key)
                    return true;
            }
        }

        return false;
    }

    public static boolean contains(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return true;
        }

        return false;
    }

    public static int find(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == key)
                return i;
        }

        return -1;

        // alternative Lösung kann zweite find Funktion mit fi = 0 aufrufen
        //return find(arr, key, 0);
    }

    public static int find(int[] arr, int key, int fi) {
        int start = fi >= 0 ? fi : 0;
        for (int i = start; i < arr.length; i++){
            if (arr[i] == key)
                return i;
        }

        return -1;
    }


    public static String[] filter(String[] arr, String regex){

        int cnt=0;
        for (int i=0; i < arr.length; i++) {
            if(arr[i].matches(regex))
                cnt++;
        }

        String[] res=new String[cnt];
        int j=0;
        for (int i=0; i < arr.length; i++) {
            if(arr[i].matches(regex)) {
                res[j]=arr[i];
                j++;
            }
        }
        return res;


        // Alternative Lösung mit for each Schleifen
        /*int cnt=0;
        for (String s : arr) {
            if(s.matches(regex))
                cnt++;
        }

        String[] res=new String[cnt];
        int j=0;
        for (String s: arr){
            if(s.matches(regex)) {
                res[j]=s;
                j++;
            }
        }
        return res;*/
    }
}

