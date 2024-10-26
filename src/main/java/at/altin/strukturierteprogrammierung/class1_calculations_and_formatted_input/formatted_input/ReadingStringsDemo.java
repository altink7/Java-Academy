package at.altin.strukturierteprogrammierung.class1_calculations_and_formatted_input.formatted_input;

import java.util.Scanner;

public class ReadingStringsDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": ");
        String lastname = sc.next();
        String firstname = sc.next();
        sc.nextLine();
        System.out.printf(": ");
        String greeting = sc.nextLine();
        System.out.printf("%s %s %s\n", greeting, firstname, lastname);
        sc.close();
    }
}
