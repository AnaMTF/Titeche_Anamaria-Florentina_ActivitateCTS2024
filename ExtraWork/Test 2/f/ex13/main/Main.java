package f.ex13.main;

import com.github.javafaker.Faker;
import f.ex13.clase.Autobuz;
import f.ex13.clase.Manager;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int NR_MAX_STARI = 50;
    static float NR_MIN_CONSUM = 10.0f;
    static float NR_MAX_CONSUM = 20.0f;
    static int NR_MIN_LOCURI = 20;
    static int NR_MAX_LOCURI = 50;
    static int NR_MIN_AN_FABRICATIE = 2000;
    static int NR_MAX_AN_FABRICATIE = 2020;
    static int NR_MIN_CHAR_MODEL = 10;
    static int NR_MAX_CHAR_MODEL = 20;
    static Random rng = new Random();
    static Faker faker = new Faker();

    static void adaugaStari(Autobuz autobuz, Manager manager)
    {
        int nrStari = rng.nextInt(NR_MAX_STARI)+1;
        for (int i = 0; i < nrStari; i++) {
            autobuz.setSofer(faker.name().fullName());
            autobuz.setConsum(rng.nextFloat()*(NR_MAX_CONSUM-NR_MIN_CONSUM)+NR_MIN_CONSUM);
            manager.adaugaStare(autobuz.creeazaMemento());
        }
    }

    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(rng.nextInt(NR_MAX_LOCURI-NR_MIN_LOCURI)+NR_MIN_LOCURI,
                RandomStringUtils.randomAlphabetic(NR_MIN_CHAR_MODEL, NR_MAX_CHAR_MODEL),
                rng.nextInt(NR_MAX_AN_FABRICATIE-NR_MIN_AN_FABRICATIE)+NR_MIN_AN_FABRICATIE);
        Manager manager = new Manager();

        adaugaStari(autobuz, manager);

        while(true)
        {
            System.out.println(manager.getStare(rng.nextInt(manager.getNrStari())));
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
