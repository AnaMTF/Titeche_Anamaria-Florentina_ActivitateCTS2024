package d.ex13.clase;

public class Bancomat {
    private Retractabil stare;
    private float sold;

    public Bancomat(float sold) {
        this.sold = sold;
        this.stare = new NuAreCard();
    }

    void setStare(Retractabil stare) {
        this.stare = stare;
    }

    public float getSold() {
        return sold;
    }

    public void introduCard()
    {
        if(this.stare instanceof NuAreCard)
        {
            System.out.println("Cardul a fost introdus");
            new AreCard().schimbaStare(this);
        }
        else
        {
            System.out.println("Cardul nu poate fi introdus acum!");
        }
    }

    public void introduPin()
    {
        if(this.stare instanceof AreCard)
        {
            System.out.println("PIN introdus");
            new ArePinIntrodus().schimbaStare(this);
        }
        else
        {
            System.out.println("PIN-ul nu poate fi introdus acum!");
        }
    }

    public void retrageBani(float suma)
    {
        if(this.stare instanceof ArePinIntrodus)
        {
            if(suma<=this.sold)
            {
                this.sold -= suma;
                System.out.printf("Ai retras %.2f RON.Sold rămas %.2f%n", suma, this.sold);
                if(this.sold <= 0.01f)
                {
                    new NuAreBani().schimbaStare(this);
                }
            }
            else
            {
                System.out.println("Sold insuficient!");
            }
        }
        else
        {
            System.out.println("Nu poți retrage bani acum!");
        }
    }

    public void scoateCard()
    {
        if(this.stare instanceof ArePinIntrodus || this.stare instanceof NuAreBani)
        {
            System.out.println("Card retras cu succes!");
            new NuAreCard().schimbaStare(this);
        }
    }
}
