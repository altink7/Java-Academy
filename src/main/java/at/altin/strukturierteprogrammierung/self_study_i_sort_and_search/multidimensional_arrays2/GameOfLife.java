package at.altin.strukturierteprogrammierung.self_study_i_sort_and_search.multidimensional_arrays2;

import java.util.Scanner;

public class GameOfLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int sizX = /* sc.nextInt(); */ 32;
        int sizY = /* sc.nextInt(); */ 32;

        int[][] cField = new int[sizX][sizY];


        while (true) {
            int x = sc.nextInt();
            if (x < 0)
                break;
            cField[x][sc.nextInt()] = 1;
        }

        //for (int i = 0; i < sizX; i++) {
        //    for (int j = 0; j < sizY; j++) {
        //        if (Math.random() > 0.80) {
        //            cField[i][j] = 1;
        //            System.out.printf("%d %d\n", i, j);
        //        }
        //    }
        //}

        int target = 0;

        for (int i = 0; true; i++) {
            if (i == target) {
                print(cField);
                System.out.printf("(%06d): ", i);
                int inc = sc.nextInt();
                if (inc <= 0)
                    break;
                target += inc;
            }

            cField = step(cField);
        }

        print(cField);
        sc.close();
    }

    public static void print(int[][] f) {
        System.out.println();
        for (int i = 0; i < f.length; i++) {
            for (int j = 0; j < f[0].length; j++) {
                System.out.print(f[i][j] == 0 ? '.' : 'X');
            }
            System.out.println();
        }

    }

    private static int[][] step(int[][] cField) {
        int[][] nField = new int[cField.length][cField[0].length];
        for (int i = 0; i < nField.length; i++) {
            for (int j = 0; j < nField[0].length; j++) {
                int alive = nAlive(cField, i, j);
                if (cField[i][j] == 1 && alive < 2) {
                    nField[i][j] = 0;
                } else if (cField[i][j] == 1 && alive < 4) {
                    nField[i][j] = 1;
                } else if (cField[i][j] == 1 && alive > 3) {
                    nField[i][j] = 0;
                } else if (cField[i][j] == 0 && alive == 3) {
                    nField[i][j] = 1;
                }
            }
        }
        return nField;
    }

    public static int nAlive(int[][] cField, int i, int j) {
        int cnt = 0;
        for(int row = i-1; row <= i+1; row++) {
            for(int col = j-1; col <= j+1; col++) {
                if (row < 0 || row >= cField.length || col < 0 || col >= cField[row].length || (row == i && col == j) || cField[row][col] == 0)
                    continue;
                cnt++;
            }
        }
        return cnt;
    }
}

