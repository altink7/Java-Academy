package at.altin.strukturierteprogrammierung.self_study_c_iteration.selection2;

import java.util.Scanner;

public class Classifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter price: ");
        int price = sc.nextInt();
        System.out.print("enter quality: ");
        int quality = sc.nextInt();

        boolean highPrice = price >= 50;
        boolean highQuality = quality >= 50;

        System.out.printf("%s price\n", highPrice ? "high" : "low");
        System.out.printf("%s quality\n", highQuality ? "high" : "low");

        if(highPrice) {
            System.out.println(highQuality ? "luxury" : "rip off");
        }
        else {
            System.out.println(highQuality ? "bargain" : "junk");
        }

        sc.close();
    }
}
