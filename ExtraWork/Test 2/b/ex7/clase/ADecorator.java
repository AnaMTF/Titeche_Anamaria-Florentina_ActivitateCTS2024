package b.ex7.clase;

public abstract class ADecorator implements Printabil {
    protected Printabil chitanta;

    public ADecorator(Printabil chitanta)
    {
        this.chitanta = chitanta;
    }
}
