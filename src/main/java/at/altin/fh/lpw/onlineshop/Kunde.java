package at.altin.fh.lpw.onlineshop;

public class Kunde {
    protected String email;
    protected String name;
    protected String adresse;
    protected Warenkorb warenkorb;


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Warenkorb getWarenkorb() {
        return warenkorb;
    }

    public void setWarenkorb(Warenkorb warenkorb) {
        this.warenkorb = warenkorb;
    }

    @Override
    public String toString() {
        return "Kunde: " + name + " (" + email + "), " + adresse;
    }
}


