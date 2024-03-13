package simpleFactory.clase;

public class Gripa extends Medicament{
    public Gripa(String nume, float pret, int valabilitate) {
        super(nume, pret, valabilitate);
    }

    @Override
    public void afisareDetalii() {
        System.out.printf("%s costa %f lei expira in %d zile si este bun pentru gripa\n", super.getNume(), super.getPret(), super.getValabilitate());
    }
}
