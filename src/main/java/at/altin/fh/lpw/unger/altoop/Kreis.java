package at.altin.fh.lpw.unger.altoop;

public class Kreis extends Form {
    private int radius;

    public Kreis(){
        super();
        this.radius = 1;
    }

    public Kreis(int pRadius){
        super();
        this.radius = pRadius;
    }

    public Kreis(int pRadius, FARBE pFarbe){
        super();
        this.radius = pRadius;
        this.farbe = pFarbe;
    }

    public Kreis(int x, int y){
        super(x,y);
        this.radius = 1;
    }

    public int getRadius(){
        return this.radius;
    }

    public void setRadius(int pRadius){
        this.radius = pRadius;
    }

    public double berechneUmfang(){
        return 2*this.radius*Math.PI;
    }

    public double berechneFlaeche(){
        return this.radius * this.radius * Math.PI;
    }

    public String toString(){
        String s = "Kreis{Radius: " + this.radius + ", Fläche: " + this.berechneFlaeche() + ", Umfang: " + this.berechneUmfang() + ", " + super.toString() + "}";
        return s;
    }

}
