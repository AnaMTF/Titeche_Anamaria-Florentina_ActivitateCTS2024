package b.ex12.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Observer> clienti;

    public Subiect()
    {
        this.clienti = new ArrayList<>();
    }

    public abstract void anuntaOferta(String oferta);

    public void aboneazaObserver(Observer o) {this.clienti.add(o);}
    public void dezaboneazaObserver(Observer o) {this.clienti.remove(o);}
    protected void anuntaObserverii(String mesaj)
    {
        clienti.forEach(client -> client.primesteNotificareOferta(mesaj));
    }
}
