package chainOfResponsability.clase;

public class Validator {
    private int nrAutobuz;
    private ModDePlata modDePlata;

    public Validator(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;

        modDePlata = new PlataCardCalatorii(3);
        ModDePlata cardBancar = new PlataCardBancar(4);
        modDePlata.setSuccesor(cardBancar);
        ModDePlata sms = new PlataSMS(3);
        cardBancar.setSuccesor(sms);
        ModDePlata controlor = new Controlor();
        sms.setSuccesor(controlor);
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    protected void setNrAutobuz(int nrAutobuz) {
        this.nrAutobuz = nrAutobuz;
    }

    public ModDePlata getModDePlata() {
        return modDePlata;
    }

    public void setModDePlata(ModDePlata modDePlata) {
        this.modDePlata = modDePlata;
    }

    public void efectueazaPlata (double pret){
        modDePlata.plateste(pret);
    }
}
