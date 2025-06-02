package at.altin.fh.eww2025.onlineshop.unger;

import at.altin.fh.lpw.onlineshop.unger.Warenkorb;

public class Kunde {
    private String email;
    private String name;
    private String adresse;
    public Warenkorb warenkorb;

    public Kunde(){
        this.email= "leer";
        this.name = "leer";
        this.adresse = "leer";
        this.warenkorb = new Warenkorb();
    }

    public Kunde(String pEmail, String pName, String pAdresse){
        this.email = pEmail;
        this.name = pName;
        this.adresse = pAdresse;
        this.warenkorb = new Warenkorb();
    }

    public void setEmail(String pEmail){
        this.email = pEmail;
    }

    public void setName(String pName){
        this.name = pName;
    }

    public void setAdresse(String pAdresse){
        this.adresse = pAdresse;
    }

    public String getEmail(){
        return this.email;
    }

    public String getName(){
        return this.name;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public int getNummer(){
        return 0;
    }
}
