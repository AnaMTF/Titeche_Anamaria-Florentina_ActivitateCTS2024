package builder1.main;

import builder1.AbstractBuilder;
import builder1.Rezervare;
import builder1.RezervareBuilder;

public class Main {
    public static void main(String[] args) {
        RezervareBuilder rezervareBuilder = new RezervareBuilder();
        Rezervare rezervare = rezervareBuilder.adaugaMancare(true).adaugaBautura(true).build();
        Rezervare rezervare2 = rezervareBuilder.adaugaMuzica(true).adaugaGenMuzical("rock").build();
        System.out.println(rezervare);
        System.out.println(rezervare2);
    }
}
