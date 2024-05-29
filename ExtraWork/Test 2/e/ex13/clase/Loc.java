package e.ex13.clase;

public class Loc {
    private final int loc;
    private Ocupabil stare;
    private static final Ocupabil liber = new Liber();
    private static final Ocupabil ocupat = new Ocupat();
    private static final Ocupabil rezervat = new Rezervat();

    public Loc(int loc) {
        this.loc = loc;
        liber.schimbaStare(this);
    }

    void setStare(Ocupabil stare)
    {
        this.stare = stare;
    }

    public void rezerva()
    {
        if(this.stare instanceof Liber)
        {
            System.out.printf("Locul %d a fost rezervat.%n", this.loc);
            rezervat.schimbaStare(this);
        }
        else
        {
            System.out.printf("Locul %d nu poate fi rezervat.%n", this.loc);
        }
    }

    public void ocupa()
    {
        if(this.stare instanceof Rezervat)
        {
            System.out.printf("Locul %d a fost ocupat.%n", this.loc);
            ocupat.schimbaStare(this);
        }
        else
        {
            System.out.printf("Locul %d nu poate fi rezervat.%n", this.loc);
        }
    }

    public void renunta()
    {
        if(this.stare instanceof Ocupat)
        {
            System.out.printf("Locul %d a fost eliberat.%n", this.loc);
            liber.schimbaStare(this);
        }
        else
        {
            System.out.printf("Locul %d nu poate fi eliberat.%n", this.loc);
        }
    }
}
