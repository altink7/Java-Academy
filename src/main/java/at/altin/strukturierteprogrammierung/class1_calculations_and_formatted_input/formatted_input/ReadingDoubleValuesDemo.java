package at.altin.strukturierteprogrammierung.class1_calculations_and_formatted_input.formatted_input;

import java.util.Scanner;

public class ReadingDoubleValuesDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        double temperature = sc.nextDouble();
        System.out.printf("temperature = %.1f%n", temperature); //print it again
        sc.close();
    }
}
