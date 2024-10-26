package at.altin.strukturierteprogrammierung.self_study_c_iteration.selection2;

import java.util.Scanner;

public class TimeFormatConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("Zeit: ");
        int time = sc.nextInt();
        int min = time % 100;
        int hour = time / 100;

        if (min < 0 || min > 59 || hour < 0 || hour > 23) {
            System.out.print("Ungueltige Eingabe!");
        }
        else {
            String end = hour < 12 ? "AM" : "PM";
            //int h = hour % 12 == 0 ? 12 : hour % 12;
            int h;
            if (hour % 12 == 0)
                h = 12;
            else
                h = hour % 12;
            System.out.printf("%02d:%02d %s", h, min, end);
        }

        sc.close();
    }
}
