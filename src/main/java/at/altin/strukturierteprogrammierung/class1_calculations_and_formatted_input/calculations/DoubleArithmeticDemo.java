package at.altin.strukturierteprogrammierung.class1_calculations_and_formatted_input.calculations;

public class DoubleArithmeticDemo {

    public static void main(String[] args) {
        System.out.println("***Double Arithmetic Demo***");
        System.out.printf("%f + %f = %f\n", 19., 4., 19. + 4.);
        System.out.printf("%f - %f = %f\n", 19., 4., 19. - 4.);
        System.out.printf("%f * %f = %f\n", 19., 4., 19. * 4.);
        System.out.printf("%f / %f = %f\n\n", 19D, 4D, 19D / 4D);

        System.out.printf("    Min value: %g\n", Double.MIN_VALUE);
        System.out.printf("    Max value: %g\n", Double.MAX_VALUE);
        System.out.printf("Max value - 1: %g\n", Double.MAX_VALUE - 1);
        System.out.printf("Max value + 1: %g\n\n", Double.MAX_VALUE + 1);

        System.out.printf("%f / %f = %f\n", 19., 0., 19. / 0.);
        System.out.printf("%f / %f = %f\n", 0., 0., 0. / 0.);

        System.out.printf("%f\n", Double.POSITIVE_INFINITY * 42);
        System.out.printf("%f\n", Double.NaN * 42);
        System.out.printf("%f\n", Double.POSITIVE_INFINITY * Double.NaN);
    }
}
