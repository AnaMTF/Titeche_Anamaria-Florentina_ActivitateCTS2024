package singletonTS.clase;

public class ProdusBio implements STSProdusGeneric{
    private String numeProdus;
    private float stoc;
    private static ProdusBio instantaProdusBio = null;


    @Override
    public float getStoc() {
        return this.stoc;
    }

    @Override
    public void afiseazaDescriereProdus() {
        System.out.println("Mesaj descriere produs " +numeProdus);
    }

    @Override
    public String getNumeProdus() {
        return this.numeProdus;
    }

    @Override
    public void cresteStoc(float nrProduse) {
        this.stoc +=nrProduse;
    }

    private ProdusBio(String numeProdus, float stoc) {
        this.numeProdus = numeProdus;
        this.stoc = stoc;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ProdusBio{");
        sb.append("numeProdus='").append(numeProdus).append('\'');
        sb.append(", stoc=").append(stoc);
        sb.append('}');
        return sb.toString();
    }

    public static synchronized ProdusBio getInstantaProdus(String numeProdus, float stoc){
        if (instantaProdusBio == null){
            instantaProdusBio = new ProdusBio(numeProdus, stoc);
            System.out.println("mesaj s-a creat cu succes "+numeProdus);
        }
        return instantaProdusBio;
    }
}
