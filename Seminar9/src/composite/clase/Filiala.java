package composite.clase;

public class Filiala implements Sediu{
    private String nume;
    private int nrAngajati;

    public Filiala(String nume, int nrAngajati) {
        this.nume = nume;
        this.nrAngajati = nrAngajati;
    }

    @Override
    public void adauga(Sediu s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sterge(Sediu s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Sediu getNod(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+"Filiala "+this.nume+" are "+this.nrAngajati+".");
    }

    @Override
    public int numaraAngajati() {
        return this.nrAngajati;
    }
}