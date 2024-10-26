package at.altin.strukturierteprogrammierung.review_class1;

import java.util.Scanner;

public class SelectionDemo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("grade: ");
        int grade = sc.nextInt();
        if (grade == 5) {
            System.out.printf("failed.\n");
        }
        else {
            System.out.printf("not failed.\n");
        }
        System.out.printf("Thank you.");
        sc.close();
    }
}
