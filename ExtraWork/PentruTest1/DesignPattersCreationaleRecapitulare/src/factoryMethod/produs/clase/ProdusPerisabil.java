package factoryMethod.produs.clase;

public class ProdusPerisabil implements ProdusGenericFactoryMethod{
    private String numeProdus;
    private float stoc;

    public ProdusPerisabil(String numeProdus, float stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }

    @Override
    public float getStoc() {
        return this.stoc;
    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println("mesaje " + this.numeProdus);
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
        final StringBuilder sb = new StringBuilder("ProdusPerisabil{");
        sb.append("numeProdus='").append(numeProdus).append('\'');
        sb.append(", stoc=").append(stoc);
        sb.append('}');
        return sb.toString();
    }
}
