package factoryMethod.clase;

public class Durere extends Medicament{
    public Durere(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetaliiMedicament() {
        System.out.printf("%s costa %f lei si este bun pentru durere\n", super.getNume(), super.getPret());
    }
}
