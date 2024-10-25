package at.altin.fh.lpw.onlineshop;

public class Main {

    public static void main(String[] args) {
        Kunde[] kunden = new Kunde[3];

        kunden[0] = new Kunde();
        kunden[1] = new Gast();

        // 1: Kunden erstellen
        RegistrierterKunde annaMusterfrau = new RegistrierterKunde();
        annaMusterfrau.setName("Anna Musterfrau");
        annaMusterfrau.setEmail("anna@musterfrau.com");
        annaMusterfrau.setAdresse("Hauptstraße 1, 1400 Entenhausen");

        Bestellung bestellung = bestellen(annaMusterfrau);

        //BESTELLUNG
        //        ===========
        //Kunde: Anna Musterfrau (anna@musterfrau.com), Hauptstraße 1, 1400 Entenhausen
        //Pos 1: Slalomski 350,00
        //Pos 2: Skibrille 125,60
        //Pos 3: Skischuhe 479,20
        //Rabatt: 47,74
        //Gesamtpreis: 907,06
        printBestellung(bestellung);
    }

    private static void printBestellung(Bestellung bestellung) {
        System.out.println("BESTELLUNG");
        System.out.println("===========");
        System.out.println("Kunde: " + bestellung.getKunde().getName() + " (" + bestellung.getKunde().getEmail() + "), " + bestellung.getKunde().getAdresse());
        Produkt[] produkte = bestellung.getProdukte();
        for (int i = 0; i < produkte.length; i++) {
            Produkt produkt = produkte[i];

            if(produkt == null) {
                break;
            }

            System.out.println("Pos " + produkt.getNummer() + ": " + produkt.getBezeichnung() + " " + produkt.getPreis());
        }
        System.out.println("Rabatt: " + (bestellung.getGesamtPreis() - bestellung.getGesamtPreis() * 0.95));
        System.out.println("Gesamtpreis: " + bestellung.getGesamtPreis());
    }

    private static Bestellung bestellen(Kunde kunde) {
        // 2: Warenkorb erstellen
        Warenkorb warenkorbOfRegistriertenKunde = new Warenkorb();
        // 3: Produkte erstellen
        Produkt slalomSki = new Produkt(1, "Slalomski", 350);
        Produkt skiBrille = new Produkt(2, "Skibrille", 125.60);
        Produkt skiSchuhe = new Produkt(3, "Skischuhe", 479.20);

        // 4: Produkte zum Warenkorb hinzufügen
        warenkorbOfRegistriertenKunde.addProdukt(slalomSki);
        warenkorbOfRegistriertenKunde.addProdukt(skiBrille);
        warenkorbOfRegistriertenKunde.addProdukt(skiSchuhe);

        // 5: Eine Bestellung aufgeben (erstellt)
        Bestellung bestellung = new Bestellung();
        bestellung.setNummer(123456);
        bestellung.setKunde(kunde);
        // 6: Alle Produkte vom Warenkorb werden zu Bestellung hinzugefuegt
        bestellung.setProdukte(warenkorbOfRegistriertenKunde.getProdukte());

        return bestellung;
    }
}
