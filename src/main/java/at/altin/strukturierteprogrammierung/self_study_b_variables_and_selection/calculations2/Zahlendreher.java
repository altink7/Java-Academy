package at.altin.strukturierteprogrammierung.self_study_b_variables_and_selection.calculations2;

import java.util.Scanner;

public class Zahlendreher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl: ");
        int z = sc.nextInt();

        System.out.printf("Ausgabe: %03d", z/100 + ((z/10)%10)*10 + (z%10)*100);

        sc.close();
    }
}
