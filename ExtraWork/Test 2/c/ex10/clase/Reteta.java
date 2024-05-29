package c.ex10.clase;

public class Reteta {
    private int nrReteta;
    private float suma;
    private int nrMedicamente;

    public Reteta(int nrMedicamente, int nrReteta, float suma) {
        this.nrMedicamente = nrMedicamente;
        this.nrReteta = nrReteta;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reteta{");
        sb.append("nrMedicamente=").append(nrMedicamente);
        sb.append(", nrReteta=").append(nrReteta);
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
