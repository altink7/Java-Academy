package at.altin.strukturierteprogrammierung.review_class13;

import java.util.Scanner;

class ArrayList {
    String[] data = new String[2];
    int size = 0;
}

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList arr = new ArrayList();

        while(true){
            String s = sc.nextLine();
            if(s.equals("-"))
                break;

            add(arr, s);
        }

        print(arr);

        remove(arr, 1);
        System.out.println();
        print(arr);
    }

    private static void add(ArrayList list, String s) {
        String[] array = list.data;
        if(array[array.length-1] != null) {
            String[] tmp = new String[array.length*2];
            for (int i = 0; i < array.length; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
            list.data = array;
        }

        array[list.size] = s;
        list.size++;
    }

    private static void remove(ArrayList list, int idx){
        String[] arr = list.data;
        for (int i = idx; i < list.size-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[list.size] = null;
        list.size--;
    }

    private static void print(ArrayList arr) {
        for (int i=0; i < arr.size; i++) {
            System.out.println(arr.data[i]);
        }
    }
}
