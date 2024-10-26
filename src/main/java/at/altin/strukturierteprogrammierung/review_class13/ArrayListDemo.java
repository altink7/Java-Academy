package at.altin.strukturierteprogrammierung.review_class13;

import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[2];

        while(true){
            String s = sc.nextLine();
            if(s.equals("-"))
                break;

            arr = add(arr, s);
        }

        print(arr);
    }

    private static String[] add(String[] array, String s) {
        if(array[array.length-1] != null) {
            String[] tmp = new String[array.length*2];
            for (int i = 0; i < array.length; i++) {
                tmp[i] = array[i];
            }
            array = tmp;
        }

        for(int i = 0; i< array.length; i++){
            if(array[i] == null) {
                array[i] = s;
                return array;
            }
        }

        return array;
    }

    private static void print(String[] arr) {
        for (String s : arr) {
            if(s == null)
                break;
            System.out.println(s);
        }
    }
}
