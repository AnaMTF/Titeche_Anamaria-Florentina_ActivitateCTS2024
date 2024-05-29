package f.ex15.clase;

public class InCursa implements Stare{
    @Override
    public void schimbaStare(Autobuz autobuz) {
        autobuz.setStare(this);
    }
}
