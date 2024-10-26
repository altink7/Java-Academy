package at.altin.strukturierteprogrammierung.self_study_b_variables_and_selection.calculations2;

import java.util.Scanner;

public class Oktal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Oktalzahl eingeben: ");
        int z = sc.nextInt();
        int dez = z%10 + ((z/10)%10)*8 + (z/100)*64;
        int zsum = dez%10 + (dez/10)%10 + (dez/100);

        System.out.printf("dezimal: %d\nZiffernsumme: %d", dez, zsum);

        sc.close();
    }
}
