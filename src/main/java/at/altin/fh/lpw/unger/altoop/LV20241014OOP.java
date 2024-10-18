package at.altin.fh.lpw.unger.altoop;

public class LV20241014OOP {

    public static void main(String[] args) {
        int Radius = 9;
        Kreis myKreis = new Kreis();

        myKreis.setRadius(Radius);
        System.out.printf("myKreis Fläche: %.2f\n", myKreis.berechneFlaeche());
        System.out.printf("myKreis Umfang: %.2f\n", myKreis.berechneUmfang());
        myKreis.farbe = FARBE.rot;
        System.out.printf("myKreis Farbe: %s\n\n", myKreis.getFarbe());

        Form myForm = new Form();
        myForm.farbe = FARBE.blau;
        System.out.printf("myForm Umfang: %.2f\n", myForm.berechneUmfang());
        System.out.printf("myForm Fläche: %.2f\n", myForm.berechneFlaeche());
        System.out.printf("myKreis Farbe: %s\n\n", myForm.getFarbe());

        Rechteck myRechteck = new Rechteck();
        myRechteck.farbe = FARBE.rot;
        System.out.printf("myRechteck Umfang: %.2f\n", myRechteck.berechneUmfang());
        System.out.printf("myRechteck Fläche: %.2f\n", myRechteck.berechneFlaeche());
        System.out.printf("myRechteck Farbe: %s\n\n", myRechteck.getFarbe());

        myForm = new Kreis(8);
        myForm.farbe = FARBE.gruen;
        System.out.printf("myForm Umfang: %.2f\n", myForm.berechneUmfang());
        System.out.printf("myForm Fläche: %.2f\n", myForm.berechneFlaeche());
        System.out.printf("myKreis Farbe: %s\n\n", myForm.getFarbe());

        //myForm = new Rechteck(4, 3);
        myForm.farbe = FARBE.blau;
        System.out.printf("myForm Umfang: %.2f\n", myForm.berechneUmfang());
        System.out.printf("myForm Fläche: %.2f\n", myForm.berechneFlaeche());
        System.out.printf("myKreis Farbe: %s\n\n", myForm.getFarbe());
        System.out.print(myForm);

        Form[] meineFormen = {
            new Rechteck(9, 9, FARBE.blau),
            new Kreis(),
            new Kreis(7, FARBE.gruen),
            new Rechteck(),
            new Kreis(4)
        };

        System.out.println("\n\nmeineFormen");
        for(int i = 0; i< meineFormen.length; i++)
            System.out.println(meineFormen[i].toString());
    }
}
