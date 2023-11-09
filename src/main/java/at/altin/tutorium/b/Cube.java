package at.altin.tutorium.b;


import java.util.Scanner;

public class Cube {

    //Alternative
    static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("input: ");
        long lengthOfASide = sc.nextLong();

        double surfaceArea = 6 * (lengthOfASide * lengthOfASide);
        double volume = lengthOfASide * lengthOfASide * lengthOfASide;
        //Alternative for both
        double surfaceAreaAlt = 6 * (Math.pow(lengthOfASide, 2));
        double volumeAlt = Math.pow(lengthOfASide,3);


        System.out.printf("\nLength of a side: %d", lengthOfASide);
        System.out.printf("\nSurface Area: %.2f", surfaceAreaAlt);
        System.out.printf("\nVolume: %.2f", volumeAlt);

        sc.close();
    }
}
