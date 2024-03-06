package firme;

import java.util.HashMap;
import java.util.Map;

public class ManagerRegistry {
    private Map<String, Manager> manageri;
    private static ManagerRegistry instance = null;

    private ManagerRegistry() {
        manageri = new HashMap<>();
    }

    public static synchronized ManagerRegistry getInstance() {
        if(instance == null) {
            instance = new ManagerRegistry();
        }
        return instance;
    }

    public void inregistreazaManager(String numeFirma, String numeManager, double salariu){
        manageri.putIfAbsent(numeFirma, new Manager(numeManager, numeFirma, salariu));
    }

    public Manager getManager(String numeFirma) {
        return manageri.get(numeFirma);
    }
}
