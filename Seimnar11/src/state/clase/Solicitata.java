package state.clase;

public class Solicitata implements AbstractState{
    @Override
    public void SchimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }

    protected Solicitata() {
    }
}
