package s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.fabrici;

import s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.clase.ProdusGeneric;
import s8.cts.titeche.anamariaflorentina.as.factoryMethod.model.clase.ProduseElectronice;

public class FabricaProduseElectronice extends FabricaProdusGeneric{
    public FabricaProduseElectronice(String nume, int stoc) {
        super(nume, stoc);
    }

    @Override
    public ProdusGeneric creareProdus() {
        return new ProduseElectronice(super.getNume(), super.getStoc());
    }
}
