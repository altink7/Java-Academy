package at.altin.fh.g.exam.practice;


public class Kreis extends Figur implements Flaeche{
    private double radius;


    public Kreis(double xKoord, double yKoord) {
        super(xKoord, yKoord);
    }

    @Override
    boolean enthaelt(Punkt pPunkt) {
        //TODO: enhaelt die Form den Punkt
        return false;
    }

    public Punkt getMittelpunkt() {
        //TODO berechne Mittelpunkt, und return ein richtigen Punkt
        return new Punkt(1.0,1.0);
    }

    @Override
    public double flaechenInhalt() {
        // TODO: berechne Flaechen Inhalt
        return 0;
    }
}
