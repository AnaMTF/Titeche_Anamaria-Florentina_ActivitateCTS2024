package s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.clase;

public class ProduseBio implements ProdusGeneric{
    private String numeProdus;
    private int stoc;


    public ProduseBio(String numeProdus, int stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }

    @Override
    public float getStoc() {
        return this.stoc;
    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println("Produsul BIO " + this.numeProdus + " are stocul de " + this.stoc + " bucati.");
    }

    @Override
    public String getNumeProdus() {
        return this.numeProdus;
    }

    @Override
    public void cresteStoc(int nrProduse) {
        int stocInitial = this.stoc;
        this.stoc += nrProduse;
        System.out.println("Stocul produsului " + this.numeProdus + " a fost crescut de la " + stocInitial + " la " + this.stoc + " bucati.");
    }

    @Override
    public String toString() {
        return "ProduseBio{" +
                "numeProdus='" + numeProdus + '\'' +
                ", stoc=" + stoc +
                '}';
    }
}
