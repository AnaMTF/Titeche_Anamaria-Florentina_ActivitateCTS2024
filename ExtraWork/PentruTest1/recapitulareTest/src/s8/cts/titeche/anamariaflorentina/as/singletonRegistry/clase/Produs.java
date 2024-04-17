package s8.cts.titeche.anamariaflorentina.as.singletonRegistry.clase;

import s8.cts.titeche.anamariaflorentina.as.singletonRegistry.clase.ProdusGeneric;

public class Produs implements ProdusGeneric {

    String numeProdus;
    float stoc;

    @Override
    public float getStoc() {
        return this.stoc;
    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println("Produsul Perisabil " + this.numeProdus + " are stocul de " + this.stoc + " bucati.");
    }

    @Override
    public String getNumeProdus() {
        return this.numeProdus;
    }

    @Override
    public void cresteStoc(float nrProduse) {
        float stocInitial = this.stoc;
        this.stoc += nrProduse;
        System.out.println("Stocul produsului " + this.numeProdus + " a fost crescut de la " + stocInitial + " la " + this.stoc + " bucati.");
    }

    public Produs(String numeProdus, float stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }

    @Override
    public String toString() {
        return "ProdusePerisabile{" +
                "numeProdus='" + numeProdus + '\'' +
                ", stoc=" + stoc +
                '}';
    }
}
