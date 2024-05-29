package c.ex9.clase;

public class Client implements Achizitionabil{
    private String nume;
    private boolean areReteta;

    public Client(boolean areReteta, String nume) {
        this.areReteta = areReteta;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void achizitioneazaMedicament(Medicament m) {
        System.out.printf("Clientul %s a cumpărat medicamentul %s %s.%n", this.nume, m.getDenumire(), this.areReteta ? "cu reteta" : "fara reteta");
    }

    public boolean isAreReteta() {
        return areReteta;
    }
}
