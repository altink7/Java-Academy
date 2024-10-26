package at.altin.strukturierteprogrammierung.class1_calculations_and_formatted_input.calculations;

public class MixedArithmeticDemo {

    public static void main(String[] args) {
        System.out.println("***Mixed Arithmetic Demo***");
        System.out.printf("%f%n", 1. + 3 /4 );
        System.out.printf("%f%n", 1 + 3./4 );
        System.out.printf("%f%n", 1 + 3 /4.);
        System.out.printf("%f%n", 1 + (double) 3 /4); //casting integer value 3 to double before devision
        System.out.printf("%d%n", (int) (1 + 3. /4)); //casting the result to integer
    }
}
