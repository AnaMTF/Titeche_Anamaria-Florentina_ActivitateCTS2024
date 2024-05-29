package d.ex13.clase;

public class NuAreBani implements Retractabil{
    protected NuAreBani(){}

    @Override
    public void schimbaStare(Bancomat bancomat) {
        bancomat.setStare(this);
    }
}
