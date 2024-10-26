package at.altin.strukturierteprogrammierung.self_study_e_functions.iteration3;

import java.util.Scanner;

public class Rechengitter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Anzahl Spalten: ");
        int colomns = sc.nextInt();

        System.out.printf("Anzahl Zeilen: ");
        int rows = sc.nextInt();

        System.out.printf("  + |");
        for(int i=1; i<=colomns; i++)
            System.out.printf(" %2d ", i);
        System.out.printf("\n");

        for(int i=0; i<=4*(colomns+1); i++)
            System.out.printf("-");
        System.out.printf("\n");

        for(int i=1; i<=rows; i++) {
            System.out.printf("  %2d|", i);
            for(int j=1; j<=colomns; j++)
                System.out.printf(" %2d ", i+j);
            System.out.printf("\n");
        }

        sc.close();
    }
}
