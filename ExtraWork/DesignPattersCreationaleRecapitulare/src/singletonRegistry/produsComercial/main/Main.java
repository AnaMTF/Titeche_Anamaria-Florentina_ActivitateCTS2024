package singletonRegistry.produsComercial.main;

import singletonRegistry.produsComercial.clase.Produs;
import singletonRegistry.produsComercial.clase.ProdusGeneric;
import singletonRegistry.produsComercial.clase.ProdusRegistry;

public class Main {
    public static void main(String[] args) {
        Produs produs1 = new Produs(24,"Capsune");
        Produs produs3 = new Produs(24,"Capsune");
        Produs produs2 = new Produs(243.54f,"Zahar");

        try {
            ProdusRegistry.inregistrareProdus(produs1.getNumeProdus(), produs1);
            ProdusRegistry.inregistrareProdus(produs2.getNumeProdus(), produs2);
            ProdusRegistry.inregistrareProdus(produs3.getNumeProdus(), produs3);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
