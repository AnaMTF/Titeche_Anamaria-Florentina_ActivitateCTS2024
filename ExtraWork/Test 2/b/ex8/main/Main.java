package b.ex8.main;

import b.ex8.clase.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Sectiune s1 = new SectiuneMeniu("Starters");
        Sectiune s2 = new SectiuneMeniu("Băuturi");
        Sectiune s3 = new SectiuneMeniu("Desert");

        Sectiune ss1 = new Subsectiune("Sucuri");
        Sectiune ss2 = new Subsectiune("Cafea");
        Sectiune ss3 = new Subsectiune("Spirtoase");
        Sectiune ss4 = new Subsectiune("Prăjituri");

        Sectiune p1 = new Produs("Coca-Cola");
        Sectiune p2 = new Produs("Fanta");
        Sectiune p3 = new Produs("Nescafe");
        Sectiune p4 = new Produs("Aperol");
        Sectiune p5 = new Produs("Savarină");
        Sectiune p6 = new Produs("Papanași");

        ss1.adauga(p1, p2);
        ss2.adauga(p3);
        ss3.adauga(p4);
        ss4.adauga(p5, p6);

        s1.adauga(ss3);
        s2.adauga(ss1, ss2);
        s3.adauga(ss4);

        List<Sectiune> meniu = List.of(s1, s2, s3);
        meniu.forEach(sectiune -> sectiune.afisare(""));
    }
}
