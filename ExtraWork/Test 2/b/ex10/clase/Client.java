package b.ex10.clase;

public class Client implements Flyweight{
    private String nume;
    private String nrDeTelefon;
    private String adresa;

    public Client(String adresa, String nrDeTelefon, String nume) {
        this.adresa = adresa;
        this.nrDeTelefon = nrDeTelefon;
        this.nume = nume;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Client{");
        sb.append("adresa='").append(adresa).append('\'');
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", nrDeTelefon='").append(nrDeTelefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        final StringBuffer sb = new StringBuffer(toString());
        sb.append(" are următoarea rezervare\n").append(rezervare.toString());
        System.out.printf("%s", sb);
    }

    public String getNume() {
        return this.nume;
    }
}
