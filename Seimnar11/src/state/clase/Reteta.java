package state.clase;

public class Reteta {
    private int nrMedicamente;
    private float pret;
    private int nrReteta;
    private AbstractState stare;

    public Reteta(int nrMedicamente, float pret, int nrReteta) {
        this.nrMedicamente = nrMedicamente;
        this.pret = pret;
        this.nrReteta = nrReteta;
        this.stare = new Emisa();
    }

    protected void setStare(AbstractState stare) {
        this.stare = stare;
    }

    public void cereMedicamente(){
        if (stare instanceof Emisa) {
            System.out.println("Au fost solicitate " + nrMedicamente + " e baza retetei cu nr. " + nrReteta);
            AbstractState solicitata = new Solicitata();
            solicitata.SchimbaStare(this);
        }else{
            System.out.println("Nu puteti solicita medicamente in baza acestei reteta");
        }
    }

    public void cumparaMedicament(){
        if (stare instanceof Solicitata){
            System.out.println("Au fost achitate " + nrMedicamente + " e baza retetei cu nr. " + nrReteta);
            AbstractState achizitionata = new Achizitionata();
            achizitionata.SchimbaStare(this);
        }else{
            System.out.println("Nu puteti achizitiona medicamente in baza acestei reteta");
        }
    }

    public void respingeReteta(){
        if (stare instanceof Solicitata){
            System.out.println("Medicamentele solicitate nu sunt in stoc");
            AbstractState emisa = new Emisa();
            emisa.SchimbaStare(this);
        }else{
            System.out.println("Reteta nu a fost solicitata.");
        }
    }
}
