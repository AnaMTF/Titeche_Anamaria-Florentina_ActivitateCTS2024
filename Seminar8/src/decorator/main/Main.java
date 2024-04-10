package decorator.main;

import decorator.clase.Bilet;
import decorator.clase.BiletAbstract;
import decorator.claseDecorator.BiletAniversareSTB;
import decorator.claseDecorator.BiletSarbatori;
import decorator.claseDecorator.Decorator;

public class Main {
    public static void main(String[] args) {
        BiletAbstract bilet = new Bilet(3,"AJUVH3");
        printare(bilet);

        Decorator decorator1 = new BiletSarbatori(bilet);
        decorator1.reducerePret();
        printare(decorator1);

        Decorator decorator2 = new BiletAniversareSTB(bilet);
        decorator2.reducerePret();
        printare(decorator2);

        Decorator decorator3 = new BiletAniversareSTB(decorator1);

        printare(decorator3);


    }

    public static void printare(BiletAbstract bilet){
        bilet.printareBilet();

    }
}