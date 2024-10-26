package at.altin.strukturierteprogrammierung.review_class3;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // ask for input until it is a value between 1 and 10
        while (n < 1 || n > 10) {
            System.out.print("Please enter value between 1 and 10: ");
            n = sc.nextInt();
        }

        System.out.println(n);

        /*for (int i = n; i >= 0; i -= 2) {
            System.out.println(i);
        }

        int i = n;
        while (i >= 0) {
            System.out.println(i);
            i -= 2;
        }*/

        sc.close();
    }
}
