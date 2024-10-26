package at.altin.strukturierteprogrammierung.class3_iteration;

import java.util.Scanner;

public class InputLoopCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int z=1;
        int counter = 0;
        int max = 0;
        int min = 0;
        int sum = 0;

        while (true) {
            System.out.print(": ");
            z = sc.nextInt();

            if (z <= 0)
                break;

            sum += z;

            if (counter == 0) {
                max = z;
                min = z;
            }
            else {
                if (z > max) max = z;
                if (z < min) min = z;
            }

            counter++;
        }

        System.out.printf("%d inputs.\n", counter);
        System.out.printf("Min: %d \n", min);
        System.out.printf("Max: %d \n", max);
        System.out.printf("Average: %f \n", (float)sum / counter);
        System.out.printf("End.\n");
        sc.close();
    }
}
