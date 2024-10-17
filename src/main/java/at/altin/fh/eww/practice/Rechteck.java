package at.altin.fh.eww.practice;

public class Rechteck extends Figur implements Flaeche {
    private Kreis kreis;
    private double hoehe;
    private double breite;


    public Rechteck(double xKoord, double yKoord, double hoehe, double breite) {
        super(xKoord, yKoord);
        this.breite = breite;
        this.hoehe = hoehe;
    }

    @Override
    boolean enthaelt(Punkt pPunkt) {
        // between xkord + breite
        // between yKord - hoehe

        //check if I missed something logically
        return pPunkt.getxKoord() <= (getxKoord() + breite) && pPunkt.getxKoord() >= getxKoord() &&
                pPunkt.getyKoord() >= (getyKoord() - hoehe) && pPunkt.getyKoord() <= pPunkt.getyKoord();
    }

    @Override
    public double flaechenInhalt() {
        return hoehe * breite;
    }

    public boolean habIchEineForm() {
        return getKreis() != null;
    }

    public void setKreis(Kreis kreis) {
        this.kreis = kreis;
    }

    public Kreis getKreis() {
        return kreis;
    }
}
