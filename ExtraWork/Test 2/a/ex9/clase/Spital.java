package a.ex9.clase;

public class Spital implements Internabil {
    private int nrInternari;

    public Spital()
    {
        this.nrInternari = 0;
    }

    public int getNrInternari() {
        return nrInternari;
    }

    @Override
    public void interneaza(Pacient pacient) {
        System.out.printf("Pacientul %s a fost internat. Numărul internărilor este acum %d.%n", pacient.getNume(), ++nrInternari);
    }
}
