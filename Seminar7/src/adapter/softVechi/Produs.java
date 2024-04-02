package adapter.softVechi;

public class Produs {
    private String nume;
    private float pret;

    public Produs(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produs{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
