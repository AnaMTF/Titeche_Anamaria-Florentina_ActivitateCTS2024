package f.ex15.clase;

public class Autobuz {
    private int linie;
    private String sofer;
    private Stare stare;
    private static Stare inCursa = new InCursa();
    private static Stare laCapatDeLinie = new LaCapatDeLinie();
    private static Stare laReparat = new LaReparat();

    public Autobuz(int linie, String sofer) {
        this.linie = linie;
        this.sofer = sofer;
        laCapatDeLinie.schimbaStare(this);
    }

    void setStare(Stare stare) {
        this.stare = stare;
    }

    public void pleacaInCursa()
    {
        if(this.stare instanceof LaCapatDeLinie)
        {
            System.out.printf("Autobuzul %d condus de %s a plecat în cursă.%n", this.linie, this.sofer);
            inCursa.schimbaStare(this);
        }
        else
        {
            System.out.printf("Autobuzul %d condus de %s nu poate pleca în cursă.%n", this.linie, this.sofer);
        }
    }

    public void trimiteLaReparat()
    {
        if(!(this.stare instanceof LaReparat))
        {
            System.out.printf("Autobuzul %d condus de %s a fost trimis la reparat.%n", this.linie, this.sofer);
            laReparat.schimbaStare(this);
        }
        else
        {
            System.out.printf("Autobuzul %d condus de %s este deja la reparat.%n", this.linie, this.sofer);
        }
    }

    public void trimiteLaCap()
    {
        if(this.stare instanceof LaReparat || this.stare instanceof InCursa)
        {
            System.out.printf("Autobuzul %d condus de %s a ajuns la capătul liniei.%n", this.linie, this.sofer);
            laCapatDeLinie.schimbaStare(this);
        }
        else
        {
            System.out.printf("Autobuzul %d condus de %s este deja la capăt de linie.%n", this.linie, this.sofer);
        }
    }
}
