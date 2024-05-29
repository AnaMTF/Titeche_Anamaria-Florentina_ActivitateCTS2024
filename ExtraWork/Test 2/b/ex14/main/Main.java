package b.ex14.main;

import b.ex14.clase.OcupareAbstracta;
import b.ex14.clase.OcupareMasa;
import b.ex14.clase.Persoana;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_NUME = 20;
    static Random rng = new Random();

    public static void main(String[] args) {
        Persoana p1 = new Persoana(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)));
        Persoana p2 = new Persoana(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)));
        Persoana p3 = new Persoana(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)));

        OcupareAbstracta ocupareMasa = new OcupareMasa();
        ocupareMasa.ocupa(p1);
        ocupareMasa.ocupa(p2, p3);
        ocupareMasa.ocupa(p1, p3);
        ocupareMasa.ocupa(p1, p2, p3);
    }
}
