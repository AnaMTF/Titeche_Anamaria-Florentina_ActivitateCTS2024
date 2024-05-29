package c.ex12.main;

import c.ex12.clase.Abonabil;
import c.ex12.clase.Client;
import c.ex12.clase.Notificare;
import c.ex12.clase.Oferta;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static int LUNGIME_MAX_MESAJ = 200;
    static int LUNGIME_MAX_NUME = 10;
    static int NR_MAX_ABONATI = 20;
    static Random rng = new Random();

    static Abonabil[] getAbonati()
    {
        int nrAbonati = rng.nextInt(NR_MAX_ABONATI)+1;
        Abonabil[] abonati = new Abonabil[nrAbonati];
        for (int i = 0; i < nrAbonati; i++) {
            abonati[i] = new Client(RandomStringUtils.randomAlphabetic(LUNGIME_MAX_NUME)+1);
        }
        return abonati;
    }
    public static void main(String[] args) {
        Notificare oferta = new Oferta(RandomStringUtils.randomAscii(LUNGIME_MAX_MESAJ)+1);
        Abonabil[] abonati = getAbonati();
        oferta.aboneaza(abonati);
        oferta.trimite();
        oferta.dezaboneaza(abonati[0]);
        ((Oferta)oferta).setMesaj(RandomStringUtils.randomAscii(LUNGIME_MAX_MESAJ)+1);
        oferta.trimite();
    }
}
