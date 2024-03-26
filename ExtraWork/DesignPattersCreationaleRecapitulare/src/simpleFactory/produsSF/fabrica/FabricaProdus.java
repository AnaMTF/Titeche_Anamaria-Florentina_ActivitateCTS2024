package simpleFactory.produsSF.fabrica;

import simpleFactory.produsSF.clase.ProdusBio;
import simpleFactory.produsSF.clase.ProdusElectronic;
import simpleFactory.produsSF.clase.ProdusGenericSF;
import simpleFactory.produsSF.clase.ProdusPerisabil;

public class FabricaProdus {
    public ProdusGenericSF creareProdus(TipProdus tipProdus, String numeProdus, float stoc) throws Exception{
        switch (tipProdus){
            case BIO:
                return new ProdusBio(numeProdus, stoc);
            case PERISABIL:
                return new ProdusPerisabil(numeProdus, stoc);
            case ELECTRONIC:
                return new ProdusElectronic(numeProdus, stoc);
            default:
                throw new RuntimeException("Tipul nu e corect");
        }
    }
}
