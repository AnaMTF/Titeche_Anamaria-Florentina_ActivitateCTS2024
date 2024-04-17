package composite.clase;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Sucursala implements Sediu{
    private List<Sediu> listaSedii;
    private String nume;
    private int nrProgramatori;

    public Sucursala(String nume, int nrProgramatori) {
        this.nume = nume;
        this.nrProgramatori = nrProgramatori;
        this.listaSedii = new LinkedList<>();
    }

    @Override
    public void adauga(Sediu s) {
        this.listaSedii.add(s);
    }

    @Override
    public void sterge(Sediu s) {
        this.listaSedii.remove(s);
    }

    @Override
    public Sediu getNod(int index) {
        return this.listaSedii.get(index);
    }

    @Override
    public void afisare(String indent) {
        System.out.println(indent+"Sucursala "+this.nume+" are "+this.nrProgramatori+" si are urmatoarele sedii:\n");
        listaSedii.forEach(sediu -> sediu.afisare(indent+"\t\t"));
    }

    @Override
    public int numaraAngajati() {
        AtomicInteger nrAngajati = new AtomicInteger(this.nrProgramatori);
        listaSedii.forEach(sediu -> nrAngajati.addAndGet(sediu.numaraAngajati()));
        return nrAngajati.get();
    }
}