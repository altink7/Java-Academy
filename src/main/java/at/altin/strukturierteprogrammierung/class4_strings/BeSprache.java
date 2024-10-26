package at.altin.strukturierteprogrammierung.class4_strings;

import java.util.Locale;
import java.util.Scanner;

public class BeSprache {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String txt = sc.nextLine().toLowerCase();
        System.out.println(txt);
        System.out.printf("%s\n", txt.replaceAll("([aeiouäöü])", "$1b$1"));

        sc.close();
    }
}
