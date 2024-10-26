package at.altin.strukturierteprogrammierung.self_study_h_multidimensionale_arrays;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        playGame();
    }

    public static char[][] createField(){
        char[][] field = {
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'}
        };

        /*char[][] field = new char[3][3];
        for(int i = 0; i < field.length; i++){
            for(int j = 0; j < field[0].length; j++){
                field[i][j] = '_';
            }
        }*/
        return field;
    }

    public static void print(char[][] field){
        for(int i = 0; i < field.length; i++){
            String line = "" + field[i][0];
            for(int j = 1; j < field[0].length; j++){
                line += " " + field[i][j];
            }
            System.out.println(line);
        }
    }

    public static void playGame(){
        Scanner sc = new Scanner(System.in);
        char[][] field = createField();

        while(true){
            print(field);
            String[] in = sc.nextLine().split(" ");
            if(in.length != 3)
                break;

            char sign = in[0].charAt(0);
            int row = Integer.parseInt(in[1]);
            int column = Integer.parseInt(in[2]);

            setSign(field, sign, row, column);
            if(checkWin(field))
                break;
        }

        print(field);


    }

    public static void setSign(char[][] field, char sign, int row, int column){
        if(row >= field.length || column >= field[0].length || !(sign == 'X' || sign == 'O') || field[row][column] != '_')
            return;

        field[row][column] = sign;
    }

    public static boolean checkWin(char[][] field){
        for(int i = 0; i < 3; i++){
            if(field[i][0] != '_' && field[i][0] == field[i][1] && field[i][1] == field[i][2]){
                System.out.println(field[i][0] + " wins!");
                return true;
            }
            if(field[0][i] != '_' && field[0][i] == field[1][i] && field[1][i] == field[2][i]){
                System.out.println(field[0][i] + " wins!");
                return true;
            }
        }
        if(field[1][1] != '_' && field[0][0] == field[1][1] && field[1][1] == field[2][2]){
            System.out.println(field[1][1] + " wins!");
            return true;
        }
        if(field[1][1] != '_' && field[2][0] == field[1][1] && field[1][1] == field[0][2]){
            System.out.println(field[1][1] + " wins!");
            return true;
        }

        return false;
    }

}
