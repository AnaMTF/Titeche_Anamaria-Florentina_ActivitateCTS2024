package s8.cts.titeche.anamariaflorentina.as.pattern.main;

import s8.cts.titeche.anamariaflorentina.as.pattern.model.fabrici.FabricaProdusGeneric;
import s8.cts.titeche.anamariaflorentina.as.pattern.model.fabrici.FabricaProduseBio;
import s8.cts.titeche.anamariaflorentina.as.pattern.model.clase.ProdusGeneric;
import s8.cts.titeche.anamariaflorentina.as.pattern.model.fabrici.FabricaProduseElectronice;
import s8.cts.titeche.anamariaflorentina.as.pattern.model.fabrici.FabricaProdusePerisabile;

public class Main {
    public static void main(String[] args) {
        FabricaProdusGeneric fabricaProdusBio = new FabricaProduseBio("Bio", 10);
        FabricaProdusGeneric fabricaProdusBio2 = new FabricaProduseBio("Bio", 3330);
        FabricaProdusGeneric fabricaProdusBio3 = new FabricaProduseBio("BioProdus", 3330);

        ProdusGeneric produsBio = fabricaProdusBio.creareProdus();
        produsBio.afiseazaDescriereProdus();
        ProdusGeneric produsBio2 = fabricaProdusBio2.creareProdus();
        produsBio2.afiseazaDescriereProdus();
        ProdusGeneric produsBio3 = fabricaProdusBio3.creareProdus();
        produsBio3.afiseazaDescriereProdus();

        FabricaProdusGeneric fabricaProdusElectronic = new FabricaProduseElectronice("Electronic", 20);
        FabricaProdusGeneric fabricaProdusElectronic2 = new FabricaProduseElectronice("Electronic", 32131220);
        FabricaProdusGeneric fabricaProdusElectronic3 = new FabricaProduseElectronice("Electronic22222", 32131220);

        ProdusGeneric produsElectronic = fabricaProdusElectronic.creareProdus();
        produsElectronic.afiseazaDescriereProdus();
        ProdusGeneric produsElectronic2 = fabricaProdusElectronic2.creareProdus();
        produsElectronic2.afiseazaDescriereProdus();
        ProdusGeneric produsElectronic3 = fabricaProdusElectronic3.creareProdus();
        produsElectronic3.afiseazaDescriereProdus();

        FabricaProdusGeneric fabricaProdusPerisabil = new FabricaProdusePerisabile("Perisabil", 30);
        FabricaProdusGeneric fabricaProdusPerisabil2 = new FabricaProdusePerisabile("Perisabil", 3311210);
        FabricaProdusGeneric fabricaProdusPerisabil3 = new FabricaProdusePerisabile("Perisabil22222", 3311210);
        ProdusGeneric produsPerisabil = fabricaProdusPerisabil.creareProdus();
        ProdusGeneric produsPerisabil2 = fabricaProdusPerisabil2.creareProdus();
        ProdusGeneric produsPerisabil3 = fabricaProdusPerisabil3.creareProdus();
        produsPerisabil.afiseazaDescriereProdus();
        produsPerisabil2.afiseazaDescriereProdus();
        produsPerisabil3.afiseazaDescriereProdus();


    }
}