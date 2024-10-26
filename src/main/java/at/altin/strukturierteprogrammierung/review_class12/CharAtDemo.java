package at.altin.strukturierteprogrammierung.review_class12;

import java.util.Scanner;

public class CharAtDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        for (String word : words) {
            revertString(word);
            System.out.print(" ");
        }
    }

    private static void revertString(String s) {
        for(int i = s.length() - 1; i >= 0; i--){
            System.out.print(s.charAt(i));
        }
    }
}
