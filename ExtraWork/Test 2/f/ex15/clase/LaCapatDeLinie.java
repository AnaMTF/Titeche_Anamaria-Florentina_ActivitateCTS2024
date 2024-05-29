package f.ex15.clase;

public class LaCapatDeLinie implements Stare{
    @Override
    public void schimbaStare(Autobuz autobuz) {
        autobuz.setStare(this);
    }
}
