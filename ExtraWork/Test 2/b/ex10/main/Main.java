package b.ex10.main;

import b.ex10.clase.Client;
import b.ex10.clase.Flyweight;
import b.ex10.clase.Restaurant;
import b.ex10.clase.Rezervare;
import org.apache.commons.lang3.RandomStringUtils;

import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    static int NR_MAX_MASA = 100;
    static int NR_MAX_PERSOANE = 10;
    static int NR_MAX_CARACTERE_ADRESA = 100;
    static int NR_MAX_NR_DE_TELEFON = 10;
    public static void main(String[] args) {
        Random random = new Random();
        Restaurant restaurant = new Restaurant();

        Flyweight client1 = new Client(RandomStringUtils.randomAlphabetic(NR_MAX_CARACTERE_ADRESA), "+"+RandomStringUtils.randomNumeric(NR_MAX_NR_DE_TELEFON), "Ana");
        Flyweight client2 = new Client(RandomStringUtils.randomAlphabetic(NR_MAX_CARACTERE_ADRESA), "+"+RandomStringUtils.randomNumeric(NR_MAX_NR_DE_TELEFON), "Andrei");
        Flyweight client3 = new Client(RandomStringUtils.randomAlphabetic(NR_MAX_CARACTERE_ADRESA), "+"+RandomStringUtils.randomNumeric(NR_MAX_NR_DE_TELEFON), "Mircea");

        restaurant.addClient(client1);
        restaurant.addClient(client1);
        restaurant.addClient(client1);
        restaurant.addClient(client2);
        restaurant.addClient(client3);

        Rezervare rezervare1 = new Rezervare(random.nextInt(NR_MAX_MASA), random.nextInt(NR_MAX_PERSOANE), LocalDateTime.now());
        Rezervare rezervare2 = new Rezervare(random.nextInt(NR_MAX_MASA), random.nextInt(NR_MAX_PERSOANE), LocalDateTime.now());
        Rezervare rezervare3 = new Rezervare(random.nextInt(NR_MAX_MASA), random.nextInt(NR_MAX_PERSOANE), LocalDateTime.now());

        restaurant.getClient("Ana").afiseazaRezervare(rezervare1);
        restaurant.getClient("Ana").afiseazaRezervare(rezervare2);
        restaurant.getClient("Ana").afiseazaRezervare(rezervare3);
        restaurant.getClient("Mircea").afiseazaRezervare(rezervare3);
        restaurant.getClient("Andrei").afiseazaRezervare(rezervare1);
        restaurant.getClient("Andrei").afiseazaRezervare(rezervare2);
    }
}
