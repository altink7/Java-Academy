package at.altin.fh.eww.e.oop;

public class Auto {
    private String farbe;

    private int bauJahr;

    private String marke;

    public Auto() {
    }

    public Auto(String farbe, int bauJahr, String marke) {
        this.farbe = farbe;
        this.bauJahr = bauJahr;
        this.marke = marke;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public int getBauJahr() {
        return bauJahr;
    }

    public void setBauJahr(int bauJahr) {
        this.bauJahr = bauJahr;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }


    @Override
    public String toString() {
        return "Auto{" +
                "farbe='" + farbe + '\'' +
                ", bauJahr=" + bauJahr +
                ", marke='" + marke + '\'' +
                '}';
    }
}
