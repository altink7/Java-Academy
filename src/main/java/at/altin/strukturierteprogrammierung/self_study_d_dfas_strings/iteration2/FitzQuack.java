package at.altin.strukturierteprogrammierung.self_study_d_dfas_strings.iteration2;

import java.util.Scanner;

public class FitzQuack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        int z = sc.nextInt();

        for(int i=1; i <= z; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.printf("FitzQuack ", i);
            }
            else if (i % 7 == 0) {
                System.out.printf("Quack ", i);
            }
            else if (i % 5 == 0) {
                System.out.printf("Fitz ", i);
            }
            else
            {
                System.out.printf("%d ", i);
            }
            if (i%10 == 0)
                System.out.println();
        }

        sc.close();
    }
}
