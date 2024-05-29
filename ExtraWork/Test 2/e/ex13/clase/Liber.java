package e.ex13.clase;

public class Liber implements Ocupabil{
    @Override
    public void schimbaStare(Loc loc) {
        loc.setStare(this);
    }
}
