package singletonRegistry.pantof.clase;

import java.util.HashMap;
import java.util.Map;

public class PantofRegistry {
    static Map<String, Pantof> colectiePantofi = new HashMap<>();

    public static void inregistrarePantof(String numePantof, Pantof pantof) throws Exception{
        if (colectiePantofi.containsKey(numePantof)){
            throw new RuntimeException("exista deja");
        }else {
            colectiePantofi.put(numePantof, pantof);
        }
    }

    public static Pantof getPantof(String numePantof){
        return colectiePantofi.get(numePantof);
    }
}
