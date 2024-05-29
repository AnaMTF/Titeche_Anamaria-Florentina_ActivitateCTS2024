package e.ex15.main;

import e.ex15.clase.Manager;
import e.ex15.clase.Meci;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;

public class Main {
    static Random rng = new Random();
    static int NR_MIN_CHAR_ECHIPA_GAZDA = 10;
    static int NR_MAX_CHAR_ECHIPA_GAZDA = 16;
    static int NR_MIN_CHAR_ECHIPA_MUSAFIRI = 10;
    static int NR_MAX_CHAR_ECHIPA_MUSAFIRI = 16;
    static int NR_MIN_SPECTATORI = 10000;
    static int NR_MAX_SPECTATORI = 50000;
    static int NR_MAX_MEMENTO = 50;

    static Date getRandomDate()
    {
        long nrZile = ChronoUnit.DAYS.between(LocalDate.MIN, LocalDate.MAX);
        long nrZileRandom = rng.nextInt((int)nrZile)+1;
        return new Date(LocalDate.MIN.plusDays(nrZileRandom).toEpochDay());
    }

    static void adaugaStari(Meci meci, Manager manager)
    {
        int nrMemento = rng.nextInt(NR_MAX_MEMENTO)+1;
        for (int i = 0; i < nrMemento; i++) {
            meci.seteazaDetalii(getRandomDate(),
                    RandomStringUtils.randomAlphabetic(NR_MIN_CHAR_ECHIPA_GAZDA, NR_MAX_CHAR_ECHIPA_GAZDA),
                    RandomStringUtils.randomAlphabetic(NR_MIN_CHAR_ECHIPA_MUSAFIRI, NR_MAX_CHAR_ECHIPA_MUSAFIRI),
                    rng.nextInt(NR_MIN_SPECTATORI, NR_MAX_SPECTATORI));
            manager.adaugaStare(meci.creeazaMemento());
        }
    }
    public static void main(String[] args) {
        Meci meci = new Meci();
        Manager manager = new Manager();

        adaugaStari(meci, manager);

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
