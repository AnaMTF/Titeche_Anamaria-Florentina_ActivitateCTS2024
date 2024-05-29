package d.ex12.main;

import d.ex12.clase.Banca;
import d.ex12.clase.Client;
import d.ex12.clase.Observer;
import d.ex12.clase.Subiect;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_NUME = 15;
    static Random rng = new Random();

    static Observer getClient()
    {
        return new Client(RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)));
    }
    public static void main(String[] args) {
        Observer c1 = getClient();
        Observer c2 = getClient();
        Observer c3 = getClient();

        Subiect banca = new Banca("Mesaj default");

        banca.aboneaza(c1, c2, c3);

        banca.notifica();

        banca.dezaboneaza(c2);

        ((Banca)banca).setMesaj("Oferta noua!");

        banca.notifica();
    }
}
