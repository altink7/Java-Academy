package at.altin.strukturierteprogrammierung.self_study_c_iteration.iteration;

import java.util.Scanner;

public class CountDown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(": ");
        int i = sc.nextInt();

        while (i > 0) {
            System.out.println(i);
            i--;
        }

        System.out.println("Boom!");

        sc.close();
    }
}
