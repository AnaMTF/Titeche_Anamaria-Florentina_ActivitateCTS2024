package proxy.clase;

public class Autobuz implements AutobuzAbstract{
    private int nrCalatori;
    private int nrAutobuz;
    private String numeSofer;

    public Autobuz(int nrCalatori, int nrAutobuz, String numeSofer) {
        this.nrCalatori = nrCalatori;
        this.nrAutobuz = nrAutobuz;
        this.numeSofer = numeSofer;
    }

    public int getNrCalatori() {
        return nrCalatori;
    }

    public int getNrAutobuz() {
        return nrAutobuz;
    }

    public String getNumeSofer() {
        return numeSofer;
    }

    @Override
    public void opresteInStatie(String statie) {
        System.out.println("Autobuzul " +nrAutobuz + " condus de " + numeSofer + " a oprit in statia " + statie);

    }
}
