package singletonRegistry.pantof.main;

import singletonRegistry.pantof.clase.Pantof;
import singletonRegistry.pantof.clase.PantofRegistry;

public class Main {
    public static void main(String[] args) throws Exception{
        Pantof pantof1 = new Pantof("Prada", "piele",39,10);
        try {
            PantofRegistry.inregistrarePantof(pantof1.getNumePantof(), pantof1);
            pantof1.afiseazaDescrierePantof();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
