package flyweight.main;

import flyweight.clase.Banca;
import flyweight.clase.Cont;

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca("BCR", 398274);
        Cont cont1 = new Cont(12, 123);
        Cont cont2 = new Cont(11, 123);
        Cont cont3 = new Cont(10, 123);
        Cont cont4 = new Cont(13, 123);
        banca.getClient("Gigel", "Bucuresti", "078912630").afiseazaInformatii(cont1);
        banca.getClient("Ionel", "Bucuresti", "078912632").afiseazaInformatii(cont1);
        banca.getClient("Ionel", "Sibiu", "078912631").afiseazaInformatii(cont2);
        banca.getClient("Gigel").afiseazaInformatii(cont3);
        banca.getClient("Gigel").afiseazaInformatii(cont4);
    }
}