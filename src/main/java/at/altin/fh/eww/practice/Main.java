package at.altin.fh.eww.practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        //1. ein Quadrat mit Koordinaten 5.0, 6.2 soll erstellt werden breite 5
        Quadrat quadrat = new Quadrat(5.0, 6.2, 5);
        quadrat.setPunkt(new Punkt(5.0, 5.1));

        //2. es soll gecheckt werden ob der punkt mit koordinaten 5.0, 5.1 in dem Quadrat
        Punkt punkt = new Punkt(5.0, 5.1);

        if(quadrat.enthaelt(punkt)) {
            System.out.println("Quadrat enthält den Punkt: [" + punkt + "]");
        }

        //3. es soll eine Liste mit Figuren, berechne die durchschnittlichen koordinaten und wenn möglich den mittelpunkt
        List<Figur> figuren = new ArrayList<>();
        double gesamtXKord = 0;
        double gesamtYKord = 0;
        List<Punkt> gesamtMittelPunkt = new ArrayList<>();
        figuren.add(quadrat);
        figuren.add(punkt);
        figuren.add(new Quadrat(10.0, 10.0, 10));
        figuren.add(new Kreis(10.0, 10.0, 5));



        // nur als uebung
        // alle figuren durchgehen und checken ob einer der Quadrate eine Form hat
        for (Figur figur : figuren) {
            gesamtXKord += figur.getxKoord();
            gesamtYKord += figur.getyKoord();

            if(figur instanceof Quadrat quadrat1) {
                quadrat1.habIchEineForm();
            }

            if(figur instanceof  Kreis kreis) {
                gesamtMittelPunkt.add(kreis.getMittelpunkt());
            }
        }

        double durchschnittX = gesamtXKord / figuren.size();
        double durchschnittY = gesamtYKord / figuren.size();


        System.out.printf("Durchschnitt X : %f, durchschnittY: %f \n", durchschnittX, durchschnittY);

        System.out.println(figuren);
        //4. sortiere die liste, und filter aus die quadrate
        //filter
        figuren.removeIf(figur -> figur instanceof Quadrat);
        //sort
        figuren.sort(Comparator.comparing(Figur::getxKoord));

        //List<Figur> sortedFigurenStream = figuren.stream()
        //        .filter(f -> (!(f instanceof Quadrat)))
        //        .sorted().toList();


        System.out.println(figuren);
    }
}
