package at.altin.strukturierteprogrammierung.class2_variables_and_selection;

import java.util.Scanner;

public class NumberFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int z1 = z % 10;
        int z100 = z % 100;

        if (z100 == 11 || z100 == 12 || z100 == 13) {
            System.out.printf("%dth", z);
        }
        else {
            switch (z1) {
                case 1:
                    System.out.printf("%dst", z);
                    break;
                case 2:
                    System.out.printf("%dnd", z);
                    break;
                case 3:
                    System.out.printf("%drd", z);
                    break;
                default:
                    System.out.printf("%dth", z);
            }
        }


    }
}
