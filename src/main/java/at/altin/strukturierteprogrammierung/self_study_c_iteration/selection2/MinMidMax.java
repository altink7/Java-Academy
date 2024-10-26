package at.altin.strukturierteprogrammierung.self_study_c_iteration.selection2;

import java.util.Scanner;

public class MinMidMax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;
        System.out.printf("Geben Sie drei Zahlen ein:\n");
        System.out.printf("a: ");
        a = sc.nextInt();
        System.out.printf("b: ");
        b = sc.nextInt();
        System.out.printf("c: ");
        c = sc.nextInt();

        if (a == b) {
            if (a == c) {
                System.out.printf("%d = %d = %d\n", a, b, c);
                System.out.printf("%c = %c = %c\n", 'a', 'b', 'c');
            } else if (a < c) {
                System.out.printf("%d = %d < %d\n", a, b, c);
                System.out.printf("%c = %c < %c\n", 'a', 'b', 'c');
            } else {
                System.out.printf("%d < %d = %d\n", c, a, b);
                System.out.printf("%c < %c = %c\n", 'c', 'a', 'b');
            }
        } else if (b == c) {
            if (a < b) {
                System.out.printf("%d < %d = %d\n", a, b, c);
                System.out.printf("%c < %c = %c\n", 'a', 'b', 'c');
            } else { // a > b
                System.out.printf("%d = %d < %d\n", b, c, a);
                System.out.printf("%c = %c < %c\n", 'b', 'c', 'a');
            }
        } else if (a == c) {
            if (a < b) {
                System.out.printf("%d = %d < %d\n", a, c, b);
                System.out.printf("%c = %c < %c\n", 'a', 'c', 'b');
            } else {
                System.out.printf("%d < %d = %d\n", b, a, c);
                System.out.printf("%c < %c = %c\n", 'b', 'a', 'c');
            }
        } else if (a < b) {
            if (c < a) {
                System.out.printf("%d < %d < %d\n", c, a, b);
                System.out.printf("%c < %c < %c\n", 'c', 'a', 'b');

            } else if (c < b) {
                System.out.printf("%d < %d < %d\n", a, c, b);
                System.out.printf("%c < %c < %c\n", 'a', 'c', 'b');
            } else {
                System.out.printf("%d < %d < %d\n", a, b, c);
                System.out.printf("%c < %c < %c\n", 'a', 'b', 'c');
            }
        } else {
            // b<a
            if (c < b) {
                System.out.printf("%d < %d < %d\n", c, b, a);
                System.out.printf("%c < %c < %c\n", 'c', 'b', 'a');

            } else if (c < a) {
                System.out.printf("%d < %d < %d\n",  b, c, a);
                System.out.printf("%c < %c < %c\n", 'b', 'c', 'a');
            } else {
                System.out.printf("%d < %d < %d\n", b, a, c);
                System.out.printf("%c < %c < %c\n", 'b', 'a', 'c');
            }
        }

        sc.close();
    }
}
