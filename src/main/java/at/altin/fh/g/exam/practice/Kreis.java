package at.altin.fh.g.exam.practice;


public class Kreis extends Figur implements Flaeche{
    private double radius;


    public Kreis(double xKoord, double yKoord, double radius) {
        super(xKoord, yKoord);
        this.radius = radius;
    }

    @Override
    boolean enthaelt(Punkt pPunkt) {
        // formel fuer kreis: (x - x0)^2 + (y - y0)^2 <= r^2
        return Math.pow(pPunkt.getxKoord() - getxKoord(), 2)
                + Math.pow(pPunkt.getyKoord() - getyKoord(), 2) <= Math.pow(radius, 2);
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
