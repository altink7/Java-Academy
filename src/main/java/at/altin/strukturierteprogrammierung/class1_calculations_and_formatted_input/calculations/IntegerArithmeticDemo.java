package at.altin.strukturierteprogrammierung.class1_calculations_and_formatted_input.calculations;

public class IntegerArithmeticDemo {

    public static void main(String[] args) {
        System.out.println("***Integer Arithmetic Demo***");
        System.out.printf("%d + %d = %d\n", 19, 4, 19 + 4);
        System.out.printf("%d - %d = %d\n", 19, 4, 19 - 4);
        System.out.printf("%d * %d = %d\n", 19, 4, 19 * 4);
        System.out.printf("%d / %d = %d\n", 19, 4, 19 / 4);
        System.out.printf("%d %% %d = %d\n", 19, 4, 19 % 4);
        //System.out.printf("%d / %d = %d\n", 19, 0, 19 / 0);

        System.out.printf("\n    Max value: %d\n", Integer.MAX_VALUE);
        System.out.printf("    Min value:%d\n", Integer.MIN_VALUE);
        System.out.printf("Max value + 1:%d\n", Integer.MAX_VALUE + 1);

        System.out.printf("\n%d + %d * %d = %d\n", 19, 2, 3,  19 + 2 * 3);
        System.out.printf("(%d + %d) * %d = %d\n", 19, 2, 3, (19 + 2) * 3);
    }
}
