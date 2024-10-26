package at.altin.strukturierteprogrammierung.self_study_e_functions.function;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        print();
        String name = sc.next();
        print(name);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        print(number1, number2);

        System.out.println();

        int sum = add(number1, number2);
        System.out.println(sum);
        float division = divide(number1, number2);
        System.out.println(division);

        sc.close();
    }

    private static int min(int number1, int number2){
        if (number1 < number2)
            return number1;
        else
            return number2;
    }

    private static float divide(int number1, int number2) {
        if (number2 == 0) {
            System.out.println("division by zero is not allowed!");
        }
        else {
            float result = (float)number1 / number2;
            return result;
        }

        return 0;
    }

    private static int add(int number1, int number2) {
        return number1 + number2;
    }

    private static void print(){
        System.out.print("Please enter name:");
    }

    private static void print(String name){
        System.out.printf("Welcome %s! Please enter two numbers:", name);
    }

    private static void print(int n1, int n2){
        System.out.printf("%d * %d = %d", n1, n2, n1*n2);
    }
}
