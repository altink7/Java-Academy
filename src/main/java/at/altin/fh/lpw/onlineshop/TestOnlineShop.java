package at.altin.fh.lpw.onlineshop;

import at.altin.fh.lpw.onlineshop.unger.*;

public class TestOnlineShop {
    public static void main(String[] args) {
        RegistrierterKunde kunde1 = new RegistrierterKunde();
        RegistrierterKunde kunde2 = new RegistrierterKunde("maxmustermann@gmail.com", "Max Mustermann", "Musterstraße 1", 123456789);
        Gast kunde3 = new Gast();
        Gast kunde4 = new Gast("doloresbauer@gmail.com", "Dolores Bauer", "Bauerweg 3");
        Kunde[] kunden = {
                new RegistrierterKunde("weissjosef@gmx.com", "Josef Weiß", "Abcweg 1", 123),
                new Gast("heidi@gmail.com", "Heidi Blau", "Gasse 1"),
                new RegistrierterKunde("bobgreen@gmail.at", "Bob Green", "Straße 5", 456),
                new Gast(),
                new RegistrierterKunde("annaGelb@gmail.com", "Anna Gelb", "Hauptstraße 11", 789),
        };

        kunde4.setEmail("d.bauer@gmail.com");
        kunden[3].setName("Otto Müller");

        for (int i=0; i<kunden.length; i++){
            if(kunden[i].getName().equals("Otto Müller")){
                System.out.println("Otto Müller gefunden!");
            }
        }

        for (int i = 0; i < kunden.length; i++) {
            if(kunden[i].getNummer() == 456)
                System.out.printf("Name: %s E-Mail: %s", kunden[i].getName(), kunden[i].getEmail());
        }

        System.out.println("\nKundenliste: ");
        for (int i = 0; i < kunden.length; i++) {
            System.out.printf("E-Mail: %s; Name: %s; Adresse: %s; Nummer: %d\n", kunden[i].getEmail(), kunden[i].getName(), kunden[i].getAdresse(), kunden[i].getNummer());
        }

        Produkt produkt1 = new Produkt();
        Produkt produkt2 = new Produkt(1, "Apfel", 1.23);
        Produkt produkt3 = new Produkt(2, "Birne", 1.11);
        Produkt produkt4 = new Produkt(3, "Kartoffel", 0.89);
        Produkt produkt5 = new Produkt(4, "Ananas", 2.45);

        Warenkorb warenkorb1 = new Warenkorb();
        warenkorb1.produkte[0] = produkt2;
        warenkorb1.produkte[1] = produkt3;

        Warenkorb warenkorb2 = new Warenkorb();
        warenkorb2.add(produkt2);
        warenkorb2.add(produkt3);
        warenkorb2.add(produkt4);
        warenkorb2.add(produkt5);

        warenkorb2.remove(produkt3);

        kunde3.warenkorb.add(produkt1);
        kunde3.warenkorb.add(produkt2);
        int i = 0;
        i += 1;


        //Implementierung aller relevanten toString-Methoden für Ausgabe Kundenliste
        //Als System.out.print(kunden[i])

        //Ausgabe Kunde und zugehörige Produkte im Warenkorb
    }
}
