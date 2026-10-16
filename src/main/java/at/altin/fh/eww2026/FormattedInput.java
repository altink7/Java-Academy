package at.altin.fh.eww2026;

import java.util.Scanner;

public class FormattedInput {

    public static void main(String[] args) {
        boolean isStudent = true;
        int alter = 30;
        double temperatur = 19.2d;
        String name = "Jakob";

        short grade = 12;
        long studentenNr = 300000000L;
        float hoehe = 1.75f;
        char gender = 'a';



        Scanner scanner = new Scanner(System.in);
        //System.out.print(":");
        //String input = scanner.nextLine();
        //System.out.printf("You entered: %s\n", input);


        System.out.print("Wie ist dein Vorname:");
        String vorname = scanner.nextLine();
        System.out.print("Wie ist dein Nachname:");
        String nachname = scanner.nextLine();
        System.out.print("Wie lautet dein Geburtsdatum:");
        String geburtsdatum = scanner.nextLine();

        System.out.printf("User erfasst, Vorname: %s, Nachname: %s, Geburtsdatum: %s\n", vorname, nachname, geburtsdatum);




        scanner.close();
    }
}
