package b.ex8.clase;

public class Produs implements Sectiune{
    private String denumire;

    public Produs(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void adauga(Sectiune... sectiune) {
        throw new UnsupportedOperationException("Adăugarea nu este permisă pe nodurile frunză! Mergi un nivel ierarhic superior!");
    }

    @Override
    public void sterge(Sectiune... sectiune) {
        throw new UnsupportedOperationException("Ștergerea nu este permisă pe nodurile frunză! Mergi un nivel ierarhic superior!");
    }

    @Override
    public Sectiune getSectiune(int index) {
        throw new UnsupportedOperationException("Operatorul index nu este permis pe nodurile frunză! Mergi un nivel ierarhic superior!");
    }

    @Override
    public void afisare(String indent) {
        System.out.printf(indent+"Produsul %s%n", this.denumire);
    }
}
