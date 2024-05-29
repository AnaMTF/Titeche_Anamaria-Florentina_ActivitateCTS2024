package b.ex14.clase;

public abstract class OcupareAbstracta {
    abstract void curata();
    abstract void asaza();
    abstract void pune();
    abstract void invita(Persoana... persoane);

    public final void ocupa(Persoana... persoane)
    {
        curata();
        asaza();
        pune();
        invita(persoane);
    }
}
