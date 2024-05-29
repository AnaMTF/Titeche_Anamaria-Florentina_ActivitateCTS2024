package e.ex9.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements Organizabil{
    private String nume;
    private List<Organizabil> subsectiuni;
    private static int index = 0;
    private final static List<String> SECTIUNI = new ArrayList<>(List.of("Tribuna", "Peluza", "Loja", "Sector"));

    public Sectiune() {
        this.nume = SECTIUNI.get(index++);
        if(index==SECTIUNI.size())
        {
            index=0;
        }
        this.subsectiuni = new ArrayList<>();
    }

    @Override
    public void adauga(Organizabil organizabil) {
        this.subsectiuni.add(organizabil);
    }

    @Override
    public void sterge(Organizabil organizabil) {
        this.subsectiuni.remove(organizabil);
    }

    @Override
    public Organizabil get(int index) {
        return this.subsectiuni.get(index);
    }

    @Override
    public void afiseaza(String indent) {
        System.out.printf("%sSecțiunea %s are următoarele subsecțiuni:%n", indent, this.nume);
        this.subsectiuni.forEach(subsectiune -> subsectiune.afiseaza("\t\t"));
    }
}
