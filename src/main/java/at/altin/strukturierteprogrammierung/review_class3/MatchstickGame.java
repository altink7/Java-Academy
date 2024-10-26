package at.altin.strukturierteprogrammierung.review_class3;

import java.util.Scanner;

public class MatchstickGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the matchstick game!\nDo you want to play against a computer? (y/n)");

        boolean computer = sc.nextLine().equals("y");

        int sticks = getStartingSticks(sc);

        boolean isPlayerOneTurn = true;

        while (sticks > 0) {
            printSticks(sticks);

            sticks -= getInputFromPlayer(sc, computer, sticks, isPlayerOneTurn);

            isPlayerOneTurn = !isPlayerOneTurn;
        }

        System.out.printf("\nPlayer %d wins!", isPlayerOneTurn ? 1 : 2);

        sc.close();
    }

    private static int getInputFromPlayer(Scanner sc, boolean computer, int sticks, boolean isPlayerOneTurn) {
        while (true) {
            System.out.printf("\nPlayer %d take 1-3 sticks: ", isPlayerOneTurn ? 1 : 2);
            int n;
            if(isPlayerOneTurn || computer == false) {
                n = sc.nextInt();
            }
            else {
                n = getSticksFromKI(sticks);
            }

            if (n > 0 && n < 4) {
                return n;
            }
        }
    }

    private static int getSticksFromKI(int sticks) {
        int n = (sticks - 1) % 4;
        if (n == 0)
            n = 3;
        System.out.println(n);
        return n;
    }

    public static void printSticks(int sticks) {
        System.out.println("\nSticks left: " + sticks);
        for (int i = 1; i <= sticks; i++) {
            System.out.print("|");
            if(i % 5 == 0)
                System.out.print(" ");
        }
        System.out.println();
    }

    public static int getStartingSticks(Scanner sc) {
        int sticks = 0;
        while (sticks < 20 || sticks > 100) {
            System.out.println("How many sticks to start (between 20 and 100): ");
            sticks = sc.nextInt();
        }
        return sticks;
    }
}
