package factoryMethod.produs.fabrici;

import factoryMethod.produs.clase.ProdusElectronic;
import factoryMethod.produs.clase.ProdusGenericFactoryMethod;

public class FabricaProdusElectric implements FabricaProdusGenericFM{
    @Override
    public ProdusGenericFactoryMethod creareProdus(String nume, float stoc) {
        return new ProdusElectronic(nume, stoc);
    }
}
