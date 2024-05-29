package c.ex10.clase;

public class Client implements Flyweight {
    private String nume;
    private String numarAsiguare;

    public Client(String numarAsiguare, String nume) {
        this.numarAsiguare = numarAsiguare;
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void afiseaza(Reteta reteta) {
        System.out.printf("Clientul %s, cu asigurarea nr. %s are reteta: %s%n", this.nume, this.numarAsiguare, reteta);
    }
}
