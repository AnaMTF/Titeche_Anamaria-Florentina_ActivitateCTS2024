package f.ex15.clase;

public class LaReparat implements Stare{
    @Override
    public void schimbaStare(Autobuz autobuz) {
        autobuz.setStare(this);
    }
}
