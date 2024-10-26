package at.altin.strukturierteprogrammierung.class1_calculations_and_formatted_input.formatted_output;

public class FloatingPointFormattingDemo {

    public static void main(String[] args) {

        System.out.printf("(19.2°C)\n");
        System.out.printf("(%f°C)\n", 19.2);
        System.out.printf("(%.2f°C)\n", 19.2);
        System.out.printf("(%10.2f°C)\n", 19.2);
        System.out.printf("(%+010.2f°C)\n", 19.2);
    }

}
