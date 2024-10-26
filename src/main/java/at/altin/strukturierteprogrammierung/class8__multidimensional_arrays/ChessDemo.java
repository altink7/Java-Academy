package at.altin.strukturierteprogrammierung.class8__multidimensional_arrays;

import java.util.Scanner;

public class ChessDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char chessBoard[][]={
                {'r','s','l','q','k','l','s','r'},
                {'p','p','p','p','p','p','p','p'},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' '},
                {'P','P','P','P','P','P','P','P'},
                {'R','S','L','Q','K','L','S','R'}
        };

        print(chessBoard);
        System.out.println();

        while(true){
            System.out.println("From row: ");
            int rowFrom = sc.nextInt();
            System.out.println("From column: ");
            int columnFrom = sc.nextInt();
            System.out.println("To row: ");
            int rowTo = sc.nextInt();
            System.out.println("To column: ");
            int columnTo = sc.nextInt();

            move(chessBoard, rowFrom, columnFrom, rowTo, columnTo);
            print(chessBoard);
            System.out.println();
        }

    }

    private static void move(char[][] chessBoard, int rowFrom, int columnFrom, int rowTo, int columnTo) {
        char figure = chessBoard[rowFrom][columnFrom];
        chessBoard[rowFrom][columnFrom] = ' ';
        chessBoard[rowTo][columnTo] = figure;
    }

    private static void print(char[][] chessBoard) {
        for(int row=0; row < chessBoard.length; row++) {
            for(int column=0; column < chessBoard[row].length; column++) {
                System.out.print("[" + chessBoard[row][column] + "] ");
            }
            System.out.println();
        }
    }
}
