package at.altin.strukturierteprogrammierung.review_class1;

import java.util.Scanner;

public class Demo {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf(": "); //prompt for input
        int z = sc.nextInt(); //read an integer value
        int z1 = z % 10;
        int z10 = z/10 % 10;
        int z100 = z/100;

        System.out.printf("%d\n%d\n%d\n", z1, z10, z100); //print it again

        String octalString = sc.next();
        int decimal=Integer.parseInt(octalString);

        int sum = decimal/100 + decimal%10 + decimal/10%10;

        System.out.printf("dezimal: %d\nZiffernsumme: %d\n",decimal, sum);

        double d = Double.parseDouble("4.5");
        System.out.println("Double: " + d + "!");
        System.out.printf("Double: %.1f!", d);


        sc.close();
    }

}
