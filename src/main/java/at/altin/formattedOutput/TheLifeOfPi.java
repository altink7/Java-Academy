<package at.altin.formattedOutput;

public class TheLifeOfPi {

    /** PI_CONSTANT als alternative zu der Zahl selber*/
    public static final double PI_CONSTANT = Math.PI;

    /**
     * This is the main method of the class TheLifeOfPi. <br>
     * Requirements: <br>
     * Use this exercise to study how to produce formatted output of integer values with System.out.printf Display
     * the double number Pi (3.14159265359) in the several formats
     *  with default formatting
     * <ul>
     * <li>12 characters wide</li>
     * <li>12 characters wide with exactly two digits after the decimal point</li>
     * <li>10 characters wide without fractional part</li>
     * <li>13 characters wide with 11 digits after the decimal point</li>
     * <li>15 digits wide with leading zeros</li>
     * <li>15 characters wide, with two digits after the decimal point and leading zeros and sign</li>
     * </ul>
     */
    public static void main(String[] args) {
        // The Life of Pi
        System.out.println("The Life of Pi");
        System.out.println("--------------");

        // normally use the constant Math.PI for better Readability or
        // extract Constant with IntelliJ -> Refactor -> Introduce Constant to increase Readability
        // magic Numbers are Bad Practice
        double pi = 3.14159265359;

        System.out.println("Default formatting: " + pi);
        System.out.printf("12 characters wide: %12f\n", pi);
        System.out.printf("15 chars wide with two digits after the decimal point: %15.2f\n", pi);
        System.out.printf("10 characters wide without fractional part: %10.0f\n", pi);
        System.out.printf("13 chars + 11 after comma: %13.11f\n", pi);
        System.out.printf("15 digits wide with leading zeros: %015f\n", pi);
        System.out.printf("15 characters wide, with two digits after the decimal point and leading zeros and sign: %015.2f\n", pi);


        alternativeFormat(pi);

    }

    /**
     * ALTERNATIVE FORMAT
     * @param pi PI
     */
    private static void alternativeFormat(double pi) {

        if(pi < 3.13 || pi > 3.15) {
            System.out.println("check PI if right!");
        }


        System.out.println("Alternative Format");
        String defaultFormatedPi = String.format("Default formatting: %f", pi);
        String formatedPi12CharsWide = String.format("12 characters wide: %12f", pi);
        String formatedPi12CharsWideWithTwoDigitsAfterDecimalPoint = String.format("12 characters wide with exactly two digits after the decimal point: %12.2f", pi);
        String formatedPi10CharsWideWithoutFractionalPart = String.format("10 characters wide without fractional part: %10.0f", pi);
        String formatedPi13CharsWideWith11DigitsAfterDecimalPoint = String.format("13 characters wide with 11 digits after the decimal point: %13.11f", pi);
        //TODO: analog die anderen

        System.out.println(defaultFormatedPi);
        System.out.println(formatedPi12CharsWide);
        System.out.println(formatedPi12CharsWideWithTwoDigitsAfterDecimalPoint);
        System.out.println(formatedPi10CharsWideWithoutFractionalPart);
        System.out.println(formatedPi13CharsWideWith11DigitsAfterDecimalPoint);
    }
}
