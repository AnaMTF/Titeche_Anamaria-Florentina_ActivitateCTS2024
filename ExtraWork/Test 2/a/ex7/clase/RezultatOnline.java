package a.ex7.clase;

public class RezultatOnline extends DecoratorAbstract{
    public RezultatOnline(Printabil rezultat) {
        super(rezultat);
    }

    @Override
    public void trimiteRezultate() {
        System.out.println("Rezultatele au fost transmise ONLINE!");
    }
}
