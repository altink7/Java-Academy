package at.altin.fh.eww2025.flugzeugbeispiel;

import at.altin.fh.lpw.flugzeugbeispiel.FahrzeugTyp;
import at.altin.fh.lpw.flugzeugbeispiel.Luftfahrzeug;
import at.altin.fh.lpw.flugzeugbeispiel.Registrierung;

public class Hubschrauber extends Luftfahrzeug {
    private int anzahlSitzplaetze;
    private int maxTransportkapazitaet;
    private boolean statusSeilwinde;


    public Hubschrauber() {
        setFahrzeugTyp(at.altin.fh.lpw.flugzeugbeispiel.FahrzeugTyp.HUBSCHRAUBER);
    }

    public Hubschrauber(int maxTransportkapazitaet) {
        setFahrzeugTyp(at.altin.fh.lpw.flugzeugbeispiel.FahrzeugTyp.HUBSCHRAUBER);
        this.maxTransportkapazitaet = maxTransportkapazitaet;
    }

    public Hubschrauber(String bezeichnung, Registrierung registrierung, double anzahlFlugstunden, int anzahlSitzplaetze, int maxTransportkapazitaet, boolean statusSeilwinde) {
        super(FahrzeugTyp.HUBSCHRAUBER, bezeichnung, registrierung, anzahlFlugstunden);
        this.anzahlSitzplaetze = anzahlSitzplaetze;
        this.maxTransportkapazitaet = maxTransportkapazitaet;
        this.statusSeilwinde = statusSeilwinde;
    }

    public void seilwindeBetatigen() {
        if(isStatusSeilwinde()) {
            setStatusSeilwinde(false);
            System.out.println("Status: " + isStatusSeilwinde());
        } else {
            setStatusSeilwinde(true);
            System.out.println("Status: " + isStatusSeilwinde());
        }


        // ALTERNATIVE: set status to the opposite of the current status
        // setStatusSeilwinde(!isStatusSeilwinde());
        // System.out.println("Status: " + isStatusSeilwinde());
    }

    public int getAnzahlSitzplaetze() {
        return anzahlSitzplaetze;
    }

    public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
        this.anzahlSitzplaetze = anzahlSitzplaetze;
    }

    public int getMaxTransportkapazitaet() {
        return maxTransportkapazitaet;
    }

    public void setMaxTransportkapazitaet(int maxTransportkapazitaet) {
        this.maxTransportkapazitaet = maxTransportkapazitaet;
    }

    public boolean isStatusSeilwinde() {
        return statusSeilwinde;
    }

    public void setStatusSeilwinde(boolean statusSeilwinde) {
        this.statusSeilwinde = statusSeilwinde;
    }

    @Override
    public String toString() {
        return "Hubschrauber{" +
                "anzahlSitzplaetze=" + anzahlSitzplaetze +
                ", maxTransportkapazitaet=" + maxTransportkapazitaet +
                " kg, statusSeilwinde=" + statusSeilwinde +
                " kg}";
    }
}
