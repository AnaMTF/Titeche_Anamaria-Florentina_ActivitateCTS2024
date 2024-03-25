package s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.fabrici;

import s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.clase.ProdusGeneric;
import s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.clase.ProdusePerisabile;

public class FabricaProdusePerisabile extends FabricaProdusGeneric{
    public FabricaProdusePerisabile(String nume, int stoc) {
        super(nume, stoc);
    }

    @Override
    public ProdusGeneric creareProdus() {
        return new ProdusePerisabile(super.getNume(), super.getStoc());
    }
}
