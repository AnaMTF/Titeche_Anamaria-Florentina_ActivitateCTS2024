package adapter.softNou;

public class Bautura {
    private String nume;
    private float pret;
    private float gradAlcool;

    public Bautura(String nume, float pret, float gradAlcool) {
        this.nume = nume;
        this.pret = pret;
        this.gradAlcool = gradAlcool;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bautura{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", gradAlcool=").append(gradAlcool);
        sb.append('}');
        return sb.toString();
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public float getGradAlcool() {
        return gradAlcool;
    }
}
