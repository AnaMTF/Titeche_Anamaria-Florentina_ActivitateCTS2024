package c.ex12.clase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Notificare {
    private List<Abonabil> abonati;
    public Notificare()
    {
        this.abonati = new ArrayList<>();
    }
    public void aboneaza(Abonabil... abonabil){this.abonati.addAll(Arrays.asList(abonabil));}
    public void dezaboneaza(Abonabil abonabil){this.abonati.removeAll(Arrays.asList(abonabil));}
    protected void notifica(String mesaj){this.abonati.forEach(abonabil -> abonabil.primesteNotificare(mesaj));}
    public abstract void trimite();
}
