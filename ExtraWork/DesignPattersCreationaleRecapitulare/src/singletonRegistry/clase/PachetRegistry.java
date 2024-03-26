package singletonRegistry.clase;

import java.util.HashMap;
import java.util.Map;

public class PachetRegistry {
    static Map<String, Pachet> colectiiPachete = new HashMap<>();

    private PachetRegistry() {
    }

    public static void inregistrarePachet(String numePachet, Pachet pachet){
        if(colectiiPachete.containsKey(numePachet)){
            throw new RuntimeException("Pachetul " + numePachet + " exista deja in colectie");
        }else {
            colectiiPachete.put(numePachet, pachet);
            System.out.println("Pachetul "+ numePachet + " a fost inregistrat cu succes");
        }
    }

    public Pachet getPachet(String numePachet){
        return colectiiPachete.get(numePachet);
    }
}
