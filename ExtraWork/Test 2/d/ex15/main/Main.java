package d.ex15.main;

import d.ex15.clase.*;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static final int NR_MAX_CHAR_NUME = 15;
    static final float SOLD_MAX = 10000f;
    static final Random rng = new Random();
    public static void main(String[] args) {
        ContBancar contBancar = new ContBancar(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)+1), rng.nextFloat(SOLD_MAX));

        Executabil depunere = new Depunere(contBancar, rng.nextFloat());
        Executabil retragere = new Retragere(contBancar, rng.nextFloat());

        Functionar bancher = new Functionar();

        bancher.anuleazaUltimaComanda();
        bancher.trimiteComanda(depunere);
        bancher.trimiteComanda(retragere);
        contBancar.interogare();
        bancher.anuleazaUltimaComanda();
        contBancar.interogare();
    }
}
