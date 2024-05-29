package d.ex13.clase;

public class AreCard implements Retractabil{
    protected AreCard(){}

    @Override
    public void schimbaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
