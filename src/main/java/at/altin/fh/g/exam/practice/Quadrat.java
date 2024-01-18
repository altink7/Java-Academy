package at.altin.fh.g.exam.practice;

public class Quadrat extends Rechteck {

    private Punkt punkt;

    public Quadrat(double xKoord, double yKoord, double breite) {
        // hoehe und breite sind gleich deswegen wird für beide das selbe übergeben!
        super(xKoord, yKoord, breite, breite);
    }


    @Override
    public boolean habIchEineForm() {
        // entweder parent hat eine form oder mein punkt ist nicht null
        return super.habIchEineForm() || getPunkt() != null;
    }

    public Punkt getPunkt() {
        return punkt;
    }

    public void setPunkt(Punkt punkt) {
        this.punkt = punkt;
    }
}
