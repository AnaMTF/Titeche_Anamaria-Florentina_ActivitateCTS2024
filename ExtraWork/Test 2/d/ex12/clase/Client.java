package d.ex12.clase;

public class Client implements Observer{
    private String nume;

    public Client(String nume) {
        this.nume = nume;
    }

    @Override
    public void afiseazaMesajPrimit(String mesaj) {
        System.out.printf("%s: mesaj primit: %s%n", this.nume, mesaj);
    }
}
