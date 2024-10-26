package at.altin.strukturierteprogrammierung.self_study_i_sort_and_search.multidimensional_arrays2;

import java.util.Scanner;

public class NumberPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int W = 7;

        //scan numbers and assume input is between 0 and W
        System.out.printf(": ");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }


        int[][] hist = new int[W+1][W+1];

        for (int i=0; i<numbers.length-1;i++)
            hist[numbers[i]][numbers[i+1]]++;

        for(int i=0; i<hist.length; i++) {
            for (int j=0; j<hist[i].length; j++) {
                if (hist[i][j]>0)
                    System.out.printf("(%d,%d): %d\n",i, j, hist[i][j] );
            }
        }

        // Ausgabe als Tabelle
        /*System.out.printf("\n   ");
        for (int j=0; j<hist[0].length; j++) {
            System.out.printf(" %d",j);
        }

        System.out.printf("\n   ");
        for (int j=0; j<hist[0].length; j++) {
            System.out.printf("--",j);
        }
        System.out.println();

        for(int i=0; i<hist.length; i++) {
            System.out.printf(" %d|", i);
            for (int j=0; j<hist[i].length; j++) {
                //if (hist[i][j]>0)
                    System.out.printf(" %d", hist[i][j]);
                //else
                //    System.out.print("  ");
            }
            System.out.println();
        }*/

        sc.close();

    }
}

