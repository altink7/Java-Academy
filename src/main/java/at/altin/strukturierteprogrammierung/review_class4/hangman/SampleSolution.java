package at.altin.strukturierteprogrammierung.review_class4.hangman;

import java.util.Scanner;

public class SampleSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word to guess: ");
        String word = sc.nextLine();
        word = addSpaces(word);

        // add new lines so that input is not visible anymore
        for(int i = 0; i<50; i++)
            System.out.println();

        String guessedChars = " ";
        String hidden = hideCharacters(word, guessedChars);
        int turns = 0;
        int lives = 7;

        while(lives > 0 && hidden != word) {
            System.out.println(hidden);
            printStickman(lives);
            System.out.println("Lives left: " + lives);
            System.out.println("GuessedCharacters:" + guessedChars);

            String guess = getGuess(sc, guessedChars).toLowerCase();
            guessedChars += getUpperLower(guess);
            if(!word.toLowerCase().contains(guess))
                lives--;
            hidden = hideCharacters(word, guessedChars);
            turns++;
        }
        printEndMessage(word, turns, lives);


        sc.close();

    }

    public static String addSpaces(String word) {
        //ersetze jedes zeichen außer " " durch ein Leerzeichen gefolgt von dem Zeichen
        return word.replaceAll("([^ ])", " $1");

        //Alternative wäre ersetze jedes Zeichen
        //return word.replaceAll("(.)", " $1");
    }

    public static String hideCharacters(String word, String guessedChars) {
        return word.replaceAll("[^" + guessedChars + "]", "_");
    }

    public static String getGuess(Scanner sc, String guessedChars) {
        System.out.print("Guess: ");
        String guessedChar = sc.next();
        while(!guessedChar.matches("[a-zA-Z]") || guessedChars.contains(guessedChar)) {
            System.out.print("Guess again: ");
            guessedChar = sc.next();
        }
        return guessedChar;
    }

    public static String getUpperLower(String character) {
        return character.toUpperCase() + character.toLowerCase();
    }

    public static void printEndMessage(String word, int turns, int lives) {
        if(lives > 0) {
            System.out.println("You WON in " + turns + " turns with " + lives + " lives left!");
        }
        else {
            System.out.println("You LOSE! No lives are left.");
        }
        System.out.println("The word was:" + word);
    }

    public static void printStickman(int lives) {
        String r1 = lives < 7 ? "|" : " ";
        String r2 = lives < 6 ? "O" : " ";
        String r3 = (lives < 1 ? "/" : " ") + (lives < 5 ? "|" : " ") + (lives < 2 ? "\\" : " ");
        String r4 = (lives < 3 ? "/" : " ") + " " + (lives < 4 ? "\\" : " ");
        System.out.println(
            "  _____\n" +
            "  " + r1 + "   |\n" +
            "  " + r2 + "   |\n" +
            " " + r3 + "  |\n" +
            " " + r4 + "  |\n" +
            "     ---"
        );
    }
}
