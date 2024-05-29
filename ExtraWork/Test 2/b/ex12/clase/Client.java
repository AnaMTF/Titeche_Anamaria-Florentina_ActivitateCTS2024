package b.ex12.clase;

public class Client implements Observer{
    private String nume;
    public Client(String nume)
    {
        this.nume = nume;
    }
    @Override
    public void primesteNotificareOferta(String mesaj) {
        System.out.printf("Client %s: Am primit mesajul %s%n", this.nume, mesaj);
    }
}
