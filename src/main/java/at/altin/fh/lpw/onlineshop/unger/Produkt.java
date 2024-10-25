package at.altin.fh.lpw.onlineshop.unger;

public class Produkt {
    private int nummer;
    private String bezeichnung;
    private double preis;

    public Produkt(){
        this.nummer=0;
        this.bezeichnung="leer";
        this.preis=0.0;
    }

    public Produkt(int pNummer, String pBezeichnung, double pPreis){
        this.nummer = pNummer;
        this.bezeichnung = pBezeichnung;
        this.preis = pPreis;
    }

    public int getNummer(){
        return this.nummer;
    }
    //Implementierung aller relevanten Get- und Set-Methoden
}
