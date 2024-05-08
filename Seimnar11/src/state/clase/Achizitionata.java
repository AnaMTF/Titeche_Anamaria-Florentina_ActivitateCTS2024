package state.clase;

public class Achizitionata implements AbstractState{
    @Override
    public void SchimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }

    protected Achizitionata() {
    }
}
