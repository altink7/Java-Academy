package at.altin.tutorium.c;

import java.util.Scanner;

public class Artikelnummer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("type Artikelgruppe:");

        int artikelgruppe = scanner.nextInt();

        if(artikelgruppe == 1) {
            System.out.print("type Untergruppe from Getraenke:");
            int getraenke = scanner.nextInt();

            if(getraenke == 1) {
                System.out.print("type bier:");
                int artikel = scanner.nextInt();

                if(artikel == 1) {
                    System.out.println("# Bier (hell, 0.5) #");
                } else if (artikel == 2) {
                    System.out.println("# Bier (hell, 0.33) #");
                } else if (artikel == 3) {
                    System.out.println("# Zwickel (0.5) #");
                } else if (artikel== 4) {
                    System.out.println("# Zwickel (0.33) #");
                }

            } else if (getraenke == 2) {
                System.out.print("type non-alk:");
                int artikel = scanner.nextInt();

                if(artikel == 1) {
                    System.out.println("# Cola #");
                } else if (artikel == 2) {
                    System.out.println("# Fanta #");
                }

            } else if (getraenke == 3){
                System.out.print("type wein:");
                int artikel = scanner.nextInt();

                if(artikel == 1) {
                    System.out.println("# Rotwein #");
                } else if (artikel == 2) {
                    System.out.println("# Weisser Spritzer #");
                }

            }

        } else if (artikelgruppe == 2) {
            System.out.print("type Untergruppe from Speisen:");
            int speisen = scanner.nextInt();

            if (speisen == 1) {
                System.out.print("type klassisch:");
                int artikel = scanner.nextInt();

                if(artikel == 1) {
                    System.out.println("# Schnitzel #");
                } else if (artikel == 2) {
                    System.out.println("# Schweinsbraten #");
                }

            } else if(speisen == 2) {
                System.out.print("type kl. speisen:");
                int artikel = scanner.nextInt();
                if(artikel == 1) {
                    System.out.println("# Frankfurter #");
                }

            } else if (speisen == 9) {
                System.out.print("type extra:");
                int artikel = scanner.nextInt();

                if(artikel == 1) {
                    System.out.println("# Ketchup #");
                }

            }

        } else if(artikelgruppe == 3) {
            System.out.print("type Untergruppe von Sonstiges:");
            int sonstiges = scanner.nextInt();

            if(sonstiges == 1){
                System.out.print("type sonstiges:");
                int artikel = scanner.nextInt();

                if(artikel == 1 ) {
                    System.out.println("# Zigaretten #");
                }
            }
        } else {
            System.out.println("Falsche Eingabe");
        }

        System.out.println("Good Bye!");


        scanner.close();

    }
}
