package s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.fabrici;

import s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.clase.ProdusGeneric;

public abstract class FabricaProdusGeneric {
    String nume;
    int stoc;

    public FabricaProdusGeneric(String nume, int stoc) {
        this.nume = nume;
        this.stoc = stoc;
    }

    public String getNume() {
        return nume;
    }

    public int getStoc() {
        return stoc;
    }

    public abstract ProdusGeneric creareProdus();
}
