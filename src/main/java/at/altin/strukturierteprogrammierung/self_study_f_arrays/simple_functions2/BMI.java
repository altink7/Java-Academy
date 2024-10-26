package at.altin.strukturierteprogrammierung.self_study_f_arrays.simple_functions2;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight, height, bmi;
        System.out.printf("weight [kg]: ");
        weight = sc.nextDouble();
        System.out.printf("height [m]: ");
        height = sc.nextDouble();
        bmi = bmiCalc(height, weight);
        System.out.printf("m=%.2fkg h=%.2fm -> BMI=%.2f (", weight, height, bmi);
        bmiMessage(bmiCategory(bmi));
        System.out.printf(")\n");
        sc.close();
    }

    public static double bmiCalc(double height, double weight) {
        double bmi;
        if (height < 1.60 || weight < 40)
            bmi = -1;
        else
            bmi = (weight) / (height * height);

        return bmi;
    }

    public static int bmiCategory(double bmi) {
        if (bmi < 0)
            return -1;

        if (bmi < 15.) {
            return 10;
        } else if (bmi < 16.) {
            return 11;
        } else if (bmi < 18.5) {
            return 12;
        } else if (bmi < 25) {
            return 20;
        } else if (bmi < 30) {
            return 30;
        } else if (bmi < 35) {
            return 40;
        } else if (bmi < 40) {
            return 41;
        } else if (bmi >= 40) {
            return 42;
        }

        return -1;
    }

    public static void bmiMessage(int bmi_class) {
        switch (bmi_class) {
            case -1:
                System.out.printf("invalid");
                break;
            case 10:
                System.out.printf("Very severely underweight");
                break;
            case 11:
                System.out.printf("Severely underweight");
                break;
            case 12:
                System.out.printf("Underweight");
                break;
            case 20:
                System.out.printf("Normal");
                break;
            case 30:
                System.out.printf("Overweight");
                break;
            case 40:
                System.out.printf("Moderately obese");
                break;
            case 41:
                System.out.printf("Severely obese");
                break;
            case 42:
                System.out.printf("Very severely obese");
                break;
            default:
                System.out.printf("Error.");
                break;
        }
    }
}
