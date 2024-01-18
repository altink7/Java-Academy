package at.altin.fh.g.exam.practice;

public class Punkt extends Figur{

    public Punkt(double xKoord, double yKoord) {
        super(xKoord, yKoord);
    }

    @Override
    boolean enthaelt(Punkt pPunkt) {
        return false;
    }
}
