package factoryMethod.produs.main;

import factoryMethod.produs.clase.ProdusGenericFactoryMethod;
import factoryMethod.produs.fabrici.FabricaProdusBioFM;
import factoryMethod.produs.fabrici.FabricaProdusGenericFM;

public class Main {
    public static void creare(FabricaProdusGenericFM fabricaProdusGenericFM, String nume, float stoc){
        ProdusGenericFactoryMethod produsGenericFactoryMethod = fabricaProdusGenericFM.creareProdus(nume,stoc);
        produsGenericFactoryMethod.afiseazaDescriereProdus();
    }
    public static void main(String[] args) {
        creare(new FabricaProdusBioFM(),"Banane", 44);
    }
}
