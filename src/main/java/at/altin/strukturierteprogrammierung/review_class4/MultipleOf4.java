package at.altin.strukturierteprogrammierung.review_class4;

import java.util.Scanner;

public class MultipleOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int state = 0;  //initial state

        int input = sc.nextInt();
        while (input==1 || input == 0) {
            switch (state) {
                case 0:
                case 1:
                    if (input == 0)
                        state = 3;
                    if (input == 1)
                        state = 2;
                    break;
                /*case 1:
                    if (input == 0)
                        state = 3;
                    if (input == 1)
                        state = 2;
                    break;*/
                case 2:
                    if (input == 0)
                        state = 1;
                    break;
                case 3:
                    if (input == 1)
                        state = 2;
                    break;
            }
            input = sc.nextInt();
        }

        System.out.printf("State: %d, %s\n", state, (state==3)?"is a multiple of 4":"is not a multiple of 4");
        sc.close();
    }
}
