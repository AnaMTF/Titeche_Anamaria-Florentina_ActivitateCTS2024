package simpleFactory.clase;

public class Raceala extends Medicament{

    public Raceala(String nume, float pret, int valabilitate) {
        super(nume, pret, valabilitate);
    }
    @Override
    public void afisareDetalii() {
        System.out.printf("%s costa %f lei si este bun pentru raceala\n", super.getNume(), super.getPret());
    }


}
