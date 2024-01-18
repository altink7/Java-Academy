package at.altin.fh.g.exam.practice;

public class Rechteck extends Figur implements Flaeche{
    private double hoehe;
    private double breite;


    public Rechteck(double xKoord, double yKoord) {
        super(xKoord, yKoord);
    }

    @Override
    boolean enthaelt(Punkt pPunkt) {
        //TODO: enhaelt die Form den Punkt
        return false;
    }

    @Override
    public double flaechenInhalt() {
        //TODO: berechne Flaecheninhalt
        return 0;
    }
}
