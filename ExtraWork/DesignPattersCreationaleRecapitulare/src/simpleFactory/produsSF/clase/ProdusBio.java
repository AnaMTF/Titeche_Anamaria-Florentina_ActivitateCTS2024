package simpleFactory.produsSF.clase;

public class ProdusBio implements ProdusGenericSF{
    private String numeProdus;
    private float stoc;

    public ProdusBio(String numeProdus, float stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }

    @Override
    public float getStoc() {
        return this.stoc;
    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println("mesaj descriere " + numeProdus);
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
        final StringBuilder sb = new StringBuilder("ProdusBio{");
        sb.append("numeProdus='").append(numeProdus).append('\'');
        sb.append(", stoc=").append(stoc);
        sb.append('}');
        return sb.toString();
    }
}
