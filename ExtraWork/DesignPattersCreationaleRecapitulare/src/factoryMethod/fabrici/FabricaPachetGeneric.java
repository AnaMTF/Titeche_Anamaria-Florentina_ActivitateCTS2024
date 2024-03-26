package factoryMethod.fabrici;

import factoryMethod.clase.PachetGeneric;

public abstract class FabricaPachetGeneric {
    String numePachet;
    float pret;

    public FabricaPachetGeneric(String numePachet, float pret) {
        this.numePachet = numePachet;
        this.pret = pret;
    }

    public String getNumePachet() {
        return numePachet;
    }
    public float getPret() {
        return pret;
    }
    public abstract PachetGeneric crearePachet();
}
