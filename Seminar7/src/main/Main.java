package main;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;
import adapter.softVechi.*;

public class Main {

    public static void platesteConsumatia(SoftBucatarie comanda){
        comanda.printareBon();
    }
    public static void main(String[] args) {

        SoftBucatarie bucatarie = new Bucatarie();
        Produs produs1 = new Produs("Pizza", 33);
        Produs produs2 = new Produs("Paste Carbonara", 55);

        bucatarie.adaugaProdus(produs1);
        bucatarie.adaugaProdus(produs2);

        platesteConsumatia(bucatarie);

        Bar barB = new Bar();

        barB.adaugaBautura(new Bautura("Cuba Libre", 10, 20.5f));
        barB.adaugaBautura(new Bautura("Mojito", 10, 16.9f));

        AdapterComandaBarBucatarie bar = new AdapterComandaBarBucatarie();
        bar.adaugaBautura(new Bautura("Cola", 10, 0));
        bar.adaugaBautura(new Bautura("Pepsi", 15, 0));

        Bautura bautura = new Bautura("Fanta", 12, 0);
        AdapterBauturaProdus produs = new AdapterBauturaProdus(bautura);
        bar.adaugaProdus(produs);


        platesteConsumatia(bar);

    }
}