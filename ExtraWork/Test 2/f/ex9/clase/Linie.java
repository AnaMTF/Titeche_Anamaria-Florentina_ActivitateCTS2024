package f.ex9.clase;

public class Linie implements Flyweight{
    private int nrLinie;
    private String primaStatie;
    private String ultimaStatie;

    public Linie(int nrLinie, String primaStatie, String ultimaStatie) {
        this.nrLinie = nrLinie;
        this.primaStatie = primaStatie;
        this.ultimaStatie = ultimaStatie;
    }

    @Override
    public void afiseaza(Autobuz autobuz) {
        System.out.printf("Pe linia %d (%s - %s) circulă autobuzul %s", this.nrLinie, this.primaStatie, this.ultimaStatie, autobuz);
    }

    public int getNrLinie() {
        return nrLinie;
    }

    public String getPrimaStatie() {
        return primaStatie;
    }

    public String getUltimaStatie() {
        return ultimaStatie;
    }
}
