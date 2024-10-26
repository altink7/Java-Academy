package at.altin.strukturierteprogrammierung.self_study_e_functions.recursion;

import java.util.Scanner;

public class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        countdown(sc.nextInt());

        countdown2(sc.nextInt());

        sc.close();
    }

    private static void countdown(int n) {
        if (n < 0) {
            System.out.println("boom!");
            //return;
        }
        else {
            System.out.println(n);
            countdown(n-1);
        }
    }

    private static void countdown2(int n) {
        System.out.println(n);

        if (n <= 0) {
            return;
        }

        countdown2(n-1);
        System.out.println(n);
    }
}
