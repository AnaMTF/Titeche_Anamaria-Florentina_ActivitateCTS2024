package f.ex16.clase;

public class ComandaPlecare implements Command{
    private Autobuz autobuz;
    private int linie;

    public ComandaPlecare(Autobuz autobuz, int linie) {
        this.autobuz = autobuz;
        this.linie = linie;
    }

    @Override
    public void executa() {
        autobuz.pleaca(linie);
    }
}
