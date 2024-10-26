package at.altin.strukturierteprogrammierung.class4_strings;

import java.util.Scanner;

public class StudentId2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter studentID (wi**b***): ");
        String studID = sc.next();
        System.out.printf("ID valid: %s\n", validate(studID));
        System.out.printf("graduation in: %d\n", graduation(studID));
        sc.close();
    }

    public static int graduation(String studID) {
        if (!validate(studID))
            return -1;
        return 2000 + Integer.parseInt(studID.substring(2, 4)) + 3;
    }

    public static boolean validate(String studID) {
        return studID.matches("wi[0-9]{2}b[0-9]{3}");
    }
}
