package cts.titeche.anamariaflorentina.as.pattern.model.fabrici;

import cts.titeche.anamariaflorentina.as.pattern.model.clase.ProdusGeneric;
import cts.titeche.anamariaflorentina.as.pattern.model.clase.ProduseElectronice;

public class FabricaProduseElectronice extends FabricaProdusGeneric{
    public FabricaProduseElectronice(String nume, int stoc) {
        super(nume, stoc);
    }

    @Override
    public ProdusGeneric creareProdus() {
        return ProduseElectronice.getInstantaProdusElectronic(super.getNume(), super.getStoc());
    }
}
