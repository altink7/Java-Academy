package at.altin.fh.g.exam.practice;

/**
 * Abstract Class Figur
 */
public abstract class Figur {
    private double xKoord;
    private double yKoord;

    public Figur(double xKoord, double yKoord) {
        this.xKoord = xKoord;
        this.yKoord = yKoord;
    }

    abstract boolean enthaelt(Punkt pPunkt);

    public double getxKoord() {
        return xKoord;
    }

    public double getyKoord() {
        return yKoord;
    }
}
