package s8.cts.titeche.anamariaflorentina.as.singletonRegistry.clase;

import java.util.HashMap;
import java.util.Map;

public class ProductsRegistry {
    private ProductsRegistry() {
    }
    static Map<String, Produs> listaDeProduse = new HashMap<>();

    public static void adaugareProduse(String nume, Produs produs){
        if(listaDeProduse.containsKey(nume)){
            listaDeProduse.get(nume).cresteStoc(produs.getStoc());
        }else {
            listaDeProduse.put(nume, new Produs(nume, produs.getStoc()));
            System.out.println("Produsul " + nume + " a fost adaugat in lista de produse si are stocul de " + produs.getStoc() + " bucati.");
        }
    }

}
