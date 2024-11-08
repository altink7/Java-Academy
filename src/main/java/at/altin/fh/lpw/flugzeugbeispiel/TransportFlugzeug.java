package at.altin.fh.lpw.flugzeugbeispiel;

public class TransportFlugzeug extends Luftfahrzeug{
    private int anzahlStehplaetze;
    private int maxTransportkapazitaet;
    private double aktuelleLadung;

    public TransportFlugzeug() {
        setFahrzeugTyp(FahrzeugTyp.TRANSPORT_FLUGZEUG);
    }

    public TransportFlugzeug(String bezeichnung, Registrierung registrierung, double anzahlFlugstunden, int anzahlStehplaetze, int maxTransportkapazitaet, double aktuelleLadung) {
        super(FahrzeugTyp.TRANSPORT_FLUGZEUG, bezeichnung, registrierung, anzahlFlugstunden);
        this.anzahlStehplaetze = anzahlStehplaetze;
        this.maxTransportkapazitaet = maxTransportkapazitaet;
        this.aktuelleLadung = aktuelleLadung;
    }

    public int getAnzahlStehplaetze() {
        return anzahlStehplaetze;
    }

    public void setAnzahlStehplaetze(int anzahlStehplaetze) {
        this.anzahlStehplaetze = anzahlStehplaetze;
    }

    public int getMaxTransportkapazitaet() {
        return maxTransportkapazitaet;
    }

    public void setMaxTransportkapazitaet(int maxTransportkapazitaet) {
        this.maxTransportkapazitaet = maxTransportkapazitaet;
    }

    public double getAktuelleLadung() {
        return aktuelleLadung;
    }

    public void setAktuelleLadung(double aktuelleLadung) {
        this.aktuelleLadung = aktuelleLadung;
    }

    @Override
    public String toString() {
        return "TransportFlugzeug{" +
                "anzahlStehplaetze=" + anzahlStehplaetze +
                ", maxTransportkapazitaet=" + maxTransportkapazitaet +
                ", aktuelleLadung=" + aktuelleLadung +
                '}';
    }
}
