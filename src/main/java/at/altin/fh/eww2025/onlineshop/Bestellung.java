package at.altin.fh.eww2025.onlineshop;

import at.altin.fh.lpw.onlineshop.Kunde;
import at.altin.fh.lpw.onlineshop.Produkt;
import at.altin.fh.lpw.onlineshop.RegistrierterKunde;

import java.util.Arrays;

public class Bestellung {
    private int nummer;
    private at.altin.fh.lpw.onlineshop.Kunde kunde;
    private at.altin.fh.lpw.onlineshop.Produkt[] produkte;


    public double getGesamtPreis() {
        double gesamtPreis = 0;

        for (int i = 0; i < produkte.length; i++) {
            at.altin.fh.lpw.onlineshop.Produkt produkt = produkte[i];

            if (produkt != null) {
                gesamtPreis+=produkt.getPreis();
            }
        }

        if(kunde instanceof RegistrierterKunde) {
            gesamtPreis*=0.95;
        }

        return gesamtPreis;
    }

    public Bestellung(int nummer, at.altin.fh.lpw.onlineshop.Kunde kunde, at.altin.fh.lpw.onlineshop.Produkt[] produkte) {
        this.nummer = nummer;
        this.kunde = kunde;
        this.produkte = produkte;
    }

    public Bestellung() {
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    public at.altin.fh.lpw.onlineshop.Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public at.altin.fh.lpw.onlineshop.Produkt[] getProdukte() {
        return produkte;
    }

    public void setProdukte(Produkt[] produkte) {
        this.produkte = produkte;
    }
}
