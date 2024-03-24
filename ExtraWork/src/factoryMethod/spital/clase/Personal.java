package factoryMethod.spital.clase;

public abstract class Personal {
    String nume;
    int aniExperienta;

    public Personal(String nume, int aniExperienta) {
        this.nume = nume;
        this.aniExperienta = aniExperienta;
    }

    public String getNume() {
        return nume;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Personal{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", aniExperienta=").append(aniExperienta);
        sb.append('}');
        return sb.toString();
    }

    public abstract void afisareDetaliiPersonal();
}
