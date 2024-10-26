package at.altin.strukturierteprogrammierung.self_study_b_variables_and_selection.formatted_input2;

import java.util.Scanner;

public class Swapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("enter second number (b): ");
        int b = sc.nextInt();
        System.out.printf("a=%d, b=%d\n", a, b);

        int c = b;
        b = a;
        a = c;

        /* Method without a third variable
        a += b;
        b = a - b;
        a -= b;
        */

        System.out.printf("swapped:\n");
        System.out.printf("a=%d, b=%d\n", a, b);
    }
}
