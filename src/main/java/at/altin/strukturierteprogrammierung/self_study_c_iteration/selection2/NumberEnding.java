package at.altin.strukturierteprogrammierung.self_study_c_iteration.selection2;

import java.util.Scanner;

public class NumberEnding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int z1 = z % 10;
        int z100 = z % 100;

        if (z1 == 1 && z100 != 11) {
            System.out.printf("%dst", z);
        }
        else if (z1 == 2 && z100 != 12) {
            System.out.printf("%dnd", z);
        }
        else if (z1 == 3 && z100 != 13) {
            System.out.printf("%drd", z);
        }
        else {
            System.out.printf("%dth", z);
        }

        sc.close();
    }
}
