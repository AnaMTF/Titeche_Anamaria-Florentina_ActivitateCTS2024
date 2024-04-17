package flyweight.clase;

public class Client implements FlyweightClient {
    private String nume;
    private String adresa;
    private String nrTelefon;

    public Client(String nume, String adresa, String nrTelefon) {
        this.nume = nume;
        this.adresa = adresa;
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresa='").append(adresa).append('\'');
        sb.append(", nrTelefon='").append(nrTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaInformatii(Cont c) {
        final StringBuffer sb = new StringBuffer(toString());
        sb.append(c.toString());
        System.out.println(sb);
    }
}