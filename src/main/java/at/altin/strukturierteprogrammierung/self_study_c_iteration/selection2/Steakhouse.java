package at.altin.strukturierteprogrammierung.self_study_c_iteration.selection2;

import java.util.Scanner;

public class Steakhouse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Steak type: ");
        int steak = sc.nextInt();

        System.out.printf("Cooking degree: ");
        int cooking = sc.nextInt();

        System.out.printf("Side order: ");
        int side = sc.nextInt();

        int pot_type = 0;
        int pot_top = 0;

        if(side==2) {
            System.out.printf("Potatoe type: ");
            pot_type = sc.nextInt();
            if(pot_type==3) {
                System.out.printf("Potatoe topping: ");
                pot_top = sc.nextInt();
            }
        }


        System.out.printf("\n");

        if(steak==1) {
            System.out.printf("T-bone");
        } else if(steak==2) {
            System.out.printf("Sirloin");
        } else if(steak==3) {
            System.out.printf("Rib eye");
        }

        if(cooking==1) {
            System.out.printf(", rare");
        } else if(cooking==2) {
            System.out.printf(", medium rare");
        } else if(cooking==3) {
            System.out.printf(", medium");
        } else if(cooking==4) {
            System.out.printf(", medium well done");
        } else if(cooking==5) {
            System.out.printf(", well done");
        }

        if(side==1) {
            System.out.printf(", Bread");
        } else if(side==2) {
            if(pot_type==1) {
                System.out.printf(", French fries");
            } else if(pot_type==2) {
                System.out.printf(", Wedges");
            } else if(pot_type==3) {
                System.out.printf(", Baked potatoes");
                if(pot_top==1) {
                    System.out.printf(", Garlic topping");
                } else if(pot_top==2) {
                    System.out.printf(", French dressing");
                } else if(pot_top==3) {
                    System.out.printf(", Buttered");
                }
            }
        }

        sc.close();
    }
}
