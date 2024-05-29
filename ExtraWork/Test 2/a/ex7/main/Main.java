package a.ex7.main;

import a.ex7.clase.DecoratorAbstract;
import a.ex7.clase.Printabil;
import a.ex7.clase.Rezultat;
import a.ex7.clase.RezultatOnline;

public class Main {
    static void trimiteRezultate(Printabil printabil)
    {
        printabil.trimiteRezultate();
    }
    public static void main(String[] args) {
        Printabil rezultatPrintat = new Rezultat();
        trimiteRezultate(rezultatPrintat);
        DecoratorAbstract rezultatOnline = new RezultatOnline(rezultatPrintat);
        trimiteRezultate(rezultatOnline);
    }
}