package at.altin.fh.eww2025.onlineshop.unger;

import at.altin.fh.lpw.onlineshop.unger.Kunde;

public class RegistrierterKunde extends Kunde {
    private int nummer;

    public RegistrierterKunde(){
        super();
        this.nummer = 0;
    }

    public RegistrierterKunde(String pEmail, String pName, String pAdresse, int pNummer){
        super(pEmail, pName, pAdresse);
        this.nummer = pNummer;
    }

    public void setNummer(int pNummer){
        this.nummer = pNummer;
    }

    public int getNummer(){
        return this.nummer;
    }
}
