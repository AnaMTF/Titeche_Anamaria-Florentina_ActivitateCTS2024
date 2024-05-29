package c.ex10.main;

import c.ex10.clase.Client;
import c.ex10.clase.Farmacie;
import c.ex10.clase.Flyweight;
import c.ex10.clase.Reteta;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_NUME = 10;
    static int NR_MAX_CHAR_ASIGURARE = 10;
    static int NR_MAX_RETETE = 15;
    static int NR_MAX_MEDICAMENTE = 10;
    static int NR_MAX_RETETA = 1000;
    static float VALOARE_MAX_RETETA = 500f;
    static int NR_MAX_CLIENTI = 7;
    static Random rng = new Random();

    static List<Flyweight> getClienti()
    {
        var nrClienti = rng.nextInt(NR_MAX_CLIENTI)+1;
        List<Flyweight> clienti = new ArrayList<>(nrClienti);
        for (int i = 0; i < nrClienti; i++) {
            clienti.add(new Client(RandomStringUtils.randomAlphanumeric(rng.nextInt(NR_MAX_CHAR_ASIGURARE)+1), RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_NUME)+1)));
        }
        return clienti;
    }

    static List<Reteta> getRetete()
    {
        var nrReteta = rng.nextInt(NR_MAX_RETETE)+1;
        List<Reteta> retete = new ArrayList<>(nrReteta);
        for (int i = 0; i < nrReteta; i++) {
            retete.add(new Reteta(rng.nextInt(NR_MAX_MEDICAMENTE)+1, rng.nextInt(NR_MAX_RETETA)+1, rng.nextFloat(VALOARE_MAX_RETETA)+1));
        }
        return retete;
    }

    public static void main(String[] args) {
        Farmacie farmacie = new Farmacie();
        List<Flyweight> clienti = getClienti();
        List<Reteta> retete = getRetete();
        for (Flyweight client : clienti) {
            farmacie.adaugaClient(client);
            var flyweight = farmacie.getClient(((Client)client).getNume());
            for (Reteta reteta : retete) {
                flyweight.afiseaza(reteta);
            }
        }
    }
}
