package flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    private String nume;
    private float capital;
    private Map<String, FlyweightClient> registru;

    public Banca(String nume, float capital) {
        this.nume = nume;
        this.capital = capital;
        this.registru = new HashMap<>();
    }

    public FlyweightClient getClient(String nume)
    {
        if(!registru.containsKey(nume))
        {
            throw new IllegalArgumentException("Clientul nu exista");
        }
        return registru.get(nume);
    }

    public FlyweightClient getClient(String nume, String adresa, String numarTelefon)
    {
        Client c = new Client(nume, adresa, numarTelefon);
        if(!registru.containsKey(nume))
        {
            registru.put(nume, c);
        }
        return registru.get(nume);
    }
}