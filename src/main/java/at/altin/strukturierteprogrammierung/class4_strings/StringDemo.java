package at.altin.strukturierteprogrammierung.class4_strings;

import java.util.Scanner;

public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String input2 = sc.nextLine();

        // compares the two inputs alphabetically and prints the earlier input
        if (input.compareTo(input2) < 0)
            System.out.println(input);
        else
            System.out.println(input2);

        // read a number as String and then convert it to int
        String zahl = sc.nextLine();
        // parseInt() would throw an exception if the String is not a valid number
        int z = Integer.parseInt(zahl);

        // since zahl is a string 1 is converted to string and then just added at the end
        System.out.println(zahl + 1);
        // z is an int therefore a real addition is performed
        System.out.println(z + 1);

        // to get a single character from a string charAt can be used
        // first index is 0
        System.out.println(input.charAt(1));

        // reverse print a string
        for (int i = input.length() - 1; i >= 0; i--){
            System.out.print(input.charAt(i));
        }
        System.out.println();

        System.out.println(input);
        // trim removes whitespace characters (e.g. spaces) at the beginning or end of a string
        System.out.println(input.trim());

        // convert all characters in a string to lower/upper case characters
        System.out.println(input.toLowerCase());
        System.out.println(input.toUpperCase());

        // equality of two strings should be checked with equals and not ==
        System.out.println(input.equals("Hallo Welt!"));

        sc.close();
    }
}
