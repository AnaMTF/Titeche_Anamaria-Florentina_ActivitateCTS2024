package f.ex9.clase;

import java.util.HashMap;
import java.util.Map;

public class STB {
    private Map<Integer, Flyweight> linii;

    public STB()
    {
        this.linii = new HashMap<>();
    }

    public Flyweight getLinie(int linie, String primaStatie, String ultimaStatie)
    {
        if(this.linii.containsKey(linie))
        {
            return this.linii.get(linie);
        }
        else {
            Flyweight linieFlyweight = new Linie(linie, primaStatie, ultimaStatie);
            this.linii.put(linie, linieFlyweight);
            return linieFlyweight;
        }
    }

    public Flyweight getLinie(int linie)
    {
        return this.linii.get(linie);
    }
}
