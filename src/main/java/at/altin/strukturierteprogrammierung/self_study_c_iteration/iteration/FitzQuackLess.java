package at.altin.strukturierteprogrammierung.self_study_c_iteration.iteration;

import java.util.Scanner;

public class FitzQuackLess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int z = sc.nextInt();

        for(int i=1; i <= z; i++) {
            System.out.printf("%3d ", i);
            if (i%10 == 0)
                System.out.println();
        }

        sc.close();
    }
}
