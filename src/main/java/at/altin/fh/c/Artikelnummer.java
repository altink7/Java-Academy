package at.altin.fh.c;

import java.util.Scanner;

public class Artikelnummer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("type Artikelgruppe:");

        int artikelgruppe = scanner.nextInt();

        switch (artikelgruppe) {
            case 1:
                System.out.print("type Untergruppe from Getraenke:");
                int getraenke = scanner.nextInt();

                switch (getraenke) {
                    case 1: {
                        System.out.print("type bier:");
                        int artikel = scanner.nextInt();

                        switch (artikel) {
                            case 1:
                                System.out.println("# Bier (hell, 0.5) #");
                                break;
                            case 2:
                                System.out.println("# Bier (hell, 0.33) #");
                                break;
                            case 3:
                                System.out.println("# Zwickel (0.5) #");
                                break;
                            case 4:
                                System.out.println("# Zwickel (0.33) #");
                                break;
                        }

                        break;
                    }
                    case 2: {
                        System.out.print("type non-alk:");
                        int artikel = scanner.nextInt();

                        if (artikel == 1) {
                            System.out.println("# Cola #");
                        } else if (artikel == 2) {
                            System.out.println("# Fanta #");
                        }

                        break;
                    }
                    case 3: {
                        System.out.print("type wein:");
                        int artikel = scanner.nextInt();

                        if (artikel == 1) {
                            System.out.println("# Rotwein #");
                        } else if (artikel == 2) {
                            System.out.println("# Weisser Spritzer #");
                        }

                        break;
                    }
                }
                break;
            case 2:
                System.out.print("type Untergruppe from Speisen:");
                int speisen = scanner.nextInt();

                switch (speisen) {
                    case 1: {
                        System.out.print("type klassisch:");
                        int artikel = scanner.nextInt();

                        switch (artikel) {
                            case 1:
                                System.out.println("# Schnitzel #");
                                break;
                            case 2:
                                System.out.println("# Schweinsbraten #");
                                break;
                        }

                        break;
                    }
                    case 2: {
                        System.out.print("type kl. speisen:");
                        int artikel = scanner.nextInt();
                        if (artikel == 1) {
                            System.out.println("# Frankfurter #");
                        }

                        break;
                    }
                    case 9: {
                        System.out.print("type extra:");
                        int artikel = scanner.nextInt();

                        if (artikel == 1) {
                            System.out.println("# Ketchup #");
                        }

                        break;
                    }
                }
                break;
            case 3:
                System.out.print("type Untergruppe von Sonstiges:");
                int sonstiges = scanner.nextInt();

                if (sonstiges == 1) {
                    System.out.print("type sonstiges:");
                    int artikel = scanner.nextInt();

                    if (artikel == 1) {
                        System.out.println("# Zigaretten #");
                    }
                }
                break;
            default: //TODO: bei jeder Verschachtelung eventuell
                System.out.println("Falsche Eingabe");
                break;
        }

        System.out.println("Good Bye!");


        scanner.close();

    }
}
