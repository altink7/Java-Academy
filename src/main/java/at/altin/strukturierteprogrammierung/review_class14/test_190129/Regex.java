package at.altin.strukturierteprogrammierung.review_class14.test_190129;

import java.util.Scanner;

public class Regex {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String s = read();
        System.out.println(s);
    }

    private static String read() {
        String s = sc.nextLine();
        while (s.matches("01*(0|1)1*") == false){
            s = sc.nextLine();
        }
        return s;
    }

}
