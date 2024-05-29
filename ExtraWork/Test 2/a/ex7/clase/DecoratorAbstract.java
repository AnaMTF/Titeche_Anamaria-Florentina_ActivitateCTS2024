package a.ex7.clase;

public abstract class DecoratorAbstract implements Printabil {
    protected Printabil rezultat;

    public DecoratorAbstract(Printabil rezultat) {
        this.rezultat = rezultat;
    }
}
