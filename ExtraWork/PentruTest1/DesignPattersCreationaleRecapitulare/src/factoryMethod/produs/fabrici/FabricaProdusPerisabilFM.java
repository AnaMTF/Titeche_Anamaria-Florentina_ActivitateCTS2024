package factoryMethod.produs.fabrici;

import factoryMethod.produs.clase.ProdusGenericFactoryMethod;
import factoryMethod.produs.clase.ProdusPerisabil;

public class FabricaProdusPerisabilFM implements FabricaProdusGenericFM{
    @Override
    public ProdusGenericFactoryMethod creareProdus(String nume, float stoc) {
        return new ProdusPerisabil(nume, stoc);
    }
}
