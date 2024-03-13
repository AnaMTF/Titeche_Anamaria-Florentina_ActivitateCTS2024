package factoryMethod.clase;

public abstract class Medicament {
    private String nume;
    private float pret;


    public Medicament(String nume, float pret) {
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
        return "Medicament{" +
                "nume='" + nume + '\'' +
                ", pret=" + pret +
                '}';
    }

    public abstract void afisareDetaliiMedicament();
}
