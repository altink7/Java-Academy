package at.altin.strukturierteprogrammierung.self_study_d_dfas_strings.iteration2;

import java.util.Scanner;

public class InputLoopMinIdx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int minIdx = 0;
        int i = 1;
        int z = 1;
        int n = 1;
        while (z > 0 && i <= n) {
            System.out.print(": ");
            z = sc.nextInt();

            if (z > 0) {
                if (i == 1 || z <= min) {
                    if (i == 1)
                        n = z;
                    if(z % 2 != 1) {
                        min = z;
                        minIdx = i;
                    }
                }
                i++;
            }
        }
        if(minIdx == 1)
            System.out.println("first");
        if (minIdx == i - 1)
            System.out.println("last");
        if (minIdx > 0)
            System.out.printf("minIdx: %d \n", minIdx);

        System.out.printf("End.\n");
        sc.close();
    }
}
