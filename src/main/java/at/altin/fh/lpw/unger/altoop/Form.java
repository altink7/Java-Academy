package at.altin.fh.lpw.unger.altoop;

public class Form {
    public FARBE farbe;
    public Position position;

    public Form(){
        this.farbe = FARBE.rot;
        this.position = new Position();
    }

    public Form(int x, int y){
        this.farbe = FARBE.rot;
        this.position = new Position(x,y);
    }

    public FARBE getFarbe(){
        return this.farbe;
    }

    public double berechneFlaeche(){
        return 0.0;
    }

    public double berechneUmfang(){
        return 0.0;
    }


    public String toString(){
        String s = "Form{Farbe: " + this.farbe + " x:" + this.position.getX()
                + " y:" + this.position.getY();
        return s;
    }
}
