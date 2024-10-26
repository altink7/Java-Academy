package at.altin.strukturierteprogrammierung.self_study_g_arrays_and_functions.arrays2;

import java.util.Scanner;

public class Audio {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = 16;
        float data[] = new float[max];
        int read = 0;

        System.out.printf("Max. 16 Werte eingeben, 0 beendet:\n");
        for(int i=0; i < max; i++) {
            float tmp = sc.nextFloat();
            if(tmp == 0)
                break;
            if(tmp > 0)
                tmp = 0;
            if(tmp < -100)
                tmp = -100;

            data[i] = tmp;
            read = i;
        }

        System.out.printf("Eingelesen: %d\n", read);

        System.out.printf("N: ");
        int n = sc.nextInt();

        if(n > read) {
            System.out.printf("Zu wenige Werte\n");
        }
        else {
            float summe = 0;
            for(int i=0; i<n; i++)
            {
                summe += data[read-1-i];
            }
            System.out.printf("Wert = %.2f", summe / n);
        }

        sc.close();
    }
}

