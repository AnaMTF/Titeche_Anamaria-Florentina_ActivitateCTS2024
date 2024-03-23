package cts.titeche.anamariaflorentina.as.pattern.model.clase;

public class ProdusePerisabile implements ProdusGeneric{

    String numeProdus;
    int stoc;
    private static ProdusePerisabile instantaProdusPerisabil = null;
    @Override
    public float getStoc() {
        return this.stoc;
    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println("Produsul " + this.numeProdus + " are stocul de " + this.stoc + " bucati.");
    }

    @Override
    public String getNumeProdus() {
        return this.numeProdus;
    }

    @Override
    public void cresteStoc(int nrProduse) {
        this.stoc += nrProduse;
    }

    private ProdusePerisabile(String numeProdus, int stoc) {
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

    public static ProdusePerisabile getInstantaProdusPerisabil( String numeProdus, int stoc){
        if(instantaProdusPerisabil == null || !instantaProdusPerisabil.getNumeProdus().equals(numeProdus)){
            instantaProdusPerisabil = new ProdusePerisabile(numeProdus, stoc);
        }
        return instantaProdusPerisabil;
    }
}
