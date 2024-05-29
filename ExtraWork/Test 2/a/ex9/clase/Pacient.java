package a.ex9.clase;

public class Pacient {
    private final String nume;
    private final boolean areAsigurare;

    public Pacient(String nume, boolean areAsigurare) {
        this.nume = nume;
        this.areAsigurare = areAsigurare;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreAsigurare() {
        return areAsigurare;
    }
}
