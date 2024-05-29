package d.ex13.clase;

public class NuAreCard implements Retractabil{
    protected NuAreCard()
    {
    }

    @Override
    public void schimbaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
