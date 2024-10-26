package at.altin.strukturierteprogrammierung.self_study_b_variables_and_selection.formatted_input2;

import java.util.Scanner;

public class AgeOfEmpires {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your age: ");
        int age = sc.nextInt();
        System.out.printf("%%d:   ~%d~\n", age);
        System.out.printf("%%+d:  ~%+d~\n", age);
        System.out.printf("%% d:  ~% d~\n", age);
        System.out.printf("%%5d:  ~%5d~\n", age);
        System.out.printf("%%05d: ~%05d~\n", age);
        System.out.printf("%%-5d: ~%-5d~\n", age);
        System.out.printf("%%#x:  ~%#x~\n", age);
    }
}
