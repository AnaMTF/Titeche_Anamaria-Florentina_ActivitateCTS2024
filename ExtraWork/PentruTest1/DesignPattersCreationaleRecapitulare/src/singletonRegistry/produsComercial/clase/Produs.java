package singletonRegistry.produsComercial.clase;

public class Produs implements ProdusGeneric{
    private float stoc;
    String numeProdus;

    public Produs(float stoc, String numeProdus) {
        this.stoc = stoc;
        this.numeProdus = numeProdus;
    }

    @Override
    public float getStoc() {
        return this.stoc;
    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println("Produsul " + this.numeProdus + " are stocul de " + this.stoc);
    }

    @Override
    public String getNumeProdus() {
        return this.numeProdus;
    }

    @Override
    public void cresteStoc(float nrProduse) {
        float stocInitial = this.stoc;
        this.stoc += nrProduse;
        System.out.println("Produsului " + this.numeProdus + " i-a vrescut stocul de la " + stocInitial + " la " + this.stoc);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("stoc=").append(stoc);
        sb.append(", numeProdus='").append(numeProdus).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
