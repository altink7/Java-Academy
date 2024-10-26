package at.altin.strukturierteprogrammierung.review_class5;

import java.util.Scanner;

/**
 * Wenn sich x Leute treffen und jeder mit jedem Hände schüttelt, wieviele Hände werden geschüttelt?
 *
 * Beispiel bei 3 Personen: erste Person schüttelt 2 Hände, zweite Person schüttelt eine weiter Hand
 * und die dritte Person keine weiteren, daher in Summe 5.
 */
public class HandshakeProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of persons: ");
        int persons = sc.nextInt();



        sc.close();
    }
}
