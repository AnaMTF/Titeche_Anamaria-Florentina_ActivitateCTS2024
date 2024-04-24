package chainOfResponsability.clase;

public class PlataSMS extends ModDePlata {
    private double credit;

    public PlataSMS(double credit) {
        this.credit = credit;
    }

    @Override
    public void plateste(double pretBilet) {
        if (credit>=pretBilet){
            System.out.println("S-a efectuat plata pt calatoria in valoare de " + pretBilet + " cu SMS");
            credit = credit-pretBilet;
        }else {
            super.succesor.plateste(pretBilet);
        }

    }
}
