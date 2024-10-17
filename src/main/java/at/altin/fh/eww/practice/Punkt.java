package at.altin.fh.eww.practice;

public class Punkt extends Figur{

    public Punkt(double xKoord, double yKoord) {
        super(xKoord, yKoord);
    }

    @Override
    boolean enthaelt(Punkt pPunkt) {
        return pPunkt.getyKoord() == getyKoord() && pPunkt.getxKoord() == getxKoord();
    }

    @Override
    public String toString() {
        return String.format("Punkt, x: %f , y: %f", getxKoord(), getyKoord());
    }
}
