package at.altin.fh.lpw.unger.oop;

public class LV20241007OOP {
    public static void main(String[] args) {

        Rechteck kleinesRechteck = new Rechteck();
        Rechteck grossesRechteck = new Rechteck(16, 17);
        //Rechteck schoenesRechteck = new Rechteck(4);

        System.out.printf("kleinesRechteck Breite: %d\n", kleinesRechteck.getBreite());
        System.out.printf("kleinesRechteck Länge: %d\n", kleinesRechteck.laenge);
        System.out.printf("kleinesRechteck Fläche: %.2f\n", kleinesRechteck.berechneFlaeche());
        System.out.printf("kleinesRechteck Umfang: %.2f\n", kleinesRechteck.berechneUmfang());
        System.out.println();

        System.out.printf("grossesRechteck Breite: %d\n", grossesRechteck.getBreite());
        System.out.printf("grossesRechteck Länge: %d\n", grossesRechteck.laenge);
        System.out.printf("grossesRechteck Fläche: %.2f\n", grossesRechteck.berechneFlaeche());
        System.out.printf("grossesRechteck Umfang: %.2f\n", grossesRechteck.berechneUmfang());
        System.out.println();

        kleinesRechteck.setBreite(-1);
        kleinesRechteck.setBreite(9);
        kleinesRechteck.laenge = -1;

        //grossesRechteck.breite = 9;   //Fehler, da Attribut als private definiert
        grossesRechteck.setBreite(9);
        grossesRechteck.laenge = 7;

        System.out.printf("kleinesRechteck Breite: %d\n", kleinesRechteck.getBreite());
        System.out.printf("kleinesRechteck Länge: %d\n", kleinesRechteck.laenge);
        System.out.printf("kleinesRechteck Fläche: %.2f\n", kleinesRechteck.berechneFlaeche());
        System.out.printf("kleinesRechteck Umfang: %.2f\n", kleinesRechteck.berechneUmfang());
        System.out.println();

        System.out.printf("grossesRechteck Breite: %d\n", grossesRechteck.getBreite());
        System.out.printf("grossesRechteck Länge: %d\n", grossesRechteck.laenge);
        System.out.printf("grossesRechteck Fläche: %.2f\n", grossesRechteck.berechneFlaeche());
        System.out.printf("grossesRechteck Umfang: %.2f\n", grossesRechteck.berechneUmfang());
        System.out.println();

        kleinesRechteck.setBreite(10);
        System.out.printf("kleinesRechteck Breite: %d\n", kleinesRechteck.getBreite());
        System.out.printf("kleinesRechteck Länge: %d\n", kleinesRechteck.laenge);
        System.out.printf("kleinesRechteck Fläche: %.2f\n", kleinesRechteck.berechneFlaeche());
        System.out.printf("kleinesRechteck Umfang: %.2f\n", kleinesRechteck.berechneUmfang());
        System.out.println();
    }
}
