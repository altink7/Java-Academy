package at.altin.fh.g.exam.practice;


public class Kreis extends Figur implements Flaeche{
    private double radius;


    public Kreis(double xKoord, double yKoord, double radius) {
        super(xKoord, yKoord);
        this.radius = radius;
    }

    @Override
    boolean enthaelt(Punkt pPunkt) {
        //TODO : google
        return false;
    }

    public Punkt getMittelpunkt() {
        return new Punkt(getxKoord() + radius,getyKoord() - radius);
    }

    @Override
    public double flaechenInhalt() {
        // formel fuer kreisflaeche: pi * r^2
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "radius=" + radius +
                '}';
    }
}
