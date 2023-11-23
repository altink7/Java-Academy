package at.altin.tutorium.d;

import java.util.Scanner;

public class GradeAverage implements Runnable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount = 4;
        int[] grades = new int[amount];
        int i = 0;

        while (i < grades.length) {
            System.out.printf("%d Grade: ", (i + 1));
            int aktuellerWert = input.nextInt();

            if (aktuellerWert < 0) {
                System.out.printf(" Current Average: %.2f", average(grades, i));
            } else {
                grades[i] = aktuellerWert;
                i++;
            }
        }

        System.out.printf("Average: %.2f", average(grades, amount));
    }

    private static double average(int[] grades, int size) {
        double sum = 0.0;
        for (int grade : grades) {
            sum = sum + grade;
        }

        return sum / (size > 0 ? size : 1);
    }

    @Override
    public void run() {
        main(null);
    }
}