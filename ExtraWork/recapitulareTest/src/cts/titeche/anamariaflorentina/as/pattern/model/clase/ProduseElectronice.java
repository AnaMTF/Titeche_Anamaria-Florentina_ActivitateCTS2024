package cts.titeche.anamariaflorentina.as.pattern.model.clase;

public class ProduseElectronice implements ProdusGeneric{
    String numeProdus;
    int stoc;
    private static ProduseElectronice instantaProdusElectronic = null;

    private ProduseElectronice(String numeProdus, int stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }

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

    @Override
    public String toString() {
        return "ProduseElectronice{" +
                "numeProdus='" + numeProdus + '\'' +
                ", stoc=" + stoc +
                '}';
    }

    public static ProduseElectronice getInstantaProdusElectronic(String numeProdus, int stoc){
        if (instantaProdusElectronic == null || !instantaProdusElectronic.getNumeProdus().equals(numeProdus)){
            instantaProdusElectronic = new ProduseElectronice(numeProdus, stoc);
        }
        return instantaProdusElectronic;
    }
}
