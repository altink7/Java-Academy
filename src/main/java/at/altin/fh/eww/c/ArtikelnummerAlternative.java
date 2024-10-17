package at.altin.fh.eww.c;

import java.util.Scanner;

public class ArtikelnummerAlternative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int artikelgruppe;
        int untergruppe=0;
        int artikel=0;
        boolean falsch = false;

        System.out.print(": ");
        artikelgruppe = scanner.nextInt();

        if (artikelgruppe < 1 || artikelgruppe > 3) {
            falsch = true;
        }

        if (!falsch) {
            System.out.print(": ");
            untergruppe = scanner.nextInt();
        }

        if ((artikelgruppe == 1 && (untergruppe < 1 || untergruppe > 3)) ||
                (artikelgruppe == 2 && untergruppe != 1 && untergruppe != 2 && untergruppe != 9) ||
                (artikelgruppe == 3 && untergruppe != 1)) {
            falsch = true;
        }

        if (!falsch) {
            System.out.print(": ");
            artikel = scanner.nextInt();
        }

        if (artikelgruppe == 1) {
            falsch = runArtikelGruppeandCheck(untergruppe, artikel, falsch);

        } else if (artikelgruppe == 2) {
            falsch = runEssenAndCheck(untergruppe, artikel, falsch);
        } else if (artikelgruppe == 3) {
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

    private static boolean runEssenAndCheck(int untergruppe, int artikel, boolean falsch) {
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
        return falsch;
    }

    private static boolean runArtikelGruppeandCheck(int untergruppe, int artikel, boolean falsch) {
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
        return falsch;
    }
}
