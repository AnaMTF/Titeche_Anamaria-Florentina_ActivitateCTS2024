package e.ex12.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    private List<Abonabil> abonati;
    public Subiect()
    {
        this.abonati = new ArrayList<>();
    }
    public void aboneaza(Abonabil abonabil){this.abonati.add(abonabil);}
    public void dezaboneaza(Abonabil abonabil){this.abonati.remove(abonabil);}
    protected void notifica(String mesaj){this.abonati.forEach(abonabil -> abonabil.primeste(mesaj));}
    public abstract void trimite();
}
