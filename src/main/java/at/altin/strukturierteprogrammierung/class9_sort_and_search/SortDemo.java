package at.altin.strukturierteprogrammierung.class9_sort_and_search;

import java.util.Scanner;

public class SortDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        compareSortPerformance();

        //int[] random = getArray(30, "random");
        //print(random);
        //quicksort(random);
        //print(random);

        sc.close();
    }

    private static void compareSortPerformance() {
        for(int n = 10; n <= 100000; n*=10){
            double bubble = 0;
            double insertion = 0;
            double selection = 0;
            double merge = 0;
            double quick = 0;

            for(int i=0; i < 10; i++){
                int[] random = getArray(n, "random");

                int[] copy = copy(random);
                long start = System.nanoTime();
                bubble(copy);
                bubble += System.nanoTime() - start;

                copy = copy(random);
                start = System.nanoTime();
                insertion(copy);
                insertion += System.nanoTime() - start;

                copy = copy(random);
                start = System.nanoTime();
                selection(copy);
                selection += System.nanoTime() - start;

                copy = copy(random);
                start = System.nanoTime();
                mergesort(copy);
                merge += System.nanoTime() - start;

                copy = copy(random);
                start = System.nanoTime();
                quicksort(copy);
                quick += System.nanoTime() - start;
            }

            System.out.printf("\n*** Sort Comparision (N=%d)***\n", n);
            System.out.printf("Bubble:    %20.0f ns (%6.1fx)\n", bubble / 10, bubble / quick);
            System.out.printf("Selection: %20.0f ns (%6.1fx)\n", selection / 10, selection / quick);
            System.out.printf("Insertion: %20.0f ns (%6.1fx)\n", insertion / 10, insertion / quick);
            System.out.printf("Merge:     %20.0f ns (%6.1fx)\n", merge / 10, merge / quick);
            System.out.printf("Quick:     %20.0f ns (%6.1fx)\n", quick / 10, quick / quick);
        }
    }

    private static int[] copy(int[] random) {
        int[] copy = new int[random.length];
        for(int i=0; i < copy.length; i++)
            copy[i] = random[i];
        return copy;
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

    public static void swap(int arr[], int i, int j) {
        // save the value at position i in tmp variable
        int tmp = arr[i];
        // override the value at position i with the value at position j
        arr[i] = arr[j];
        // override the value at position j with the tmp value
        arr[j] = tmp;
    }

    public static void bubble(int numbers[]) {
        boolean swapped;
        /* number of completed runs */
        int i=0;
        /* this loop is executed as long as there */
        /* was at least one swap operation performed */
        /* at maximum the loop is executed N-1 times */
        do {
            /* no swap operation was performed at the beginning of a run */
            swapped = false;
            /* with each run one more number is fixed and */
            /* has not to be checked in the next run (-i) */
            for (int j = 1; j < numbers.length - i; j++){
                /* if the left number is greater then swap */
                if (numbers[j - 1] > numbers[j]) {
                    swap(numbers, j - 1, j);
                    swapped = true;
                }
            }
            i++;
        } while (swapped);
    }

    public static void bubble(String name[]) {
        boolean swapped;
        int i=0;
        do {
            swapped = false;
            for (int j = 1; j < name.length - i; j++){
                // use compareTo function to get a distance between to strings
                // the distance is negative if name[j-1] is before name[j] in the alphabet,
                // positve if name[j-1] is after name[j] in the alphabet,
                // and 0 if they are the same.
                // for numbers similar methods exist like Float.compare() or Integer.compare()
                int distance = name[j-1].compareTo(name[j]);
                if (distance > 0) {
                    // swap operation without additional function (in this case for Strings)
                    String tmp = name[j-1];
                    name[j-1] = name[j];
                    name[j] = tmp;

                    swapped = true;
                }
            }
            i++;
        } while (swapped);
    }


    public static void insertion(int numbers[]) {
        /* i is the first idx of unsorted partition */
        for (int i=1; i<numbers.length; i++) {
            int j=i;
            /* tmp holds value of next element to insert */
            int tmp=numbers[i];
            /* find correct position for tmp */
            while (j>0 && tmp < numbers[j-1]) {
                /* on the way there shift right */
                numbers[j]=numbers[j-1];
                j--;
            }
            numbers[j]=tmp;
        }
    }

    public static void selection(int numbers[]) {
        int i, j;
        for (i = 0; i < numbers.length - 1; i++) {
            int min_idx = i;
            /* find idx of minimum of unsorted partition */
            for (j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[min_idx])
                    min_idx = j;
            }
            /* swap minimum to correct position */
            swap(numbers, i, min_idx);
        }
    }


    public static void mergesort(int[] a) {
        /* create an auxilliar array that is used be the merge function */
        int[] aux = new int[a.length];
        /* starts the mergesort by calling the recursive function mSort */
        mSort(a, 0, a.length - 1, aux);
    }

    public static void mSort(int numbers[], int left, int right, int[] aux) {
        /* stops the recursion when portion can't be splited further */
        if (right <= left) return;
        /* call mSort recursively with the left and the right split */
        int middle = (right + left) / 2;
        mSort(numbers, left, middle, aux);
        mSort(numbers, middle + 1, right, aux);
        /* merge is first executed for the smallest splits */
        merge(numbers, left, middle, right, aux);
    }

    public static void merge(int numbers[], int left, int middle, int right, int[] aux) {
        /* fill the helper array with the numbers between left and right */
        for (int i = left; i <= right; i++)
            aux[i] = numbers[i];
        /* the l counter starts at the left position and goes till the middle */
        int l = left;
        /* the r counter starts at the position middle+1 and goes till right position*/
        int r = middle+1;
        /* sorts the elements in the numbers array */
        for (int i = left; i <= right; i++){
            /* if the left element is smaller take it otherwise take */
            /* the right one and increase the respective counter */
            if (r > right || (l <= middle && aux[l] < aux[r]))
                numbers[i] = aux[l++];
            else
                numbers[i] = aux[r++];
        }
    }


    public static void quicksort(int numbers[]) {
        /* starts the quicksort algorithm */
        quicksort(numbers, 0, numbers.length-1);
    }

    public static void quicksort(int numbers[], int left, int right) {
        if (right<=left)
            return;
        /* partition returns the new position of the pivot element */
        int i=partition(numbers, left, right);
        //print(numbers);
        /* quicksort is then executed again for the left part ... */
        quicksort(numbers, left, i-1);
        /* ... and for the right part */
        quicksort(numbers, i+1, right);
    }

    public static int partition(int numbers[], int left, int right) {
        /* sorting an array of length 1 is trivial */
        if (left == right) return left;
        /* the right element is selected as pivot */
        int pivot = numbers[right];
        int i = left - 1, j = right; /* search indices from left and right */
        while (true) {
            /* search for the first element bigger then pivot from the left */
            while (numbers[++i] < pivot)
                ;
            /* search for the first element smaller then pivot from the right */
            while (pivot < numbers[--j])
                if (j == left) /* stop at left search index */
                    break;
            /* pivot positon is found and the loop is stopped */
            if (i >= j)
                break;
            /* swap the bigger element on the left side with */
            /* the smaller element on the right side */
            swap(numbers, i, j);
        }
        /* swap the pivot element */
        swap(numbers, i, right);
        /* return the new position of the pivot element */
        return i;
    }
}
