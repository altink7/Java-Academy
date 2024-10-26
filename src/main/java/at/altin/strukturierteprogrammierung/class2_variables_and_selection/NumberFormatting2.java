package at.altin.strukturierteprogrammierung.class2_variables_and_selection;

import java.util.Scanner;

public class NumberFormatting2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int z1 = z % 10;
        int z100 = z % 100;

        boolean spezial = z100 == 11 || z100 == 12 || z100 == 13;

        // if (z1 == 1 && !(z100 == 11 || z100 == 12 || z100 == 13))
        if (z1 == 1 && !spezial) {
            System.out.printf("%dst", z);
        }
        else if (z1 == 2 && !spezial) {
            System.out.printf("%dnd", z);
        }
        else if (z1 == 3 && !spezial) {
            System.out.printf("%drd", z);
        }
        else {
            System.out.printf("%dth", z);
        }
    }
}
