package at.altin.strukturierteprogrammierung.self_study_b_variables_and_selection.formatted_input2;

import java.util.Scanner;

public class Karte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Eingabe: ");
        int z = sc.nextInt();
        System.out.printf("---------------\n");
        System.out.printf("| %-5d %5d |\n", z, z);
        System.out.printf("| \\         / |\n");
        System.out.printf("|  \\       /  |\n");
        System.out.printf("|   \\     /   |\n");
        System.out.printf("|    \\   /    |\n");
        System.out.printf("|     \\ /     |\n");
        System.out.printf("|      X      |\n");
        System.out.printf("|     / \\     |\n");
        System.out.printf("|    /   \\    |\n");
        System.out.printf("|   /     \\   |\n");
        System.out.printf("|  /       \\  |\n");
        System.out.printf("| /         \\ |\n");
        System.out.printf("| %-+5d %+5d |\n", z, z);
        System.out.printf("---------------\n");
    }
}
