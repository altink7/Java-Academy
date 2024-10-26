package at.altin.strukturierteprogrammierung.self_study_b_variables_and_selection.selection;

import java.util.Scanner;

public class GradeChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade = sc.nextInt();

        if (grade < 1 || grade > 5) {
            System.out.println("input is invalid!");
        }
        else if (grade == 5) {
            System.out.println("you didn't pass!");
        }
        else {
            System.out.println("you passed with a " + grade + "!");
        }

        /* alternative solution with nested if
        if (grade < 1 || grade > 5) {
            System.out.println("input is invalid!");
        }
        else {
            if(grade == 5) {
                System.out.println("you didn't pass!");
            }
            else {
                System.out.println("you passed with a " + grade + "!");
            }
        }*/
    }

}
