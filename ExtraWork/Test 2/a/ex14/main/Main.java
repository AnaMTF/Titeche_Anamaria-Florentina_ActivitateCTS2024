package a.ex14.main;

import org.apache.commons.lang3.RandomStringUtils;
import other.online_1094.template_method.clase.Pacient;
import other.online_1094.template_method.clase.SpitalPublic;

import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_DENUMIRE_SPITAL = 20;
    static int NR_MAX_CHAR_NUME_PACIENT = 10;
    static Random rng = new Random();
    public static void main(String[] args) {
        SpitalPublic spitalPublic = new SpitalPublic(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_DENUMIRE_SPITAL)), 2);
        Pacient pacient1 = new Pacient(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME_PACIENT)));
        Pacient pacient2 = new Pacient(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME_PACIENT)));
        Pacient pacient3 = new Pacient(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME_PACIENT)));

        spitalPublic.internare(pacient1);
        spitalPublic.internare(pacient2);
        spitalPublic.internare(pacient3);
    }
}
