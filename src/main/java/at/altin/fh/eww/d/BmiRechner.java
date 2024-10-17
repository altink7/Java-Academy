package at.altin.fh.eww.d;

import java.util.Scanner;

public class BmiRechner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           double weight;
           double height;
           double bmi;

           System.out.print("weight [kg]: ");
           weight = sc.nextDouble();
           System.out.print("height [m]: ");
           height = sc.nextDouble();
           bmi = bmiCalc(height, weight);
           System.out.printf("m=%.2fkg h=%.2fm -> BMI=%.2f (", weight, height, bmi);
           bmiMessage(bmiCategory(bmi));
           System.out.print(")\n");
        }

    public static double bmiCalc(double height, double weight) {
        if(height < 1.6 || weight < 40) {
            return -1;
        }

        return weight/(Math.pow(height,2));
    }

    public static int bmiCategory(double bmi) {
        int category;

        if(bmi < 0) {
            category = -1;
        }else if(bmi< 15){
            category = 10;
        }else if (bmi < 16){
            category = 11;
        }else if (bmi < 18.5){
            category = 12;
        }else if (bmi < 25){
            category = 20;
        }else if (bmi < 30){
            category = 30;
        }else if (bmi < 35){
            category = 40;
        }else if (bmi < 40){
            category = 41;
        }else if (bmi >= 40) {
            category = 42;
        }else {
            category= -1;
        }

        return category;
    }

    public static void bmiMessage(int bmiCategory) {
        String output;

        if(bmiCategory < 0){
            output = "Invalid";
        }else if(bmiCategory < 10){
            output = "Very severely underweight";
        }else if (bmiCategory == 11){
            output = "Severely underweight";
        }else if (bmiCategory == 12){
            output = "Underweight";
        }else if (bmiCategory == 20){
            output = "Normal ";
        }else if (bmiCategory == 30){
            output = "Overweight";
        }else if (bmiCategory == 40){
            output = "Moderately obese";
        }else if (bmiCategory == 41){
            output = "Severely obese";
        }else if(bmiCategory ==42){
            output = "Very severely obese ";
        }else{
            output = String.format("%s", "Invalid!");
        }

        System.out.print(output+ ")");
    }
}