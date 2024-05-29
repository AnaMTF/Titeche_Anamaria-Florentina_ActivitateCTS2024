package c.ex12.clase;

public class Client implements Abonabil{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.printf("%s: Mesaj primit: %s%n", this.nume, mesaj);
    }
}
