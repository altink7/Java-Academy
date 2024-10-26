package at.altin.strukturierteprogrammierung.self_study_b_variables_and_selection.selection;

import java.util.Scanner;

public class BMI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double mass = sc.nextDouble();
        double height = sc.nextDouble();
        double bmi = mass / (height * height);

        if (bmi < 15) {
            System.out.println("Very severely underweight");
        }
        else if (bmi < 16) {
            System.out.println("Severely underweight");
        }
        else if (bmi < 18.5) {
            System.out.println("Underweight");
        }
        else if (bmi < 25) {
            System.out.println("Normal");
        }
        else if (bmi < 30) {
            System.out.println("Overweight");
        }
        else if (bmi < 35) {
            System.out.println("Moderately obese");
        }
        else if (bmi < 40) {
            System.out.println("Severely obese");
        }
        else {
            System.out.println("Very severely obese");
        }
    }

}
