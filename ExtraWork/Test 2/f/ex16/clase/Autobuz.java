package f.ex16.clase;

public class Autobuz {
    private String sofer;

    public Autobuz(String sofer) {
        this.sofer = sofer;
    }

    public void pleaca(int linie)
    {
        System.out.printf("Autobuzul condus de %s a plecat pe linia %d.%n", this.sofer, linie);
    }
}
