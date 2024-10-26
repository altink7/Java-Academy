package at.altin.strukturierteprogrammierung.self_study_f_arrays.simple_functions2;

import java.util.Scanner;

public class MilchFun {
    public static int klasse(double fett, int haltbar) {
        if (fett < 0 || haltbar < 0 || haltbar > 1)
            return -1;

        if (fett > 7) {
            /*if (haltbar == 0)
                return 1;
            else
                return 2;*/
            return haltbar == 0 ? 1 : 2;
        } else if (fett < 3) {
            return haltbar == 0 ? 3 : 4;
        } else {
            return haltbar == 0 ? 5 : 6;
        }
    }

    public static void ausgabe(int k) {
        if (k == -1)
            System.out.printf("Ungueltige Klassifizierung!\n");
        else if (k == 1)
            System.out.printf("Extravollmilch (frisch)\n");
        else if (k == 2)
            System.out.printf("Extravollmilch (haltbar)\n");
        else if (k == 3)
            System.out.printf("Leichtmilch (frisch)\n");
        else if (k == 4)
            System.out.printf("Leichtmilch (haltbar)\n");
        else if (k == 5)
            System.out.printf("Normalmilch (frisch)\n");
        else if (k == 6)
            System.out.printf("Normalmilch (haltbar)\n");
        else
            System.out.printf("Ungueltiges Argument!\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double fett;
        int haltbar;
        int k;

        System.out.printf("Fettgehalt: ");
        fett = sc.nextDouble();
        System.out.printf("Haltbar: ");
        haltbar = sc.nextInt();

        k = klasse(fett, haltbar);
        ausgabe(k);
        sc.close();

    }
}
