package at.altin.strukturierteprogrammierung.self_study_c_iteration.selection2;

import java.util.Scanner;

public class Artikelnummern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int g, u=0, a=0;
        boolean falsch = false;

        System.out.printf(": ");
        g = sc.nextInt();

        if (g < 1 || g > 3) {
            falsch = true;
        }

        if (!falsch) {
            System.out.printf(": ");
            u = sc.nextInt();
        }

        if (    (g == 1 && (u < 1 || u > 3)) ||
                (g == 2 && u != 1 && u != 2 && u != 9) ||
                (g == 3 && u != 1)
        ) {
            falsch = true;
        }

        if (!falsch) {
            System.out.printf(": ");
            a = sc.nextInt();
        }

        if (g == 1) {
            if (u == 1 && a == 1)
                System.out.println("Bier (hell, 0,5)");
            else if (u == 1 && a == 2)
                System.out.println("Bier (hell, 0,33)");
            else if (u == 1 && a == 3)
                System.out.println("Zwickel (0,5)");
            else if (u == 1 && a == 4)
                System.out.println("Zwickel (0,33)");

            else if (u == 2 && a == 1)
                System.out.println("Cola");
            else if (u == 2 && a == 2)
                System.out.println("Fanta");

            else if (u == 3 && a == 1)
                System.out.println("Rotwein");
            else if (u == 3 && a == 2)
                System.out.println("Weisser Spritzer");
            else
                falsch = true;
        } else if (g == 2) {
            if (u == 1 && a == 1)
                System.out.println("Schnitzel");
            else if (u == 1 && a == 2)
                System.out.println("Schweinsbraten");
            else if (u == 2 && a == 1)
                System.out.println("Frankfurter");
            else if (u == 9 && a == 1)
                System.out.println("Ketchup");
            else
                falsch = true;
        } else if (g == 3) {
            if (u == 1 && a == 1)
                System.out.println("Zigaretten");
            else
                falsch = true;
        }

        if (falsch) {
            System.out.println("Falsche Eingabe");
        }

        sc.close();
    }
}
