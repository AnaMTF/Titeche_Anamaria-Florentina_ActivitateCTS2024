package cts.titeche.anamariaflorentina.as.pattern.model.fabrici;

import cts.titeche.anamariaflorentina.as.pattern.model.clase.ProdusGeneric;
import cts.titeche.anamariaflorentina.as.pattern.model.clase.ProduseBio;

public class FabricaProduseBio extends FabricaProdusGeneric{
    public FabricaProduseBio(String nume, int stoc) {
        super(nume, stoc);
    }

    @Override
    public ProdusGeneric creareProdus() {
        return ProduseBio.getInstantaProdusBio(super.getNume(), super.getStoc());
    }
}
