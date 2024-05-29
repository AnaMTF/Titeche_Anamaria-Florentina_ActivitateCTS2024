package b.ex7.main;

import b.ex7.clase.ADecorator;
import b.ex7.clase.NotaDePlata;
import b.ex7.clase.NotaDePlataDeSarbatori;
import b.ex7.clase.Printabil;

public class Main {
    public static void main(String[] args) {
        Printabil notaDePlata = new NotaDePlata(46.7f);
        notaDePlata.tipareste();
        ADecorator notaSarbatori = new NotaDePlataDeSarbatori(notaDePlata);
        notaSarbatori.tipareste();
    }
}
