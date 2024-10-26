package at.altin.strukturierteprogrammierung.self_study_c_iteration.selection2;

import java.util.Scanner;

public class IntervalleSchliessen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int int1low, int1high, int2low, int2high;

        System.out.printf("Grenze 1: ");
        int g1 = sc.nextInt();
        System.out.printf("Grenze 2: ");
        int g2 = sc.nextInt();

        if (g1 < g2) {
            int1low = g1;
            int1high = g2;
        } else {
            int1low = g2;
            int1high = g1;
        }

        System.out.printf("Grenze 1: ");
        int g3 = sc.nextInt();
        System.out.printf("Grenze 2: ");
        int g4 = sc.nextInt();

        if (g3 < g4) {
            int2low = g3;
            int2high = g4;
        } else {
            int2low = g4;
            int2high = g3;
        }

        System.out.printf("Intervall 1: [%d, %d]\n", int1low, int1high);
        System.out.printf("Intervall 2: [%d, %d]\n", int2low, int2high);


        /*if(int1low < int2low) {
            if(int1high > int2high) {
                System.out.printf("geschlossenes Intervall: [%d, %d]\n", int1low, int1high);
            } else {
                System.out.printf("geschlossenes Intervall: [%d, %d]\n", int1low, int2high);
            }
        } else {
            if(int1high > int2high) {
                System.out.printf("geschlossenes Intervall: [%d, %d]\n", int2low, int1high);
            } else {
                System.out.printf("geschlossenes Intervall: [%d, %d]\n", int2low, int2high);
            }
        }*/


        /*int min, max;

        if(int1low < int2low) {
            min = int1low;
        } else {
            min = int2low;
        }

        if(int1high > int2high) {
            max = int1high;
        } else {
            max = int2high;
        }*/

        /*int min = int1low < int2low ? int1low : int2low;
        int max = int1high > int2high ? int1high : int2high;


        System.out.printf("geschlossenes Intervall: [%d, %d]\n", min, max);*/


        System.out.printf("geschlossenes Intervall: [%d, %d]\n",
                int1low < int2low ? int1low : int2low,
                int1high > int2high ? int1high : int2high);

        sc.close();
    }
}
