package at.altin.strukturierteprogrammierung.class1_calculations_and_formatted_input.formatted_output;

public class StringFormattingDemo {

    public static void main(String[] args) {

        System.out.printf("|%s|\n", "Freitag");
        System.out.printf("|%10s|\n", "Freitag");
        System.out.printf("|%-10s|\n", "Freitag");
        System.out.printf("|%S|\n", "Freitag");
        System.out.printf("|%2.3S|\n", "Freitag");

    }
}
