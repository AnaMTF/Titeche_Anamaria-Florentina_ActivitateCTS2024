package a.ex12.clase;

public class Pacient implements Observer{
    private String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }

    @Override
    public void primesteNotificareVirus(String mesaj) {
        System.out.printf("Pacientul %s: Am primit avertizarea legata de virusul %s.%n", this.nume, mesaj);
    }
}
