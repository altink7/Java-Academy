package at.altin.strukturierteprogrammierung.review_class10.schuhshop;

import java.util.Scanner;

class Node {
    Schuhmodell data;
    Node next;
}

class SchuhmodellLinkedList {
    Node head;
    int size = 0;
}

class KundenArrayList {
    Kunde[] data = new Kunde[2];
    int size = 0;
}

public class Schuhshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SchuhmodellLinkedList produktkatalog = new SchuhmodellLinkedList();
        KundenArrayList kundenkartei = new KundenArrayList();
        SchuhmodellLinkedList verkaufteSchuhe = new SchuhmodellLinkedList();

        System.out.println("Willkommen im Schuhshop!");
        System.out.println("Operationscodes: \n"
                + "1 Neues Modell hinzufügen \n"
                + "2 Neuen Kunden hinzufügen \n"
                + "3 Produktkatalog anzeigen \n"
                + "4 Kundenkartei anzeigen \n"
                + "5 Schuh verkaufen \n"
                + "6 Bisherige Tageseinnahmen \n"
                + "7 Besten Kunden anzeigen \n"
                + "9 Demodaten hinzufügen \n"
                + "0 Programm beenden");
        while (true) {
            System.out.print("Operation: ");
            int operation = Integer.parseInt(sc.nextLine());
            Kunde k;
            switch (operation) {
                case 1:
                    System.out.println("Modell hinzufügen");
                    System.out.println("Modellname:");
                    String modellname = sc.nextLine();
                    System.out.println("Hersteller:");
                    String hersteller = sc.nextLine();
                    System.out.println("Preis:");
                    float preis = Float.parseFloat(sc.nextLine());
                    add(produktkatalog, createSchuhmodell(modellname, hersteller, preis));
                    break;
                case 2:
                    System.out.println("Kunde hinzufügen");
                    System.out.println("Name:");
                    k = new Kunde();
                    k.name = sc.nextLine();
                    add(kundenkartei, k);
                    break;
                case 3:
                    print(produktkatalog);
                    break;
                case 4:
                    print(kundenkartei);
                    break;
                case 5:
                    System.out.println("Schuh verkaufen:");
                    System.out.println("Kunden ID: ");
                    k = kundenkartei.data[Integer.parseInt(sc.nextLine())];
                    System.out.println("Schuh ID: ");
                    Schuhmodell schuh = get(produktkatalog, Integer.parseInt(sc.nextLine())).data;
                    add(verkaufteSchuhe, schuh);
                    add(k.gekaufteSchuhe, schuh);
                    break;
                case 6:
                    System.out.printf("Tageseinnahmen: %9.2f€\n", getSumme(verkaufteSchuhe));
                    break;
                case 7:
                    int id = getIdBesterKunde(kundenkartei);
                    k = kundenkartei.data[id];
                    System.out.printf("Bester Kunde:\n%3d %20s %8.2f€\n", id, k.name, getSumme(k.gekaufteSchuhe));
                case 9:
                    addDemoData(produktkatalog, kundenkartei);
                    break;
                case 0:
                    sc.close();
                    return;
            }
        }

    }

    private static int getIdBesterKunde(KundenArrayList kundenkartei) {
        float max = 0;
        int id = -1;
        for (int i = 0; i < kundenkartei.size; i++) {
            Kunde k = kundenkartei.data[i];
            float summe = getSumme(k.gekaufteSchuhe);
            if(summe > max) {
                max = summe;
                id = i;
            }
        }

        return id;
    }

    private static void addDemoData(SchuhmodellLinkedList produktkatalog, KundenArrayList kundenkartei) {

        add(produktkatalog, createSchuhmodell("AirMax", "Nike", 95.90f));
        add(produktkatalog, createSchuhmodell("C123", "Converse", 50f));
        add(produktkatalog, createSchuhmodell("MB12", "Manolo Blahnik", 500f));

        Kunde k = new Kunde();
        k.name = "Andreas";
        add(kundenkartei, k);
        k = new Kunde();
        k.name = "Julia";
        add(kundenkartei, k);
    }

    private static Schuhmodell createSchuhmodell(String modell, String hersteller, float preis) {
        Schuhmodell schuh = new Schuhmodell();
        schuh.modell = modell;
        schuh.herstellermarke = hersteller;
        schuh.preis = preis;
        return schuh;
    }

    private static void print(SchuhmodellLinkedList list){
        System.out.printf("%3s %20s %20s %9s\n", "ID", "Modellname", "Hersteller", "Preis");
        for (int i = 0; i < list.size; i++) {
            Schuhmodell schuh = get(list, i).data;
            System.out.printf("%3d %20s %20s %8.2f€\n", i, schuh.modell, schuh.herstellermarke, schuh.preis);
        }
        System.out.println();
    }

    private static void print(KundenArrayList list){
        System.out.printf("%3s %20s %9s\n", "ID", "Name", "Ausgaben");
        for (int i = 0; i < list.size; i++) {
            Kunde k = list.data[i];
            System.out.printf("%3d %20s %8.2f€\n", i, k.name, getSumme(k.gekaufteSchuhe));
        }
        System.out.println();
    }

    private static float getSumme(SchuhmodellLinkedList list) {
        float summe = 0;
        Node s = list.head;
        while (s != null) {
            summe += s.data.preis;
            s = s.next;
        }
        return summe;
    }

    private static Node get(SchuhmodellLinkedList list, int idx) {
        Node n = list.head;
        for(int i=0; i < idx; i++){
            if(n == null)
                return null;
            n = n.next;
        }
        return n;
    }

    private static void add(SchuhmodellLinkedList list, Schuhmodell modell){
        Node n = new Node();
        n.data = modell;
        list.size++;

        if(list.head == null){
            list.head = n;
        }
        else{
            Node cur = list.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = n;
        }
    }

    private static void add(KundenArrayList list, Kunde k) {
        if(list.data.length <= list.size) {
            resize(list, list.data.length * 2);
        }
        list.data[list.size] = k;
        list.size++;
    }

    private static void resize(KundenArrayList list, int size) {
        Kunde[] arr = new Kunde[size];
        for (int i = 0; i < list.data.length; i++) {
            arr[i] = list.data[i];
        }
        list.data = arr;
    }

}
