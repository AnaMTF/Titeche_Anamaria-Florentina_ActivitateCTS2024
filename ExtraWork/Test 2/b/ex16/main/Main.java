package b.ex16.main;

import b.ex16.clase.Client;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static final int NR_MAX_CLIENTI = 100;
    static final int NR_MAX_CHAR_EMAIL = 15;
    static final int LUNGIME_NR_TELEFON = 10;
    static final String DOMENIU = "acs.ase.ro";
    static final Random rng = new Random();

    static String getNrTelefon()
    {
        return String.format("+%s", RandomStringUtils.randomNumeric(LUNGIME_NR_TELEFON));
    }

    static String getEmail()
    {
        return String.format("%s.%s@%s", RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_EMAIL)), RandomStringUtils.randomAlphabetic(rng.nextInt(NR_MAX_CHAR_EMAIL)), DOMENIU);
    }

    static List<Client> getClienti()
    {
        int nrClienti = rng.nextInt(NR_MAX_CLIENTI);
        List<Client> clienti = new ArrayList<>(nrClienti);
        for (int i = 0; i < nrClienti; i++) {
            clienti.add(new Client(rng.nextBoolean() ? getNrTelefon() : null, rng.nextBoolean() ? getEmail() : null));
        }
        return clienti;
    }
    public static void main(String[] args) {
        List<Client> clienti = getClienti();
        clienti.forEach(Client::anunta);
    }
}
