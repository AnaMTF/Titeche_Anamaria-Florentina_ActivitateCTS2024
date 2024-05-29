package d.ex8.clase;

public class Cont implements Creditabil{
    private String moneda;

    public Cont(String moneda) {
        this.moneda = moneda;
    }

    @Override
    public void crediteaza() {
        System.out.printf("S-a creditat în moneda %s.%n", this.moneda);
    }

    public String getMoneda() {
        return moneda;
    }
}
