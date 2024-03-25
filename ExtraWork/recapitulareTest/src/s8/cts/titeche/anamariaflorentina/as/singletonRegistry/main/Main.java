package s8.cts.titeche.anamariaflorentina.as.singletonRegistry.main;

import s8.cts.titeche.anamariaflorentina.as.singletonRegistry.clase.ProductsRegistry;
import s8.cts.titeche.anamariaflorentina.as.singletonRegistry.clase.Produs;

public class Main {
    public static void main(String[] args) {
        Produs produs = new Produs("aaa", 123);
        Produs produs1= new Produs("ass", 112);
        Produs produs2= new Produs("aaa", 32);
        Produs produs3 = new Produs("asd", 234);

        ProductsRegistry.adaugareProduse(produs.getNumeProdus(),produs);
        ProductsRegistry.adaugareProduse(produs1.getNumeProdus(),produs1);
        ProductsRegistry.adaugareProduse(produs2.getNumeProdus(),produs2);
        ProductsRegistry.adaugareProduse(produs3.getNumeProdus(),produs3);
    }
}
