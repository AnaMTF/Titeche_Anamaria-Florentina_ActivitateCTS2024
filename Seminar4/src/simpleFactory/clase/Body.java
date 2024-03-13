package simpleFactory.clase;

public class Body extends Medicament{

     public Body(String nume, float pret, int valabilitate) {
        super(nume, pret, valabilitate);
    }
    @Override
    public void afisareDetalii() {
        System.out.printf("%s costa %f lei expira in %d zile si este bun pentru corp\n", super.getNume(), super.getPret(), super.getValabilitate());
    }


}
