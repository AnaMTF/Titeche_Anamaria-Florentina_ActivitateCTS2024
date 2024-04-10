package decorator.clase;

public class Bilet implements BiletAbstract{
    private double pret;
    private String cod;

    public Bilet(double pret, String cod) {
        this.pret = pret;
        this.cod = cod;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public double getPret() {
        return pret;
    }

    public String getCod() {
        return cod;
    }

    @Override
    public void printareBilet() {
        System.out.printf("Pretul biletului cu codul %s este de %f.\n", this.cod, this.pret);
    }
}
