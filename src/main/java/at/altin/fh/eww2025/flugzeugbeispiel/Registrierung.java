package at.altin.fh.eww2025.flugzeugbeispiel;

import at.altin.fh.lpw.flugzeugbeispiel.Land;

public class Registrierung {
    private at.altin.fh.lpw.flugzeugbeispiel.Land land;
    private String kennzeichnung;
    private String besitzer;


    public Registrierung() {
    }


    public Registrierung(at.altin.fh.lpw.flugzeugbeispiel.Land land, String kennzeichnung, String besitzer) {
        this.land = land;
        this.kennzeichnung = kennzeichnung;
        this.besitzer = besitzer;
    }

    public at.altin.fh.lpw.flugzeugbeispiel.Land getLand() {
        return land;
    }

    public void setLand(Land land) {
        this.land = land;
    }

    public String getKennzeichnung() {
        return kennzeichnung;
    }

    public void setKennzeichnung(String kennzeichnung) {
        this.kennzeichnung = kennzeichnung;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    @Override
    public String toString() {
        return "Registrierung{" +
                "land=" + land +
                ", kennzeichnung='" + kennzeichnung + '\'' +
                ", besitzer='" + besitzer + '\'' +
                '}';
    }
}
