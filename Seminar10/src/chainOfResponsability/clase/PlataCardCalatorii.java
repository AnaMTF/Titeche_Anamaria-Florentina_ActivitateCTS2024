package chainOfResponsability.clase;

public class PlataCardCalatorii extends ModDePlata {
    private int nrCalatorii;

    public PlataCardCalatorii(int nrCalatorii) {
        this.nrCalatorii = nrCalatorii;
    }

    @Override
    public void plateste(double pretBilet) {
        if(nrCalatorii>0){
            System.out.println("S-a efectuat plata pt calatoria in valoare de " + pretBilet + " cu cardul de calatorii");
            nrCalatorii --;
        }else {
            super.succesor.plateste(pretBilet);
        }

    }
}
