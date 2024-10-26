package at.altin.strukturierteprogrammierung.self_study_e_functions.iteration3;

import java.util.Scanner;

public class Platzierung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstStarter=1, currentStarter=1, lead=1;


        for(int i=2; currentStarter!=0; i++){
            currentStarter = sc.nextInt();

            if(currentStarter>0 && currentStarter<=firstStarter){
                firstStarter++;
                System.out.printf("new position: %d\n", firstStarter);
            }

            if(currentStarter==1){
                lead=i;
                System.out.printf("leader: %d\n", lead);
            }
        }

        System.out.printf("final position: %d\n", firstStarter);
        System.out.printf("winner: %d\n", lead);

        sc.close();
    }
}
