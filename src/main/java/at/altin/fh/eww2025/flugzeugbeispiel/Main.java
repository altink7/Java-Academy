package at.altin.fh.eww2025.flugzeugbeispiel;

import at.altin.fh.lpw.flugzeugbeispiel.*;
import at.altin.fh.lpw.flugzeugbeispiel.Land;

import java.util.ResourceBundle;

public class Main {

    public static void main(String[] args) {
        PassagierFlugzeug passagierFlugzeug = new PassagierFlugzeug();
        TransportFlugzeug transportFlugzeug = new TransportFlugzeug();
        Hubschrauber hubschrauber = new Hubschrauber();

        Luftfahrzeug[] luftfahrzeuge = new Luftfahrzeug[12];

        Registrierung registrierung = new Registrierung(at.altin.fh.lpw.flugzeugbeispiel.Land.AT, "Bezeichnung", "Me");



        luftfahrzeuge[0] = new PassagierFlugzeug("Boing 474", registrierung, 1,1,1,1);
        luftfahrzeuge[1] = new PassagierFlugzeug();
        luftfahrzeuge[2] = new PassagierFlugzeug();
        // -- transport
        luftfahrzeuge[3] = new TransportFlugzeug();
        luftfahrzeuge[4] = new TransportFlugzeug();
        luftfahrzeuge[5] = new TransportFlugzeug();
        luftfahrzeuge[6] = new TransportFlugzeug();
        // --hubschrauber
        luftfahrzeuge[7] = new Hubschrauber(1);
        luftfahrzeuge[8] = new Hubschrauber(2);
        luftfahrzeuge[9] = new Hubschrauber(3);
        luftfahrzeuge[10] = new Hubschrauber(65);
        luftfahrzeuge[11] = new Hubschrauber(71);

        Hubschrauber[] hubschraubers = new Hubschrauber[5];


        double gesamtFlugstunden = 0;
        double minFlugstunden = luftfahrzeuge[0].getAnzahlFlugstunden();
        double maxTransportkapazitaet = 0;

        for (int i = 0; i < luftfahrzeuge.length; i++) {
            Luftfahrzeug luftfahrzeug = luftfahrzeuge[i];

            if(FahrzeugTyp.HUBSCHRAUBER == luftfahrzeug.getFahrzeugTyp()) {
                System.out.println(luftfahrzeug);

                for (int y = 0; y < hubschraubers.length; y++) {
                    Hubschrauber hubschrauberFromArray = hubschraubers[y];
                    if(hubschrauberFromArray == null) {
                        hubschraubers[y] = (Hubschrauber) luftfahrzeug;
                    }
                }
            }

            if(luftfahrzeug.getAnzahlFlugstunden() > minFlugstunden){
                minFlugstunden = luftfahrzeug.getAnzahlFlugstunden();
            }

            gesamtFlugstunden += luftfahrzeug.getAnzahlFlugstunden();

            if(luftfahrzeug.getRegistrierung() != null) {
                if(luftfahrzeug.getRegistrierung().getLand() == Land.AT) {
                    System.out.println("FLUGZEUG MIT LAND: "+ luftfahrzeug);
                }
            }
        }

 //       Geben Sie alle Luftfahrzeuge aus, die in AT registriert sind die im Array gespeichert sind
//        Legen Sie einen Hubschrauber an und betätigen Sie die Seilwinde Auf(true) und Ab(false):
        for (int i1 = 0; i1 < hubschraubers.length; i1++) {
            Hubschrauber hubschrauberFromList = hubschraubers[i1];

            if (hubschrauberFromList.getMaxTransportkapazitaet() > maxTransportkapazitaet) {
                maxTransportkapazitaet = hubschrauberFromList.getMaxTransportkapazitaet();
            }
        }

        for (int i = 0; i < luftfahrzeuge.length; i++) {
            if(luftfahrzeuge[i].getAnzahlFlugstunden() == minFlugstunden){
                System.out.println(luftfahrzeuge[i]);
            }
        }

        for (int i = 0; i < hubschraubers.length; i++) {
            if(hubschraubers[i].getMaxTransportkapazitaet() == maxTransportkapazitaet){
                System.out.println(hubschraubers[i]);
            }
        }


        //System.out.println("Gesamt Flug Stunden: "+ gesamtFlugstunden);
        //System.out.println("Gesamt Max Transport: "+ maxTransportkapazitaet);


        Hubschrauber hubschrauberSeilwinde = new Hubschrauber();

        hubschrauberSeilwinde.seilwindeBetatigen();
        hubschrauberSeilwinde.seilwindeBetatigen();
        hubschrauberSeilwinde.seilwindeBetatigen();
        hubschrauberSeilwinde.seilwindeBetatigen();

    }



}
