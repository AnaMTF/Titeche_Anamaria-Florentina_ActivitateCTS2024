package d.ex7.main;

import d.ex7.clase.Operator;
import d.ex7.clase.Persoana;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static Random rng = new Random();
    static int VARSTA_MAXIMA = 100;
    static int NR_MAX_CLIENTI = 30;
    static int NR_MAX_ID = 10;

    static Persoana getClient()
    {
        return new Persoana(rng.nextBoolean(), rng.nextBoolean(), rng.nextInt(VARSTA_MAXIMA)+1);
    }

    static List<Persoana> getClienti()
    {
        int nrClienti = rng.nextInt(NR_MAX_CLIENTI)+1;
        List<Persoana> clienti = new ArrayList<>(nrClienti);
        for (int i = 0; i < nrClienti; i++) {
            clienti.add(getClient());
        }
        return clienti;
    }
    public static void main(String[] args) {
        Operator operator = new Operator(RandomStringUtils.randomAlphanumeric(rng.nextInt(NR_MAX_ID)+1));
        List<Persoana> clienti = getClienti();
        System.out.println("-------------fara facade------------------");
        clienti.forEach(client ->
        {
            if(operator.areVarstaLegala(client.getVarsta()))
            {
                if(operator.eUrmaritDePolitie(client.isUrmaritPolitie()))
                {
                    if(operator.areCreanteLaAlteBanci(client.isCreanteBanci()))
                    {
                        System.out.println("Clientul a fost înregistrat în sistem.");
                    }
                    else
                    {
                        System.out.println("Clientul are creanțe la alte bănci. Nu ne poate fi client.");
                    }
                }
                else
                {
                    System.out.println("Clientul este urmărit de poliție, deci nu ne poate fi client.");
                }
            }
            else
            {
                System.out.println("Clientul nu are vârsta legală pentru a fi clientul nostru.");
            }
        });
        System.out.println("-------------cu facade------------------");
        clienti.forEach(operator::inscrieClient);
    }
}
