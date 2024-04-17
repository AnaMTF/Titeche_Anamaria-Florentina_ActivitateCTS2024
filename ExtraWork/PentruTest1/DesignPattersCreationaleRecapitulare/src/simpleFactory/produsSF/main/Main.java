package simpleFactory.produsSF.main;

import simpleFactory.produsSF.clase.ProdusGenericSF;
import simpleFactory.produsSF.fabrica.FabricaProdus;
import simpleFactory.produsSF.fabrica.TipProdus;

public class Main {
    public static void main(String[] args) {
        FabricaProdus fabrica = new FabricaProdus();
        try{
            ProdusGenericSF produsBio = fabrica.creareProdus(TipProdus.BIO, "Banane BIO", 32);
            ProdusGenericSF produsElectronic = fabrica.creareProdus(TipProdus.ELECTRONIC, "laptop", 10);
            ProdusGenericSF produsPerisabil1 = fabrica.creareProdus(TipProdus.PERISABIL, "lapte", 44.6f);
            ProdusGenericSF produsPerisabil2 = fabrica.creareProdus(TipProdus.PERISABIL, "oua", 44);

            produsBio.afiseazaDescriereProdus();
            produsElectronic.afiseazaDescriereProdus();
            produsPerisabil1.afiseazaDescriereProdus();
            produsPerisabil2.afiseazaDescriereProdus();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
