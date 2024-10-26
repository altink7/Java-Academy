package at.altin.strukturierteprogrammierung.class10_compound_data_types.person_demo;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        Person[] persons = new Person[3];

        persons[0] = createPerson("John", "Doe", 'm', 1, 1, 1970);
        persons[1] = createPerson("Jane", "Doe", 'w', 31, 12, 1972);
        persons[2] =  persons[1]; //createPerson("Jack", "Doe", 'm', 12, 8, 1973);

        persons[2].dateOfBirth.year = 2000;

        printPersons(persons);

        sc.close();
    }

    private static void printPersons(Person[] persons) {
        for (Person p : persons ) {
            printPerson(p);
        }
    }

    private static Person scanPerson(){
        System.out.print("Vorname: ");
        String fn = sc.next();
        System.out.print("Nachname: ");
        String ln = sc.next();

        Person p = createPerson(fn, ln, 'M', 1, 1, 1999);

        return p;
    }

    private static Person createPerson(String fn, String ln, char sex, int dobDay, int dobMonth, int dobYear) {
        Person p = new Person();
        p.fn = fn;
        p.ln = ln;
        p.sex = sex;
        p.dateOfBirth = createDate(dobDay, dobMonth, dobYear);
        return p;
    }

    private static Date createDate(int day, int month, int year) {
        Date d = new Date();
        d.day = day;
        d.month = month;
        d.year = year;
        return d;
    }

    private static void printPerson(String fn, String ln, char sex, int dobDay, int dobMonth, int dobYear) {
        System.out.printf("%s %s, %c, %02d.%02d.%04d\n", fn, ln, sex, dobDay, dobMonth, dobYear);
    }

    private static void printPerson(Person p) {
        System.out.printf("%s %s, %c, %02d.%02d.%04d\n",
                p.fn, p.ln, p.sex, p.dateOfBirth.day, p.dateOfBirth.month, p.dateOfBirth.year);
    }
}
