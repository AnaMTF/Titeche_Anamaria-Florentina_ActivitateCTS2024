package s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.fabrici;

import s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.clase.ProdusGeneric;
import s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.clase.ProduseBio;
import s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.clase.ProdusePerisabile;

public class FabricaProduseBio extends FabricaProdusGeneric{
    public FabricaProduseBio(String nume, int stoc) {
        super(nume, stoc);
    }

    @Override
    public ProdusGeneric creareProdus() {
        return new ProduseBio(super.getNume(), super.getStoc());
    }
}
