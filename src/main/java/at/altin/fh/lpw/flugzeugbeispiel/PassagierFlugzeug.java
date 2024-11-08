package at.altin.fh.lpw.flugzeugbeispiel;

public class PassagierFlugzeug extends Luftfahrzeug{
    private int anzahlPassagiereBusiness;
    private int anzahlPassagiereEconomy;
    public int betriebsStundenInspektion;

    public PassagierFlugzeug() {
        setFahrzeugTyp(FahrzeugTyp.PASSAGIER_FLUGZEUG);
    }

    public PassagierFlugzeug(String bezeichnung, Registrierung registrierung, double anzahlFlugstunden, int anzahlPassagiereBusiness, int anzahlPassagiereEconomy, int betriebsStundenInspektion) {
        super(FahrzeugTyp.PASSAGIER_FLUGZEUG, bezeichnung, registrierung, anzahlFlugstunden);
        this.anzahlPassagiereBusiness = anzahlPassagiereBusiness;
        this.anzahlPassagiereEconomy = anzahlPassagiereEconomy;
        this.betriebsStundenInspektion = betriebsStundenInspektion;
    }

    public int getAnzahlPassagiereEconomy() {
        return anzahlPassagiereEconomy;
    }

    public void setAnzahlPassagiereEconomy(int anzahlPassagiereEconomy) {
        this.anzahlPassagiereEconomy = anzahlPassagiereEconomy;
    }

    public int getAnzahlPassagiereBusiness() {
        return anzahlPassagiereBusiness;
    }

    public void setAnzahlPassagiereBusiness(int anzahlPassagiereBusiness) {
        this.anzahlPassagiereBusiness = anzahlPassagiereBusiness;
    }

    public int getBetriebsStundenInspektion() {
        return betriebsStundenInspektion;
    }

    public void setBetriebsStundenInspektion(int betriebsStundenInspektion) {
        this.betriebsStundenInspektion = betriebsStundenInspektion;
    }

    @Override
    public String toString() {
        return super.toString() +"PassagierFlugzeug{" +
                "anzahlPassagiereBusiness=" + anzahlPassagiereBusiness +
                ", anzahlPassagiereEconomy=" + anzahlPassagiereEconomy +
                ", betriebsStundenInspektion=" + betriebsStundenInspektion +
                '}';
    }
}
