package e.ex9.clase;

import java.util.ArrayList;
import java.util.List;

public class Stadion implements Organizabil{
    private String nume;
    private List<Organizabil> sectiuni;

    public Stadion(String nume) {
        this.nume = nume;
        this.sectiuni = new ArrayList<>();
    }

    @Override
    public void adauga(Organizabil organizabil) {
        this.sectiuni.add(organizabil);
    }

    @Override
    public void sterge(Organizabil organizabil) {
        this.sectiuni.remove(organizabil);
    }

    @Override
    public Organizabil get(int index) {
        return this.sectiuni.get(index);
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("Stadionul %s are următoarele secțiuni:%n", this.nume);
        this.sectiuni.forEach(sectiune -> sectiune.afiseaza("\t"));
    }
}
