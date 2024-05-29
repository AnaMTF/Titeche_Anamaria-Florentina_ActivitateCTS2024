package b.ex12.main;

import b.ex12.clase.Client;
import b.ex12.clase.Observer;
import b.ex12.clase.Oferta;
import b.ex12.clase.Subiect;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public class Main {
    static int MAX_NR_LITERE_NUME = 15;
    public static void main(String[] args) {
        Random rng = new Random();
        Observer client1 = new Client(RandomStringUtils.randomAlphabetic(rng.nextInt(MAX_NR_LITERE_NUME)));
        Observer client2 = new Client(RandomStringUtils.randomAlphabetic(rng.nextInt(MAX_NR_LITERE_NUME)));
        Observer client3 = new Client(RandomStringUtils.randomAlphabetic(rng.nextInt(MAX_NR_LITERE_NUME)));

        Subiect oferta = new Oferta();

        oferta.aboneazaObserver(client1);
        oferta.aboneazaObserver(client2);
        oferta.aboneazaObserver(client3);

        oferta.anuntaOferta("Tehasa cartofi cu carne la 3 RON.");

        oferta.dezaboneazaObserver(client2);

        oferta.anuntaOferta("Musaca bună rău la 5 RON.");

        oferta.dezaboneazaObserver(client1);

        oferta.anuntaOferta("Săptămâna asta avem un meniu bazat pe fructe de mare.");

        oferta.dezaboneazaObserver(client3);

        oferta.anuntaOferta("O ofertă atât de bună... păcat că n-o mai vede nimeni!");
    }
}
