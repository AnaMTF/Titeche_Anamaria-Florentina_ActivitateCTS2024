package factoryMethod.clase;

public class Raceala extends Medicament{
    private int stoc;
    public Raceala(String nume, float pret, int stoc) {
        super(nume, pret);
        this.stoc = stoc;
    }

    @Override
    public void afisareDetaliiMedicament() {
        System.out.printf("%s costa %f lei si este bun pentru raceala\n", super.getNume(), super.getPret());
    }
}
