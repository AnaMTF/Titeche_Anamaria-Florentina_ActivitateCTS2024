package factoryMethod.clase;

public class Body extends Medicament{

    public Body(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public void afisareDetaliiMedicament() {
        System.out.printf("%s costa %f lei si este bun pentru corp\n", super.getNume(), super.getPret());
    }
}
