package composite.clase;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Agentie implements Sediu{

    private List<Sediu> listaSedii;
    private String nume;
    private int nrOperatori;

    public Agentie(String nume, int nrOperatori) {
        this.nume = nume;
        this.nrOperatori = nrOperatori;
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
        System.out.println(indent+"Agentia "+this.nume+" are "+this.nrOperatori+" si are urmatoarele sedii:\n");
        listaSedii.forEach(sediu -> sediu.afisare(indent+"\t"));
    }

    public String getNume() {
        return nume;
    }

    @Override
    public int numaraAngajati() {
        AtomicInteger nrAngajati = new AtomicInteger(this.nrOperatori);
        listaSedii.forEach(sediu -> nrAngajati.addAndGet(sediu.numaraAngajati()));
        return nrAngajati.get();
    }
}