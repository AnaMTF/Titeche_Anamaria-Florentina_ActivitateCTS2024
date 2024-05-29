package b.ex8.clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements Sectiune{
    private List<Sectiune> produse;
    private String denumire;

    public Subsectiune(String denumire) {
        this.denumire = denumire;
        this.produse = new ArrayList<>();
    }

    @Override
    public void adauga(Sectiune... sectiune) {
        this.produse.addAll(List.of(sectiune));
    }

    @Override
    public void sterge(Sectiune... sectiune) {
        this.produse.removeAll(List.of(sectiune));
    }

    @Override
    public Sectiune getSectiune(int index) {
        return this.produse.get(index);
    }

    @Override
    public void afisare(String indent) {
        System.out.printf(indent+"Subsecțiunea %s are următoarele produse:%n", this.denumire);
        this.produse.forEach(produs -> produs.afisare("\t\t"));
    }
}
