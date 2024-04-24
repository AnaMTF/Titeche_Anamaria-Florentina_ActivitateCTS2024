package Strategy.clase;

public class Validator {
    private int nrAutobuz;
    ModDePlata modDePlata;

    public Validator(int nrAutobuz, ModDePlata modDePlata) {
        this.nrAutobuz = nrAutobuz;
        this.modDePlata = modDePlata;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public ModDePlata getModDePlata() {
        return modDePlata;
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }

    public void efectueazaPlata (double pret){
        modDePlata.plateste();
    }
}
