package at.altin.strukturierteprogrammierung.self_study_i_sort_and_search.multidimensional_arrays2;

import java.util.Scanner;

public class ArrayWalker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] myWalker = new char[10][10];
        // setting all values of the array myWalker to '.'
        for(int row = 0; row < 10; row++){
            for(int col = 0; col < 10; col++){
                myWalker[row][col] = '.';
            }
        }

        int row = 0;
        int col = 0;
        char nextChar = 'A';
        myWalker[row][col] = nextChar++;

        print(myWalker);

        while(true) {

            System.out.printf("Enter direction command: ");
            int command = sc.nextInt();
            System.out.println();

            int newRow = row;
            int newCol = col;
            if (command == 8) {         // north
                newRow -= 1;
            } else if (command == 2) {  // south
                newRow += 1;
            } else if (command == 4) {  // south
                newCol -= 1;
            } else if (command == 6) {  // south
                newCol += 1;
            } else if(command == 5) {
                break;
            } else {
                continue;
            }

            if(newRow < 0 || newRow > 9 || newCol < 0 || newCol > 9 || myWalker[newRow][newCol] != '.') {
                System.out.println("You cannot go there!");
                continue;
            }

            row = newRow;
            col = newCol;
            myWalker[row][col] = nextChar;

            if(nextChar == 'Z')
                nextChar = 'A';
            else
                nextChar++;

            print(myWalker);
        }

        sc.close();
    }

    private static void print(char[][] myWalker) {
        for(int row = 0; row < 10; row++){                   // setting all values of the array myWalker to '.'
            for(int col = 0; col < 10; col++){
                System.out.print(myWalker[row][col]);
            }
            System.out.println();
        }
    }
}

