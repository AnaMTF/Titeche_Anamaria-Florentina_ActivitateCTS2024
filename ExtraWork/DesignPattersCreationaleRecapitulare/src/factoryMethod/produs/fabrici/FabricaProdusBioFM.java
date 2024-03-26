package factoryMethod.produs.fabrici;

import factoryMethod.produs.clase.ProdusBio;
import factoryMethod.produs.clase.ProdusGenericFactoryMethod;

public class FabricaProdusBioFM implements FabricaProdusGenericFM{
    @Override
    public ProdusGenericFactoryMethod creareProdus(String nume, float stoc) {
        return new ProdusBio(nume,stoc);
    }
}
