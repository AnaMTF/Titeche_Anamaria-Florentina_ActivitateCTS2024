package d.ex12.clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Subiect {
    private List<Observer> clientiAbonati;
    public Subiect()
    {
        this.clientiAbonati = new ArrayList<>();
    }

    public void aboneaza(Observer... clienti){this.clientiAbonati.addAll(Arrays.asList(clienti));}
    public void dezaboneaza(Observer... abonati){this.clientiAbonati.removeAll(Arrays.asList(abonati));}
    protected void trimiteAbonatilor(String mesaj){this.clientiAbonati.forEach(observer -> observer.afiseazaMesajPrimit(mesaj));}

    public abstract void notifica();
}
