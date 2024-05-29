package d.ex13.clase;

public class ArePinIntrodus implements Retractabil{
    protected ArePinIntrodus(){}


    @Override
    public void schimbaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
