package at.altin.fh.lpw.onlineshop;

public class Produkt {
    private int nummer;
    private String bezeichnung;
    private double preis;

    public Produkt(int nummer, String bezeichnung, double preis) {
        this.nummer = nummer;
        this.bezeichnung = bezeichnung;
        this.preis = preis;
    }

    public Produkt() {
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getNummer() {
        return nummer;
    }

    public void setNummer(int nummer) {
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return "Pos " + nummer + ": " + bezeichnung + " " + preis;
    }
}
