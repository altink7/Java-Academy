package at.altin.fh.lpw.unger.oop;

public class Rechteck extends Form {
    private int breite;
    public int laenge;

    // good practice shiould be used
    public Rechteck(){
        super();
        //this.breite = 1;  //funktioniert, da innerhalb der Klasse; jedoch Implementierung nächste Zeile besser
        this.setBreite(1);
        this.laenge = 1;
    }

    // alternative (looks really bad)
    //public Rechteck(){
    //    //this.breite = 1;  //funktioniert, da innerhalb der Klasse; jedoch Implementierung nächste Zeile besser
    //    this.position= new Position();
    //    this.setBreite(1);
    //    this.laenge = 1;
    //}

    public Rechteck(int laenge, int breite){
        super();
        this.laenge = laenge;
        this.setBreite(breite);
    }

    public Rechteck(int laenge, int breite, FARBE pFarbe){
        super();
        this.laenge = laenge;
        this.setBreite(breite);
        this.farbe = pFarbe;
    }

    public int getBreite(){
        return this.breite;
    }
    public void setBreite(int pBreite){
        if(pBreite >= 1)
            this.breite = pBreite;
        else
            System.out.println("Fehlerhafter Wert für Breite!");
    }
    public double berechneFlaeche(){
        return (double)breite * laenge;
    }

    public double berechneUmfang(){
        return (double)(breite + laenge) * 2;
    }

    public String toString(){
        String s = "Rechteck{Länge: " + this.laenge + ", ";
        s = s + "Breite: " + this.breite + ", ";
        s = s + "Fläche: " + this.berechneFlaeche() + ", ";
        s = s + "Umfang: " + this.berechneUmfang() + ", ";
        s = s + super.toString() + "}";

        return s;
    }
}
