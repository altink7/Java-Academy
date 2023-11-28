package at.altin.tutorium.e.walker;

import java.util.Arrays;

public class Walker {

    public static void main(String[] args) {
        char[][] feld = new char[10][10];

        fillCharFields(feld);


        printField(feld);
    }


    private static void fillCharFields(char[][] feld) {
        for (char[] chars : feld) {
            Arrays.fill(chars, '-');
        }
    }
    private static void printField(char[][] feld) {
        for (char[] zeile : feld) {
            for (char spalte : zeile) {
                System.out.print(spalte);
            }
            System.out.print("\n");
        }
    }
}
