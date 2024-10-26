package at.altin.strukturierteprogrammierung.class5_functions;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        welcome();
        String name = sc.nextLine();
        welcome(name);

        int z1 = sc.nextInt();
        int z2 = sc.nextInt();
        int maximum = max(z1, z2);
        int maximum2 = max(z2, z1);

        System.out.println(maximum);
        System.out.println(maximum2);

        sc.close();
    }

    public static int max(int zahl1, int zahl2) {
        if (zahl1 > zahl2)
            return zahl1;
        else
            return zahl2;
    }

    public static void welcome() {
        System.out.printf("Welcome!");
    }

    public static void welcome(String name) {
        System.out.printf("Welcome %s!", name);
    }
}
