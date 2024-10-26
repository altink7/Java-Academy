package at.altin.strukturierteprogrammierung.review_class1;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1-3: ");
        int a = sc.nextInt();
        switch(a) {
            case 1:
                System.out.println("Selection 1\n");
                break;
            case 2:
                System.out.println("Selection 2\n");
                break;
            case 3:
                System.out.println("Selection 3\n");
                break;
            default:
                System.out.println("Wrong input.\n");
        } /*End of switch*/
    }
}
