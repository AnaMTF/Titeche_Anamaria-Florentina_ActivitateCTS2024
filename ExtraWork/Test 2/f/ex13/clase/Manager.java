package f.ex13.clase;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Autobuz.Memento> stariAutobuz = new ArrayList<>();

    public void adaugaStare(Autobuz.Memento memento)
    {
        this.stariAutobuz.add(memento);
    }

    public Autobuz.Memento getStare(int index)
    {
        return this.stariAutobuz.get(index);
    }

    public int getNrStari()
    {
        return this.stariAutobuz.size();
    }
}
