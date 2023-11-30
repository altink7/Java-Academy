package at.altin.fh.b;

import java.util.Scanner;

public class Oktal implements Runnable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input (oktalzahl): ");
        long input = sc.nextLong();

        long dezimal = 0;
        int i = 0;

        while(input != 0) {
            // Formel aus dem Beispiel, siehe PDF
            dezimal += (long) ((input % 10) * Math.pow(8, i));
            input /= 10;
            i++;
        }
        System.out.printf("\nOutput(dezimal): %d", dezimal);
        sc.close();
    }

        @Override
        public void run() {
            main(null);
        }

}
