package at.altin.strukturierteprogrammierung.self_study_l_stack_queue.linked_list_2.raupe_flitzi;

import java.util.Scanner;

class Segment {
    String type;
    Segment next;
}

public class Main {

    public static Segment createNode(String type) {
        Segment n = new Segment();
        n.type = type;
        return n;
    }

    public static Segment addHead(Segment head, String type) {
        Segment n = createNode(type);
        n.next = head;
        return n;
    }

    public static Segment addTail(Segment head, String type) {
        Segment n = createNode(type);

        if (head == null)
            return n;

        Segment p = head;
        while (p.next != null)
            p = p.next;

        p.next = n;

        return head;
    }

    public static Segment findNode(Segment head, String type) {
        for (Segment p = head; p != null; p = p.next) {
            if (p.type.equals(type))
                return p;
        }

        return null;
    }

    public static Segment removeNode(Segment head, Segment node) {
        if (head == null)
            return null;
        if (node == head) {
            return node.next;
        }

        for (Segment p = head; p != null; p = p.next) {
            if (p.next == node) {
                p.next = node.next;
                return head;
            }
        }

        /// error, node is not a member of the list
        return null;
    }

    public static void printList(Segment head) {
        for (Segment p = head; p != null; p = p.next) {
            System.out.printf("(%s)\n", p.type);
        }
    }

    public static Segment getAt(Segment head, int index) {
        Segment p = head;
        for (int i = 0; i < index; i++) {
            if (p == null)
                return null;
            p = p.next;
        }

        return p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Segment head = null;
        System.out.printf("Create:\n");

        while (true) {
            System.out.printf(": ");
            String t = sc.next();

            if (t.equals("x"))
                break;

            head = addTail(head, t);
        }

        System.out.printf("Action (p|g|d|s): ");
        String action, t;
        action = sc.next();

        switch (action) {
            case "p": /// Print
                printList(head);
                break;
            case "g": /// GetAt
                System.out.printf("Index: ");
                int idx = sc.nextInt();

                Segment s = getAt(head, idx);
                if (s != null) {
                    System.out.printf("(%s)\n", s.type);
                } else {
                    System.out.printf("Invalid index\n");
                }

                break;
            case "d": /// Delete
                System.out.printf("Type: ");
                t = sc.next();

                head = removeNode(head, findNode(head, t));
                break;
            case "s": /// Sublist
                System.out.printf("Type: ");
                t = sc.next();
                printList(findNode(head, t));
                break;
        }

        check(head);

        sc.close();
    }

    /* Don't touch this */
    public static void check(Segment t) {
        Segment v = t;
        for (int c = 0; v != null; System.out.printf("\n%d.%d", c++, v.type.charAt(0) - 65), v = v.next)
            ;
    }
}
