package chainOfResponsability.clase;

public class PlataCardBancar extends ModDePlata {
    private double sold;

    public PlataCardBancar(double sold) {
        this.sold = sold;
    }

    @Override
    public void plateste(double pretBilet) {
        if (sold >= pretBilet) {
            System.out.println("S-a efectuat plata pt calatoria in valoare de " + pretBilet + " cu cardul bancar");
            sold -= pretBilet;
        }else{
            super.succesor.plateste(pretBilet);
        }
    }

}
