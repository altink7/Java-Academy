package at.altin.fh.eww2025.onlineshop.unger;

import at.altin.fh.lpw.onlineshop.unger.Produkt;

public class Warenkorb {
    public at.altin.fh.lpw.onlineshop.unger.Produkt[] produkte = new at.altin.fh.lpw.onlineshop.unger.Produkt[10];
    public int counter = 0;

    public void add(at.altin.fh.lpw.onlineshop.unger.Produkt pProdukt){
        this.produkte[this.counter] = pProdukt;
        this.counter++;
    }

    public void remove(Produkt pProdukt){
        for (int i = 0; i < this.counter; i++) {
            if(pProdukt.getNummer() == this.produkte[i].getNummer()){
                counter--;
                for (int j = i; j < this.counter; j++) {
                    this.produkte[j] = this.produkte[j+1];
                }
                this.produkte[counter] = null;
            }

        }
    }

}
