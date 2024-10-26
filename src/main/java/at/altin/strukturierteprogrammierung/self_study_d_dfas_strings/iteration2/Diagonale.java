package at.altin.strukturierteprogrammierung.self_study_d_dfas_strings.iteration2;

import java.util.Scanner;

public class Diagonale {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = 0;
        while (size <= 0 || size % 2 == 0) {
            System.out.printf(": ");

            size = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j || size - j - 1 == i)
                    System.out.printf("*");
                else
                    System.out.printf("-");
            }
            System.out.printf("\n");

        }
        sc.close();

    }
}
