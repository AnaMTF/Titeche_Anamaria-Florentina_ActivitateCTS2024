package s8.cts.titeche.anamariaflorentina.as.pattern.model.clase;

public class ProduseBio implements ProdusGeneric{
    String numeProdus;
    int stoc;
    private static ProduseBio instantaProdusBio = null;

    private ProduseBio(String numeProdus, int stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }

    @Override
    public float getStoc() {
        return this.stoc;
    }

    public static synchronized ProduseBio getInstantaProdusBio(String numeProdus, int stoc){
        if(instantaProdusBio == null || !instantaProdusBio.getNumeProdus().equals(numeProdus)){
            instantaProdusBio = new ProduseBio(numeProdus, stoc);
        }
        return instantaProdusBio;
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
        return "ProduseBio{" +
                "numeProdus='" + numeProdus + '\'' +
                ", stoc=" + stoc +
                '}';
    }
}
