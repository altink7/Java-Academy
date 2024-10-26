package at.altin.strukturierteprogrammierung.self_study_e_functions.iteration3;

import java.util.Scanner;

public class TickTrickTrack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean lastWasTrack = false;
        System.out.print("Eingabe: ");
        int lastEntry = sc.nextInt();

        int count = 1;
        while(true) {
            System.out.printf("Eingabe: ");
            //scanf("%d", &nums[index%3]);
            int newEntry = sc.nextInt();
            count++;

            if (newEntry == lastEntry) {
                if (lastWasTrack)
                    break;

                System.out.printf("Track\n");
                lastWasTrack = true;
            } else {
                if (newEntry < lastEntry)
                    System.out.printf("Tick\n");
                else
                    System.out.printf("Trick\n");

                lastWasTrack = false;
            }

            lastEntry = newEntry;
        }

        System.out.printf("Ende (%d Eingaben)\n", count);
        sc.close();
    }
}
