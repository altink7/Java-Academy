package at.altin.strukturierteprogrammierung.review_class8;

import java.util.Scanner;

public class Minesweeper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[][] minefield = new boolean[10][10];
        char[][] displayedField =  new char[10][10];
        for(int i=0; i < displayedField.length; i++) {
            for(int j=0; j < displayedField[i].length; j++) {
                displayedField[i][j] = ' ';
            }
        }

        int count = 0;
        while (count < 10) {
            int row = (int)(Math.random() * minefield.length);
            int col = (int)(Math.random() * minefield[0].length);

            if(minefield[row][col] == true)
                continue;

            minefield[row][col] = true;
            count++;
        }

        print(displayedField);

        while(true) {
            System.out.print("\nSelect field (row column): ");
            int row = sc.nextInt();
            int column = sc.nextInt();

            boolean isMine = checkField(minefield, row, column, displayedField);

            print(displayedField);

            if (isMine)
                break;
        }

        sc.close();
    }

    private static boolean checkField(boolean[][] minefield, int row, int column, char[][] displayedField) {
        if(displayedField[row][column] != ' ')
            return false;

        if(minefield[row][column] == true) {
            displayedField[row][column] = 'X';
            return true;
        }

        int count = 0;
        for(int i=row-1; i <= row+1; i++) {
            for(int j=column-1; j <= column+1; j++) {
                if(i >= 0 && i < displayedField.length && j >= 0 && j < displayedField[0].length && minefield[i][j] == true)
                    count++;
            }
        }

        displayedField[row][column] = '0';
        displayedField[row][column] += count;

        if(count == 0) {
            for(int i=row-1; i <= row+1; i++) {
                for(int j=column-1; j <= column+1; j++) {
                    if(i >= 0 && i < displayedField.length && j >= 0 && j < displayedField[0].length)
                        checkField(minefield, i, j, displayedField);
                }
            }
        }
        return false;
    }

    private static void print(char[][] arr) {
        System.out.printf("  ");
        for(int i=0; i < arr.length; i++) {
            System.out.printf(" %d ", i);
        }
        System.out.println();

        for(int i=0; i < arr.length; i++) {
            System.out.printf("%d ", i);
            for(int j=0; j < arr[i].length; j++) {
                System.out.printf("[%s]", arr[i][j]);
            }
            System.out.println();
        }
    }

    private static void print(boolean[][] minefield) {
        for(int i=0; i < minefield.length; i++) {
            for(int j=0; j < minefield[i].length; j++) {
                System.out.printf("%d ", minefield[i][j] == true ? 1 : 0);
            }
            System.out.println();
        }
    }
}
