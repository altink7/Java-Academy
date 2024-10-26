package at.altin.strukturierteprogrammierung.review_class2;

import java.util.Scanner;

public class Rechner {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        double result = 0;

        while(true) {
            System.out.printf("Result: %f\n", result);
            System.out.print("Operation: ");
            String op = sc.next();
            System.out.print("Zahl: ");
            double in = sc.nextDouble();

            switch (op) {
                case "+":
                    result += in;
                    break;
                case "-":
                    result -= in;
                    break;
                case "*":
                    result *= in;
                    break;
                case "/":
                    result /= in;
                    break;
                case "%":
                    result %= in;
                    break;
                default:
                    return;
            }
        }

    }
}
