package e.ex12.main;

import e.ex12.clase.Abonabil;
import e.ex12.clase.Client;
import e.ex12.clase.Meci;
import e.ex12.clase.Subiect;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static final int NR_MAX_CHAR_NUME = 10;
    public static final int NR_MAX_CLIENTI = 7;
    public static final Random rng = new Random();
    public static final List<String> TIPURI = new ArrayList<>(List.of(
       "volei",
       "fotbal",
       "handbal"
    ));

    static List<Abonabil> getClienti()
    {
        int nrClienti = rng.nextInt(NR_MAX_CLIENTI) + 1;
        List<Abonabil> clienti = new ArrayList<>();
        for (int i = 0; i < nrClienti; i++) {
            clienti.add(new Client(RandomStringUtils.randomAlphabetic(NR_MAX_CHAR_NUME)+1));
        }
        return clienti;
    }

    public static void main(String[] args) {
        Subiect meci = new Meci(TIPURI.get(rng.nextInt(TIPURI.size())));
        List<Abonabil> abonati = getClienti();
        abonati.forEach(meci::aboneaza);
        while(!abonati.isEmpty())
        {
            meci.trimite();
            Abonabil a = abonati.get(rng.nextInt(abonati.size()));
            System.out.printf("-----Se dezabonează %s------%n", ((Client)a).getNume());
            meci.dezaboneaza(a);
            abonati.remove(a);
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ((Meci)meci).setTip(TIPURI.get(rng.nextInt(TIPURI.size())));
        }
    }
}
