package at.altin.strukturierteprogrammierung.self_study_g_arrays_and_functions.arrays2;


import java.util.Scanner;

public class ReadArrayPartial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[] = new int[10];
        int i = 0;

        while (i < a.length) {
            System.out.printf("%d. number: ", i + 1);
            int in = sc.nextInt();

            if (in == 0)
                break;

            if (in <= 0) {
                System.out.printf("invalid input!\n");
                continue;
            }

            a[i] = in;
            i++;
        }

        System.out.printf("%d number(s) entered.\n", i);

        if (i > 0) {
            for (int j = 0; j < i; j++) {
                System.out.printf("[%d]: %d\n", j, a[j]);
            }
            System.out.printf("Output finished.");
        }

        sc.close();
    }
}

