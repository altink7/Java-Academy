package at.altin.fh.lpw.onlineshop;

import java.util.ArrayList;
import java.util.List;

public class WarenkorbListOLD {
    private List<Produkt> produkte = new ArrayList<>();

    public void addProdukt(Produkt produkt) {
        produkte.add(produkt);
    }

    public void removeProdukt(Produkt produkt) {
        produkte.remove(produkt);
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }
}
