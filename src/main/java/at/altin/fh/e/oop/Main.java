package at.altin.fh.e.oop;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("rot", 2023,"marke");

        boolean isDasSelbeAuto = Objects.equals(auto1, new Auto());
        boolean isDasSelbeAutoEigeneMethode = auto1.equals(new Auto());

        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(isDasSelbeAuto);
        System.out.println(isDasSelbeAutoEigeneMethode);
    }
}
