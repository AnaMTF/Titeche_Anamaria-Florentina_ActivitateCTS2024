package cts.titeche.anamariaflorentina.as.pattern.model.fabrici;

import cts.titeche.anamariaflorentina.as.pattern.model.clase.ProdusGeneric;
import cts.titeche.anamariaflorentina.as.pattern.model.clase.ProdusePerisabile;

public class FabricaProdusePerisabile extends FabricaProdusGeneric{
    public FabricaProdusePerisabile(String nume, int stoc) {
        super(nume, stoc);
    }

    @Override
    public ProdusGeneric creareProdus() {
        return ProdusePerisabile.getInstantaProdusPerisabil(super.getNume(), super.getStoc());
    }
}
