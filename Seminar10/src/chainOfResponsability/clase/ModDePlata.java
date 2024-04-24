package chainOfResponsability.clase;

public abstract class ModDePlata {
    ModDePlata succesor;

    public abstract void plateste(double pretBilet);

    public void setSuccesor(ModDePlata succesor){
        this.succesor = succesor;
    }
}
