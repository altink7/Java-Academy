package at.altin.fh.eww2025.flugzeugbeispiel;

import at.altin.fh.lpw.flugzeugbeispiel.FahrzeugTyp;
import at.altin.fh.lpw.flugzeugbeispiel.Registrierung;

public class Luftfahrzeug {
    public at.altin.fh.lpw.flugzeugbeispiel.FahrzeugTyp fahrzeugTyp;
    private String bezeichnung;
    private Registrierung registrierung;
    private double anzahlFlugstunden;

    public Luftfahrzeug() {

    }

    public Luftfahrzeug(at.altin.fh.lpw.flugzeugbeispiel.FahrzeugTyp fahrzeugTyp, String bezeichnung, Registrierung registrierung, double anzahlFlugstunden) {
        this.fahrzeugTyp = fahrzeugTyp;
        this.bezeichnung = bezeichnung;
        this.registrierung = registrierung;
        this.anzahlFlugstunden = anzahlFlugstunden;
    }


    public at.altin.fh.lpw.flugzeugbeispiel.FahrzeugTyp getFahrzeugTyp() {
        return fahrzeugTyp;
    }

    public void setFahrzeugTyp(FahrzeugTyp fahrzeugTyp) {
        this.fahrzeugTyp = fahrzeugTyp;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public Registrierung getRegistrierung() {
        return registrierung;
    }

    public void setRegistrierung(Registrierung registrierung) {
        this.registrierung = registrierung;
    }

    public double getAnzahlFlugstunden() {
        return anzahlFlugstunden;
    }

    public void setAnzahlFlugstunden(double anzahlFlugstunden) {
        this.anzahlFlugstunden = anzahlFlugstunden;
    }

    @Override
    public String toString() {
        return "Luftfahrzeug{" +
                "fahrzeugTyp=" + fahrzeugTyp +
                ", bezeichnung='" + bezeichnung + '\'' +
                ", registrierung=" + registrierung +
                ", anzahlFlugstunden=" + anzahlFlugstunden +
                '}';
    }
}
