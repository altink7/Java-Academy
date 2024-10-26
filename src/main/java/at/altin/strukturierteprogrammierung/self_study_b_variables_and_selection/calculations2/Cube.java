package at.altin.strukturierteprogrammierung.self_study_b_variables_and_selection.calculations2;

import java.util.Scanner;

public class Cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Length of a side: ");
        int i = sc.nextInt();
        System.out.printf("Surface area: %d\nVolume: %d", i * i * 6, i*i*i);
        sc.close();
    }
}
