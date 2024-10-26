package at.altin.strukturierteprogrammierung.self_study_n_graphs.person_bst;

import java.util.Scanner;

class Date {
    int d, m, y;
}

class Person {
    String fn, ln;
    Date dob = new Date();
    double weight, height;
}

class BSTNode {
    Person data;
    BSTNode left, right;
}

public class Main {

    static final int BY_LASTNAME = 1;
    static final int BY_FIRSTNAME = 2;
    static final int BY_DOB = 3;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        BSTNode bst1 = null;
        BSTNode bst2 = null;
        BSTNode bst3 = null;

        Person p;
        while ( (p = scanPerson(sc)) !=null) {

            bst1 = insert(bst1, p, BY_LASTNAME);
            bst2 = insert(bst2, p, BY_FIRSTNAME);
            bst3 = insert(bst3, p, BY_DOB);

        }


        inorderln(bst1);
        inorderln(bst2);
        inorderln(bst3);

        sc.close();

    }

    private static void inorderln(BSTNode bst) {
        System.out.println("[");
        inorder(bst);
        System.out.println("]");
    }

    private static void inorder(BSTNode bst) {
        if(bst == null)
            return;

        inorder(bst.left);
        System.out.println(formatPerson(bst.data));
        inorder(bst.right);
    }

    public static String formatPerson(Person p) {
        return String.format("%-10s %-10s %02d.%02d.%04d  %.2fm  %.1fkg", p.fn, p.ln, p.dob.d, p.dob.m, p.dob.y, p.height, p.weight);
    }

    public static int compare(Person p1, Person p2, int comparator) {
        if(p1 == null){
            if(p2 == null)
                return 0;
            return -1;
        }

        if(p2 == null)
            return 1;

        switch (comparator){
            case 1:
                return p1.ln.compareTo(p2.ln);
            case 2:
                return p1.fn.compareTo(p2.fn);
            case 3:
                int y = Integer.compare(p1.dob.y, p2.dob.y);
                if (y != 0)
                    return y;
                int m = Integer.compare(p1.dob.m, p2.dob.m);
                if (m != 0)
                    return m;
                return Integer.compare(p1.dob.d, p2.dob.d);
        }

        return 0;
    }

    private static BSTNode insert(BSTNode bst, Person data, int comparator) {
        if (bst == null) {
            BSTNode newNode = new BSTNode(); // create the new node
            newNode.data = data;
            return newNode;
        }
        int comp = compare(data, bst.data, comparator);
        if (comp < 0)
            bst.left = insert(bst.left, data, comparator); // insert left
        else if (comp > 0)
            bst.right = insert(bst.right, data, comparator); // insert right
        else
            System.out.println("already inserted: " + formatPerson(data));
        return bst;
    }

    public static Person scanPerson(Scanner sc) {
        System.out.printf("Enter Person data: ");
        String f = sc.next();
        if (f == null || f.isEmpty() || f.equals("-"))
            return null;
        String l = sc.next();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();
        double h = sc.nextDouble();
        double w = sc.nextDouble();

        return makePerson(f, l, d, m, y, h, w);
    }
    public static Person makePerson(//
                                    String f, String l, //
                                    int d, int m, int y, //
                                    double h, double w) {
        Person p = new Person();
        // init
        p.fn = f;
        p.ln = l;
        p.dob.d = d;
        p.dob.m = m;
        p.dob.y = y;
        p.height = h;
        p.weight = w;
        return p;

    }
}
