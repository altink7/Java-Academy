package at.altin.fh.eww2026;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("############");
        System.out.println("#Calculator#");
        System.out.println("############");

        System.out.print("Bitte erste Zahl eingeben: ");
        double ersteZahl = scanner.nextDouble();

        System.out.print("Bitte geben sie den Operator ein: (+, -, *, /, %)");
        String operator = scanner.next();

        System.out.print("Bitte zweite Zahl eingeben: ");
        double zweiteZahl = scanner.nextDouble();


        //Symbol Operation
        //'<' Less Than
        //'<=' Less Than Or Equal
        //'>' Greater Than
        //'>=' Greater Than Or Equal
        //'==' Equal
        //'!=' Not Equal
        // POPO ewwww

        // Symbol Operation
        //'&&' And
        //'||' Or
        //'!' Not (unary operator)

        //Symbol Operation
        //'+' Addition
        //'-' Subtraction
        //'*' Multiplication
        //'/' Division
        //'%' Modulo
          /*
            String ergebnis = switch (operator) {
            case "+" -> Integer.valueOf(ersteZahl + zweiteZahl).toString();
            case "-" -> Integer.valueOf(ersteZahl - zweiteZahl).toString();
            case "*" -> Integer.valueOf(ersteZahl * zweiteZahl).toString();
            case "/" -> (zweiteZahl == 0) ? "ungültig" : Integer.valueOf(ersteZahl / zweiteZahl).toString();
            case "%" -> (zweiteZahl == 0) ? "ungültig" : Integer.valueOf(ersteZahl % zweiteZahl).toString();
            default -> System.out.println("Überprüfe deine Eingabe"); break;
        };

        System.out.printf("Ergebnis ist: %s", ergebnis);

             */
        if (operator.equals("+")) {
            double ergebnis = ersteZahl + zweiteZahl;
            System.out.printf("\tErgebnis ist: %s", ergebnis);
        }

        if (operator.equals("-")) {
            double ergebnis = ersteZahl - zweiteZahl;
            System.out.printf("\tErgebnis ist: %s", ergebnis);
        }

        if (operator.equals("*")) {
            double ergebnis = ersteZahl * zweiteZahl;
            System.out.printf("\tErgebnis ist: %s", ergebnis);
        }

        if (operator.equals("/")) {
            if (zweiteZahl == 0) {
                System.out.println("Division durch 0 ist nicht erlaubt");
            } else {
                double ergebnis = ersteZahl / zweiteZahl;
                System.out.printf("\tErgebnis ist: %s", ergebnis);
            }
        }

        if (operator.equals("%")) {
            if (zweiteZahl == 0) {
                System.out.println("Division durch 0 ist nicht erlaubt");
            } else {
                double ergebnis = ersteZahl % zweiteZahl;
                System.out.printf("\tErgebnis ist: %s", ergebnis);
            }
        }
    }
}
