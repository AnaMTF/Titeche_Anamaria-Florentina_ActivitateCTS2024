package decorator.claseDecorator;

import decorator.clase.Bilet;
import decorator.clase.BiletAbstract;

public class BiletSarbatori extends Decorator{
    private static double discount = 0.5;
    public BiletSarbatori(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        bilet.printareBilet();
        System.out.println("Sarbatori fericite!\n");
    }

    @Override
    public void reducerePret() {
        double pret = ((Bilet)bilet).getPret() - discount * ((Bilet)bilet).getPret();
        ((Bilet)bilet).setPret(pret);
    }
}
