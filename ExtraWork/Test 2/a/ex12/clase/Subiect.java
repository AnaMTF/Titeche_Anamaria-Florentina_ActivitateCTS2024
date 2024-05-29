package a.ex12.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> pacienti;
    public Subiect()
    {
        this.pacienti = new ArrayList<>();
    }
    public abstract void anuntaVirus(String cartier);

    public void abonareListaVirusi(Observer pacient)
    {
        this.pacienti.add(pacient);
    }

    public void dezabonareListaVirusi(Observer pacient)
    {
        this.pacienti.remove(pacient);
    }

    public void anuntVirusNou(String virus)
    {
        this.pacienti.forEach(pacient -> pacient.primesteNotificareVirus(virus));
    }
}
