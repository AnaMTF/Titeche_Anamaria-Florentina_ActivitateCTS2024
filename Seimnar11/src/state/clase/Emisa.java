package state.clase;

public class Emisa implements AbstractState{
    @Override
    public void SchimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }

    protected Emisa() {
    }
}
