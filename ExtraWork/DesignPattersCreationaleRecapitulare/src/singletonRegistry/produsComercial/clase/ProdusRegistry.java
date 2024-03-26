package singletonRegistry.produsComercial.clase;

import java.util.HashMap;
import java.util.Map;

public class ProdusRegistry {
    static Map<String, Produs> colectieProduse = new HashMap<>();

    private ProdusRegistry() {
    }

    public static void inregistrareProdus(String numeProdus, Produs produs){
        if (colectieProduse.containsKey(numeProdus)){
            produs.cresteStoc(produs.getStoc());
        }else {
            colectieProduse.put(numeProdus,produs);
            System.out.println("Produsul " + numeProdus + "a fost adaugat cu succes");
        }
    }

    public Produs getProdus(String numeProdus){
        return colectieProduse.get(numeProdus);
    }
}
