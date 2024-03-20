package builder2.main;

import builder2.BuilderInner;
import builder2.Rezervare;

public class Main {
    public static void main(String[] args) {
        BuilderInner builderInner = new BuilderInner();
        Rezervare rezervare1 = builderInner.setMancareInclusa().setBauturaRacoritoare().build();
        Rezervare rezervare2 = builderInner.setMuzicaAmbientala().setGenMuzica("rock").build();
        System.out.println(rezervare1);
        System.out.println(rezervare2);
    }
}