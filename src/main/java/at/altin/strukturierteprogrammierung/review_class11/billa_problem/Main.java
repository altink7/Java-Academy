package at.altin.strukturierteprogrammierung.review_class11.billa_problem;


import java.util.Scanner;

class Person {
    String name;
    Person next;
}

class PersonList {
    Person head;
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PersonList personen = new PersonList();
        PersonList kassa1 = new PersonList();
        PersonList kassa2 = new PersonList();

        while (true) {
            String n;
            System.out.printf(": ");
            n = sc.next();

            if (n.equals("-"))
                break;

            addBack(personen, n);
        }

        boolean run = true;
        while (run) {
            print("Personen", personen);
            print("Kassa 1", kassa1);
            print("Kassa 2", kassa2);

            String c;
            System.out.printf(": ");
            c = sc.next();

            if (c.equals("-"))
                break;

            switch (c) {
                case "-":
                    run = false;
                    break;
                case "a":
                    // anstellen
                    String name = removeFront(personen);
                    if(size(kassa1) > size(kassa2))
                        addBack(kassa2, name);
                    else
                        addBack(kassa1, name);
                    break;
                case "1":
                    // kassa1
                    removeFront(kassa1);
                    break;
                case "2":
                    // kassa2
                    removeFront(kassa2);
                    break;
            }
        }

        sc.close();

    }

    private static String removeFront(PersonList list) {
        Person p = list.head;

        if(p == null){
            return "Keine Personen in der Liste.";
        }

        list.head = p.next;
        return p.name;
    }

    private static void print(String listName, PersonList list) {
        System.out.printf("%s: %d\n", listName, size(list));
        Person cur = list.head;
        while (cur != null) {
            System.out.printf("%s ", cur.name);
            cur = cur.next;
        }
        System.out.println();
    }

    private static void addBack(PersonList list, String n) {
        Person person = new Person();
        person.name = n;

        if(list.head == null){
            list.head = person;
        }
        else {
            Person cur = list.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = person;
        }
    }

    private static int size(PersonList list) {
        Person cur = list.head;
        int cnt = 0;
        while (cur != null) {
            cnt++;
            cur = cur.next;
        }

        return cnt;
    }
}
