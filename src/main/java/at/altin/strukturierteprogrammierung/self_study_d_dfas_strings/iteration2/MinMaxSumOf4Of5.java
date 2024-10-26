package at.altin.strukturierteprogrammierung.self_study_d_dfas_strings.iteration2;

import java.util.Scanner;

public class MinMaxSumOf4Of5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 0;
        int min = 0;
        int sum = 0;
        System.out.print(": ");
        for (int i = 0; i < 5; i++) {
            int z = sc.nextInt();

            sum += z;

            if (i == 0) {
                max = z;
                min = z;
            }
            else {
                if (z > max) max = z;
                if (z < min) min = z;
            }

        }
        System.out.printf("minimum sum: %d\n", sum - max);
        System.out.printf("maximum sum: %d\n", sum - min);
        sc.close();
    }
}
