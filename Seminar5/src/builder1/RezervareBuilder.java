package builder1;

public class RezervareBuilder implements AbstractBuilder{

    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areBautura;
    private boolean areMuzica;
    private String genMuzical;

    public RezervareBuilder() {
        this.areMancare = false;
        this.areScaunErgonomic = false;
        this.areBautura = false;
        this.areMuzica = false;
        this.genMuzical = null;
    }
    @Override
    public Rezervare build() {
        return new Rezervare(areMancare, areScaunErgonomic, areBautura, areMuzica, genMuzical);
    }
    public AbstractBuilder adaugaMancare(boolean areMancare){
        this.areMancare = areMancare;
        return this;
    }
    public AbstractBuilder adaugaMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
        return this;
    }
    public AbstractBuilder adaugaBautura(boolean areBautura) {
        this.areBautura = areBautura;
        return this;
    }

    public AbstractBuilder adaugaScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
        return this;
    }
    public AbstractBuilder adaugaGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
        return this;
    }
}
