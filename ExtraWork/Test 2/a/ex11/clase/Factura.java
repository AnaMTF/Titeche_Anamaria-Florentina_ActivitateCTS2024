package a.ex11.clase;

public class Factura {
    private String numePacient;
    private Platibil modPlata;

    public void plateste(float suma)
    {
        System.out.printf("%s a plătit suma de %.2f RON cu %s", this.numePacient, suma, this.modPlata.plateste());
    }

    public Factura(String numePacient, Platibil modPlata) {
        this(numePacient);
        this.modPlata = modPlata;
    }

    public void setModPlata(Platibil modPlata) {
        this.modPlata = modPlata;
    }

    public Factura(String numePacient)
    {
        this();
        this.numePacient = numePacient;
    }

    public Factura()
    {
        this.modPlata = new Cash();
    }
}
