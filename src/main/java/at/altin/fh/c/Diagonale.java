package at.altin.fh.c;

import java.util.Scanner;

public class Diagonale implements Runnable {

    public static final char DIAGONAL_SYMBOL = '*';
    public static final char STANDARD_SYMBOL = '-';

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(": ");
        int seitenLaenge = scanner.nextInt();


        while (seitenLaenge % 2 == 0 || seitenLaenge <= 1) {
            System.out.println("bitte eine gueltige zahl eingeben!");
            System.out.print(": ");
            seitenLaenge = scanner.nextInt();
        }

        int linkeSeite = seitenLaenge; // sterne von links
        int rechteSeite = seitenLaenge; // sterne von rechts

        for(int i = seitenLaenge; i > 0; i--) {
            for(int j = seitenLaenge; j>0; j--) {
                char symbol =  (linkeSeite-j==0) || rechteSeite -linkeSeite == j-1 ? DIAGONAL_SYMBOL : STANDARD_SYMBOL;
                System.out.print(symbol);
            }

            System.out.println("\n");
            linkeSeite--;
        }

        scanner.close();
    }


    @Override
    public void run() {
        main(null);
    }
}
