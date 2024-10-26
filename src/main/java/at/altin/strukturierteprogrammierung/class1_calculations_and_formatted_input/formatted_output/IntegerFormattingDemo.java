package at.altin.strukturierteprogrammierung.class1_calculations_and_formatted_input.formatted_output;

public class IntegerFormattingDemo {
    public static void main(String[] args) {
        System.out.printf("Freitag, 15.09.2017\n");
        System.out.printf("Freitag, %d.09.2017\n", 15);
        System.out.printf("Freitag, %d.%d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%2d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%02d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%-2d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%+2d.%d\n", 15, 9, 2017);
        System.out.printf("Freitag, %d.%+-8d.%d\n", 15, -9, 2017);
        System.out.printf("Freitag, %02d.%02d.%4d\n\n", 15, 9, 2017);
    }
}
