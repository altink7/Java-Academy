package at.altin.strukturierteprogrammierung.class4_strings;

import java.util.Scanner;

public class StudentId {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();

        System.out.println(id.matches("(wi|if)[0-9]{2}b[0-9]{3}"));

        sc.close();
    }
}
