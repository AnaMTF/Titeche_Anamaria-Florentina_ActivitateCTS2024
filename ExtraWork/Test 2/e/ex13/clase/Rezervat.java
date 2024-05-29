package e.ex13.clase;

public class Rezervat implements Ocupabil{
    @Override
    public void schimbaStare(Loc loc) {
        loc.setStare(this);
    }
}
