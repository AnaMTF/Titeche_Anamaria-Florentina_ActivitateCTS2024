package b.ex8.clase;

import java.util.ArrayList;
import java.util.List;

public class SectiuneMeniu implements Sectiune{
    private List<Sectiune> subsectiuni;
    private String denumire;

    public SectiuneMeniu(String denumire)
    {
        this.denumire = denumire;
        this.subsectiuni = new ArrayList<>();
    }
    @Override
    public void adauga(Sectiune... sectiune) {
        this.subsectiuni.addAll(List.of(sectiune));
    }

    @Override
    public void sterge(Sectiune... sectiune) {
        this.subsectiuni.removeAll(List.of(sectiune));
    }

    @Override
    public Sectiune getSectiune(int index) {
        return this.subsectiuni.get(index);
    }

    @Override
    public void afisare(String indent) {
        System.out.printf("Sectiunea %s are următoarele subsecțiuni:%n", this.denumire);
        this.subsectiuni.forEach(subsectiune -> subsectiune.afisare("\t"));
    }
}
