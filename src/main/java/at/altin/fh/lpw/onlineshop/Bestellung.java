package at.altin.fh.lpw.onlineshop;

public class Bestellung {
    private int nummer;
    private Kunde kunde;
    private Produkt[] produkte;


    public double getGesamtPreis() {
        double gesamtPreis = 0;

        for (int i = 0; i < produkte.length; i++) {
            Produkt produkt = produkte[i];

            if (produkt == null) {
                break;
            }

            gesamtPreis+=produkt.getPreis();
        }

        if(kunde instanceof RegistrierterKunde) {
            gesamtPreis*=0.95;
        }

        return gesamtPreis;
    }

    public Bestellung(int nummer, Kunde kunde, Produkt[] produkte) {
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

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public Produkt[] getProdukte() {
        return produkte;
    }

    public void setProdukte(Produkt[] produkte) {
        this.produkte = produkte;
    }
}
