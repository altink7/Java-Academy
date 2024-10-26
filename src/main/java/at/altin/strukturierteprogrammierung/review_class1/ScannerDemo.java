package at.altin.strukturierteprogrammierung.review_class1;


import java.util.Scanner;

public class ScannerDemo {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);

        int v1 = sc.nextInt();
        System.out.println(v1);
        double d1 = sc.nextDouble();
        System.out.println(d1);

        sc.close();
    }
}
