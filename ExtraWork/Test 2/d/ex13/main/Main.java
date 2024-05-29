package d.ex13.main;

import d.ex13.clase.Bancomat;

import java.util.Random;

public class Main {
    static Random rng = new Random();
    static float MAX_SOLD = 1000f;
    public static void main(String[] args) {
        Bancomat bancomat = new Bancomat(rng.nextFloat(MAX_SOLD));
        bancomat.retrageBani(rng.nextFloat(bancomat.getSold()));
        bancomat.introduPin();
        bancomat.introduCard();
        bancomat.introduPin();
        bancomat.scoateCard();
        bancomat.introduCard();
        bancomat.introduPin();
        bancomat.retrageBani(rng.nextFloat(bancomat.getSold()));
        bancomat.scoateCard();
    }
}
