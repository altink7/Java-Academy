package at.altin.strukturierteprogrammierung.self_study_e_functions.iteration3;

import java.util.Scanner;

public class Walker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NORTH=8, EAST=6, SOUTH=2, WEST=4, EXIT=5;
        // int NORTHEAST=9, SOUTHEAST=3, SOUTHWEST=1, NORTHWEST=7;
        int XMIN=1, XMAX=10, YMIN=1, YMAX=10;
        int x_pos=XMIN, y_pos=YMIN, x_inc, y_inc;
        int steps=0;

        while(true) {

            for(int i=YMAX; i>=YMIN; i--){
                for(int j=XMIN; j<=XMAX; j++){
                    if(i==y_pos && j==x_pos)
                        System.out.printf("X");
                    else
                        System.out.printf(".");
                }
                System.out.printf("\n");
            }
            /*System.out.printf("(%d,%d)\n", x_pos, y_pos );*/

            x_inc = y_inc = 0;
            System.out.printf("\nEingabe: ");
            int input = sc.nextInt();
            if(input==EXIT)
                break;

            if(input==NORTH) {
                y_inc=1;
            } else if(input==SOUTH) {
                y_inc=-1;
            }else if(input==EAST) {
                x_inc=1;
            }else if(input==WEST) {
                x_inc=-1;
            }
	        /* else if(input==NORTHEAST) {
	            x_inc=1;
	            y_inc=1;
	        } else if(input==SOUTHEAST) {
	            x_inc=1;
	            y_inc=-1;
	        }  else if(input==SOUTHWEST) {
	            x_inc=-1;
	            y_inc=-1;
	        } else if(input==NORTHWEST) {
	            x_inc=-1;
	            y_inc=1;
	        } */
            else {
                System.out.printf("Unbekannte Aktion!\n");
                continue;
            }

            if(x_pos+x_inc < XMIN || x_pos+x_inc>XMAX || y_pos+y_inc<YMIN || y_pos+y_inc>YMAX ) {
                System.out.printf("Aktion unmoeglich!\n");
                continue;
            }

            x_pos+=x_inc;
            y_pos+=y_inc;
            steps++;
        }

        System.out.printf("Schritte insgesamt: %d\n", steps);
        sc.close();
    }
}
