package e.ex15.clase;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Meci.Memento> stari = new ArrayList<>();

    public void adaugaStare(Meci.Memento memento)
    {
        this.stari.add(memento);
    }

    public Meci.Memento getStare(int index)
    {
        return this.stari.get(index);
    }

    public int getNrStari()
    {
        return this.stari.size();
    }
}
