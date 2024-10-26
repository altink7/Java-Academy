package at.altin.strukturierteprogrammierung.self_study_l_stack_queue.linked_list_2.billa_problem;

import java.util.Scanner;

class Person {
    String name;
    Person next;
}

class PersonList {
    Person head;
}

public class Main {

    public static void add_tail(PersonList list, String name) {
        Person p = new Person();
        p.name = name;

        if (list.head == null){
            list.head = p;
        }
        else {
            Person i = list.head;
            while(i.next != null)
                i = i.next;

            i.next = p;
        }
    }

    public static Person remove_head(PersonList list) {
        if (list.head == null)
            return null;

        Person cur = list.head;
        list.head = cur.next;

        return cur;
    }

    public static int count(PersonList list) {
        int count = 0;
        for (Person i = list.head; i != null; i = i.next)
            count++;

        return count;
    }

    public static void print_list(String header, PersonList list) {
        System.out.printf("%s: %d\n", header, count(list));
        for (Person i = list.head; i != null; i = i.next) {
            System.out.printf("%s ", i.name);
        }
        System.out.printf("\n");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Lists here
        PersonList personen = new PersonList();
        PersonList kassa1 = new PersonList();
        PersonList kassa2 = new PersonList();

        while (true) {
            String n;
            System.out.printf(": ");
            n = sc.next();

            if (n.equals("-"))
                break;

            // Add person
            add_tail(personen, n);
        }

        boolean run = true;
        while (run) {
            // Print here
            print_list("Personen", personen);
            print_list("Kassa 1", kassa1);
            print_list("Kassa 2", kassa2);

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
                    if (personen == null)
                        break;

                    Person p = remove_head(personen);

                    if (count(kassa1) > count(kassa2)) {
                        add_tail(kassa2, p.name);
                    } else {
                        add_tail(kassa1, p.name);
                    }

                    break;
                case "1":
                    // kassa1
                    remove_head(kassa1);
                    break;
                case "2":
                    // kassa2
                    remove_head(kassa2);
                    break;
            }
        }

        sc.close();
    }
}
