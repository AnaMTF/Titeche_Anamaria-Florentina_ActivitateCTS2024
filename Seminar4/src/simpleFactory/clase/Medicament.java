package simpleFactory.clase;

public abstract class Medicament {
    private String nume;
    private float pret;
    private int valabilitate;

    public Medicament(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;
        this.valabilitate = 0;
    }

    public Medicament(String nume, float pret, int valabilitate) {
        this.nume = nume;
        this.pret = pret;
        this.valabilitate = valabilitate;
    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }

    public int getValabilitate() {
        return valabilitate;
    }

    @Override
    public String toString() {
        return "Medicament{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                ", valabilitate=" + valabilitate +
                '}';
    }

    public abstract void afisareDetalii();


}
