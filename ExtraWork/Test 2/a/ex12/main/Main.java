package a.ex12.main;

import a.ex12.clase.CoronaVirus;
import a.ex12.clase.Observer;
import a.ex12.clase.Pacient;
import a.ex12.clase.Subiect;

public class Main {
    public static void main(String[] args) {
        Observer pacient1 = new Pacient("Gigi");
        Observer pacient2 = new Pacient("Andrei");
        Observer pacient3 = new Pacient("Maria");
        Subiect corona = new CoronaVirus();

        corona.abonareListaVirusi(pacient1);
        corona.abonareListaVirusi(pacient2);
        corona.abonareListaVirusi(pacient3);

        corona.anuntaVirus("Sălăjan");

        corona.dezabonareListaVirusi(pacient2);

        corona.anuntaVirus("Balta Albă");
    }
}
