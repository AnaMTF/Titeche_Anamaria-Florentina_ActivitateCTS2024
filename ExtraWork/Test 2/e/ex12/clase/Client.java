package e.ex12.clase;

public class Client implements Abonabil{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void primeste(String mesaj) {
        System.out.printf("Clientul %s: Am primit un mesaj legat de meciul de %s.%n", this.nume, mesaj);
    }

    public String getNume() {
        return nume;
    }
}
