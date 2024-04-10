package decorator.claseDecorator;

import decorator.clase.Bilet;
import decorator.clase.BiletAbstract;

public class BiletAniversareSTB extends Decorator {
    public BiletAniversareSTB(BiletAbstract bilet) {
        super(bilet);
    }

    @Override
    public void printareBilet() {
        bilet.printareBilet();
        System.out.printf("La multi ani STB!\n");
    }

    @Override
    public void reducerePret() {
        ((Bilet)bilet).setPret(0);
    }
}
