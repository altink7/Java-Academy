package at.altin.tutorium.b;

import java.util.Scanner;

public class Oktal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        long input = sc.nextLong();

        long dezimal = 0;
        int i = 0;

        while(input != 0) {
            dezimal += (long) ((input % 10) * Math.pow(8, i));
            input /= 10;
            i++;
        }
        System.out.printf("\nDezimal: %d", dezimal);
        sc.close();
    }
}
