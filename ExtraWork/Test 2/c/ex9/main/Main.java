package c.ex9.main;

import c.ex9.clase.Achizitionabil;
import c.ex9.clase.Client;
import c.ex9.clase.Medicament;
import c.ex9.clase.ProxyClient;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static int NR_MAX_CHAR_NUME = 6;
    static int NR_MAX_CHAR_MEDICAMENT = 10;
    static int NR_MAX_CLIENTI = 8;
    static Random random = new Random();

    static List<Achizitionabil> getClienti()
    {
        int nrClienti = random.nextInt(NR_MAX_CLIENTI)+1;
        List<Achizitionabil> clienti = new ArrayList<>(nrClienti);
        for (int i = 0; i < nrClienti; i++) {
            clienti.add(new Client(random.nextBoolean(), RandomStringUtils.randomAlphabetic(random.nextInt(NR_MAX_CHAR_NUME)+1)));
        }
        return clienti;
    }

    static void aplicareProxy(List<Achizitionabil> clienti)
    {
        int nrProxy = random.nextInt(clienti.size());
        System.out.printf("Primilor %d li se aplică proxy.%n", nrProxy);
        for (int i = 0; i < nrProxy; i++) {
           new ProxyClient(clienti.get(i)).achizitioneazaMedicament(new Medicament(RandomStringUtils.randomAlphabetic(NR_MAX_CHAR_MEDICAMENT)+1));
        }
        for (int i = clienti.size()-1; i >= nrProxy; i--) {
            clienti.get(i).achizitioneazaMedicament(new Medicament(RandomStringUtils.randomAlphabetic(NR_MAX_CHAR_MEDICAMENT)+1));
        }

    }
    public static void main(String[] args) {
        aplicareProxy(getClienti());
    }
}
