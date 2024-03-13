package factoryMethod.clase;

public class Gripa extends Medicament{
    public Gripa(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetaliiMedicament() {
        System.out.printf("%s costa %f lei si este bun pentru gripa\n", super.getNume(), super.getPret());
    }
}
