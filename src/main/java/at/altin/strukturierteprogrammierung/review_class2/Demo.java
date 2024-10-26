package at.altin.strukturierteprogrammierung.review_class2;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }*/

        /*int i = 1;
        while (i > 0) {
            i = sc.nextInt();
            System.out.println(i);
        }*/

        /*while(true) {
            int i = sc.nextInt();
            System.out.println(i);
            if (i <= 0)
                break;
        }*/

        int i;
        for (i = 0; i <= 100; i++) {

            if (i % 2 != 0)
                continue;

            System.out.println(i);
        }

        System.out.println("Anzahl: " + i);

        sc.close();
    }
}
