package at.altin.strukturierteprogrammierung.self_study_b_variables_and_selection.calculations2;

import java.util.Scanner;

public class TimeCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Welcome to the TimeCalculator!\nplease enter a duration in milliseconds:");
        String time = sc.next();
        long t = Long.parseLong(time);
        System.out.printf("%d ms are exactly:\n", t);

        long ms = t % 1000;
        t /= 1000;
        long sec = t % 60;
        t /= 60;
        long min = t % 60;
        t /= 60;
        long hours = t % 24;
        long days = t / 24;

        System.out.printf("   days %d\n", days);
        System.out.printf("  hours %d\n", hours);
        System.out.printf("minutes %d\n", min);
        System.out.printf("seconds %d\n", sec);
        System.out.printf("     ms %d\n", ms);
    }

}
