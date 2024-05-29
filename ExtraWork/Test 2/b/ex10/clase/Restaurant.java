package b.ex10.clase;

import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private Map<String, Flyweight> clienti;

    public Restaurant()
    {
        this.clienti = new HashMap<>();
    }

    public Flyweight getClient(String nume)
    {
        return this.clienti.get(nume);
    }

    public void addClient(Flyweight client)
    {
        this.clienti.putIfAbsent(((Client)client).getNume(), client);
    }
}
