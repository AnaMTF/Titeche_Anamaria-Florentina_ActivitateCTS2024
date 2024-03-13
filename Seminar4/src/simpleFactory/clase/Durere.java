package simpleFactory.clase;

public class Durere extends Medicament {
    public Durere(String nume, float pret, int valabilitate) {
        super(nume, pret, valabilitate);
    }

    @Override
    public void afisareDetalii() {
        System.out.printf("%s costa %f lei expira in %d zile si este bun pentru durere\n", super.getNume(), super.getPret(), super.getValabilitate());
    }
}
