package at.altin.fh.e.walker;

import java.util.Arrays;
import java.util.Scanner;

public class Walker {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        char[][] feld = getCharFields();
        int[] koordinaten = definiereStartpunkt();

        while (true) {
            System.out.print("type direction: ");
            String direction = scanner.nextLine();
            checkKoordinatenforDirection(direction, koordinaten);

            // ausbreche kondition
            if (checkIfQuit(direction, feld, koordinaten)){
                break;
            }
        }

        scanner.close();
    }

    private static void checkKoordinatenforDirection(String direction, int[] koordinaten) {
        switch (direction) {
            case "w":
                checkMinus(koordinaten, 0);
                break;
            case "s":
                checkPlus(koordinaten, 0);
                break;
            case "a":
                checkMinus(koordinaten, 1);
                break;
            case "d":
                checkPlus(koordinaten, 1);
                break;
            default:
                printError();
                break;
        }
    }

    private static void checkPlus(int[] koordinaten, int x) {
        if (koordinaten[x] < 9) {
            koordinaten[x]++;
        }else {
            printError();
        }
    }

    private static void printError() {
        System.out.println("Falsche Eingabe");
    }

    private static void checkMinus(int[] koordinaten, int x) {
        if (koordinaten[x] > 0) {
            koordinaten[x]--;
        }
    }

    private static boolean checkIfQuit(String direction, char[][] feld, int[] koordinaten) {
        if(direction.equals("0")) {
            return true;
        } else {
            printField(feld, koordinaten);
        }
        return false;
    }

    private static int[]  definiereStartpunkt() {
        int[] startPunkt = new int[2];
        startPunkt[0] = 9;
        return startPunkt;
    }


    private static char[][] getCharFields() {
        char[][] feld = new char[10][10];
        for (char[] chars : feld) {
            Arrays.fill(chars, '-');
        }
        return feld;
    }

    private static void printField(char[][] feld, int[] koordinaten) {
        for (int j = 0; j < feld.length; j++) {
            for (int i = 0; i < feld[j].length; i++) {
                if (i == koordinaten[1] && j == koordinaten[0]) {
                    System.out.print("X");
                } else {
                    System.out.print(feld[j][i]);
                }
            }
            System.out.println();
        }
    }

}
