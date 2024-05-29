package b.ex16.clase;

public abstract class Fidelizabil {
    protected Fidelizabil succesor;
    abstract void trimite();
    protected final void setSuccesor(Fidelizabil fidelizabil)
    {
        this.succesor = fidelizabil;
    }
}
