package at.altin.fh.eww2025.onlineshop;

import at.altin.fh.lpw.onlineshop.Produkt;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
    private at.altin.fh.lpw.onlineshop.Produkt[] produkte = new at.altin.fh.lpw.onlineshop.Produkt[100];

    public void addProdukt(at.altin.fh.lpw.onlineshop.Produkt produkt) {
        for (int i = 0; i < produkte.length; i++) {
            at.altin.fh.lpw.onlineshop.Produkt produktOfList = produkte[i];

            if (produktOfList == null) {
                produkte[i] = produkt;
                break;
            }
        }
    }

    public void removeProdukt(at.altin.fh.lpw.onlineshop.Produkt produkt) {
        for(int i =0; i< produkte.length; i++) {
            at.altin.fh.lpw.onlineshop.Produkt produktOfList = produkte[i];

            if (produktOfList.equals(produkt)){
                produkte[i] = null;
                break;
            }
        }
    }


    public at.altin.fh.lpw.onlineshop.Produkt[] getProdukte() {
        return produkte;
    }

    public void setProdukte(Produkt[] produkte) {
        this.produkte = produkte;
    }
}
