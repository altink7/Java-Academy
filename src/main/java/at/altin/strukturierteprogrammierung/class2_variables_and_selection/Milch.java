package at.altin.strukturierteprogrammierung.class2_variables_and_selection;

import java.util.Scanner;

public class Milch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fettgehalt: ");
        int fett = sc.nextInt();
        System.out.print("Haltbar: ");
        int haltbar = sc.nextInt();

        if (fett < 0 || (haltbar != 0 && haltbar != 1)) {
            System.out.println("Ungültig!");
        }
        else {
            String sHaltbar = "frisch";
            if (haltbar == 1) {
                sHaltbar = "haltbar";
            }

            if(fett < 3) {
                System.out.printf("Leichtmilch (%s)", sHaltbar);
            }
            else if (fett > 7) {
                System.out.printf("Extravollmilch (%s)", sHaltbar);
            }
            else {
                System.out.printf("Normalmilch (%s)", sHaltbar);
            }
        }

        sc.close();
    }
}
