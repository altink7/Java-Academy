package at.altin.fh.eww2025.onlineshop;

import at.altin.fh.lpw.onlineshop.Produkt;

import java.util.ArrayList;
import java.util.List;

public class WarenkorbListOLD {
    private List<at.altin.fh.lpw.onlineshop.Produkt> produkte = new ArrayList<>();

    public void addProdukt(at.altin.fh.lpw.onlineshop.Produkt produkt) {
        produkte.add(produkt);
    }

    public void removeProdukt(at.altin.fh.lpw.onlineshop.Produkt produkt) {
        produkte.remove(produkt);
    }

    public List<at.altin.fh.lpw.onlineshop.Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }
}
