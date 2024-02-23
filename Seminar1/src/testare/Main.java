package testare;

import model.acvatice.Caras;
import model.animale.Lion;
import model.animale.Zebra;
import model.zoo.Zoo;
import model.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Bucuresti", new ZooKeeper("Gigel"));
        zoo.addVietate(new Lion( 5, "Simba", 4), "carne");
        zoo.addVietate(new Zebra( 2, "Suzy", 4), "fan");
        zoo.addVietate(new Lion( 9, "Rex", 4), "carne");
        zoo.addVietate(new Caras(2, "Caras"), "alge");
        zoo.feedAllAnimals();

        tipuriMancare tipCarnivor = tipuriMancare.CARNE;
        tipuriMancare tipIerbivor = tipuriMancare.FAN;
        tipuriMancare tipAcvatic = tipuriMancare.ALGE;

        System.out.println("Tipul de mancare al leului este: " + tipCarnivor);
        System.out.println("Tipul de mancare al zebrei este: " + tipIerbivor);
        System.out.println("Tipul de mancare al carasului este: " + tipAcvatic);
    }

    public enum tipuriMancare{
        CARNE, FAN, ALGE;

    }
}