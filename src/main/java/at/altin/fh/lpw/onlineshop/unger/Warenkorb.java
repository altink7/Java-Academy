package at.altin.fh.lpw.onlineshop.unger;

public class Warenkorb {
    public Produkt[] produkte = new Produkt[10];
    public int counter = 0;

    public void add(Produkt pProdukt){
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
