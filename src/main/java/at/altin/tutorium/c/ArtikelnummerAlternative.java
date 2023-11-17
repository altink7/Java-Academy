package at.altin.tutorium.c;

import java.util.Scanner;

public class ArtikelnummerAlternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int getraenk;
        int untergruppe=0;
        int artikel=0;
        boolean falsch = false;

        System.out.print(": ");
        getraenk = scanner.nextInt();

        if (getraenk < 1 || getraenk > 3) {
            falsch = true;
        }

        if (!falsch) {
            System.out.print(": ");
            untergruppe = scanner.nextInt();
        }

        if ((getraenk == 1 && (untergruppe < 1 || untergruppe > 3)) ||
                (getraenk == 2 && untergruppe != 1 && untergruppe != 2 && untergruppe != 9) ||
                (getraenk == 3 && untergruppe != 1)) {
            falsch = true;
        }

        if (!falsch) {
            System.out.print(": ");
            artikel = scanner.nextInt();
        }

        if (getraenk == 1) {
            if (untergruppe == 1 && artikel == 1) {
                System.out.println("Bier (hell, 0,5)");
            }
            else if (untergruppe == 1 && artikel == 2) {
                System.out.println("Bier (hell, 0,33)");
            }
            else if (untergruppe == 1 && artikel == 3) {
                System.out.println("Zwickel (0,5)");
            }
            else if (untergruppe == 1 && artikel == 4) {
                System.out.println("Zwickel (0,33)");
            }
            else if (untergruppe == 2 && artikel == 1) {
                System.out.println("Cola");
            }
            else if (untergruppe == 2 && artikel == 2) {
                System.out.println("Fanta");
            }
            else if (untergruppe == 3 && artikel == 1) {
                System.out.println("Rotwein");
            }
            else if (untergruppe == 3 && artikel == 2) {
                System.out.println("Weisser Spritzer");
            } else {
                falsch = true;
            }

        } else if (getraenk == 2) {
            if (untergruppe == 1 && artikel == 1) {
                System.out.println("Schnitzel");
            } else if (untergruppe == 1 && artikel == 2) {
                System.out.println("Schweinsbraten");
            }
            else if (untergruppe == 2 && artikel == 1) {
                System.out.println("Frankfurter");
            }
            else if (untergruppe == 9 && artikel == 1) {
                System.out.println("Ketchup");
            } else {
                falsch = true;
            }
        } else if (getraenk == 3) {
            if (untergruppe == 1 && artikel == 1) {
                System.out.println("Zigaretten");
            } else
                falsch = true;
        }

        if (falsch) {
            System.out.println("Falsche Eingabe");
        }

        scanner.close();
    }
}
