package at.altin.strukturierteprogrammierung.self_study_c_iteration.iteration;

import java.util.Scanner;

public class InputLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int z=1;
        while (z > 0) {
            System.out.print(": ");
            z = sc.nextInt();
        }

        System.out.printf("End.\n");
        sc.close();
    }
}
