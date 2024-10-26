package at.altin.strukturierteprogrammierung.class4_strings;

import java.util.Scanner;

public class Trainingsphasen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int run = 0;
        int walk = 0;

        while (run <= 0) {
            System.out.print(": ");
            run = sc.nextInt();
        }

        while(walk <= 0) {
            System.out.print(": ");
            walk = sc.nextInt();
        }

        while(true) {
            System.out.print(": ");
            int phase = sc.nextInt();

            if (phase <= 0)
                break;

            if (phase % (run + walk) > run || phase % (run + walk) == 0)
                System.out.println("gehen");
            else
                System.out.println("laufen");
        }
        System.out.println("ende.");
    }
}
