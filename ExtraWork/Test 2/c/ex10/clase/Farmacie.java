package c.ex10.clase;

import java.util.HashMap;
import java.util.Map;

public class Farmacie {
    private Map<String, Flyweight> clienti;

    public Farmacie()
    {
        this.clienti = new HashMap<>();
    }

    public Flyweight getClient(String nume)
    {
        return this.clienti.get(nume);
    }

    public void adaugaClient(Flyweight client)
    {
        this.clienti.put(((Client)client).getNume(), client);
    }
}
