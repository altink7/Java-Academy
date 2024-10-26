package at.altin.strukturierteprogrammierung.self_study_e_functions.iteration3;

import java.util.Scanner;

public class OneMonthCalendar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Enter number of days in month: ");
        int tage = sc.nextInt();

        System.out.printf("Enter starting day of the week (1=Monday, 7=Sunday): ");
        int weekday = sc.nextInt();
        System.out.printf("\n");

        for (int i = 1; i < weekday; i++)
            System.out.printf("   ");

        for (int i = 1; i <= tage; i++) {
            if (weekday % 7 == 1)
                System.out.printf("\n");
            System.out.printf("%2d ", i);
            weekday++;
        }

        System.out.printf("\n");
        sc.close();
    }
}
