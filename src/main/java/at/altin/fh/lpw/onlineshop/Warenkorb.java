package at.altin.fh.lpw.onlineshop;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    private Produkt[] produkte = new Produkt[100];

    public void addProdukt(Produkt produkt) {
        for (int i = 0; i < produkte.length; i++) {
            Produkt produktOfList = produkte[i];

            if (produktOfList == null) {
                produkte[i] = produkt;
                break;
            }
        }
    }

    public void removeProdukt(Produkt produkt) {
        for(int i =0; i< produkte.length; i++) {
            Produkt produktOfList = produkte[i];

            if (produktOfList.equals(produkt)){
                produkte[i] = null;
                break;
            }
        }
    }


    public Produkt[] getProdukte() {
        return produkte;
    }

    public void setProdukte(Produkt[] produkte) {
        this.produkte = produkte;
    }
}
