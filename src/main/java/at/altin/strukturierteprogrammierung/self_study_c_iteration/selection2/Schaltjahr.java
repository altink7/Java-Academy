package at.altin.strukturierteprogrammierung.self_study_c_iteration.selection2;

import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte Jahr eingeben: ");
        int year = sc.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
            System.out.printf("Das Jahr %d ist ein Schaltjahr.", year);
        else
            System.out.printf("Das Jahr %d ist kein Schaltjahr.", year);

        sc.close();
    }
}
