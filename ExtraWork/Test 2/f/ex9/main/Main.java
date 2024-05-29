package f.ex9.main;

import f.ex9.clase.Autobuz;
import f.ex9.clase.Flyweight;
import f.ex9.clase.Linie;
import f.ex9.clase.STB;

public class Main {
    public static void main(String[] args) {
        Flyweight linia1 = new Linie(102, "C.F.R. Progresul", "Complex Comercial Pantelimon");
        Flyweight linia2 = new Linie(220, "Piata Rahova", "Vulcan Berceni");
        Flyweight linia3 = new Linie(116, "C.F.R. Progresul", "Piața Unirii");

        Autobuz autobuz1 = new Autobuz(2014, "Citaro", 58);
        Autobuz autobuz2 = new Autobuz(2017, "Otokar", 54);

        STB stb = new STB();
        stb.getLinie(((Linie)linia1).getNrLinie(), ((Linie)linia1).getPrimaStatie(), ((Linie)linia1).getUltimaStatie()).afiseaza(autobuz1);
        stb.getLinie(((Linie)linia2).getNrLinie(), ((Linie)linia2).getPrimaStatie(), ((Linie)linia2).getUltimaStatie()).afiseaza(autobuz1);
        stb.getLinie(((Linie)linia3).getNrLinie(), ((Linie)linia3).getPrimaStatie(), ((Linie)linia3).getUltimaStatie()).afiseaza(autobuz1);
        stb.getLinie(((Linie)linia1).getNrLinie()).afiseaza(autobuz2);
        stb.getLinie(((Linie)linia2).getNrLinie()).afiseaza(autobuz2);
    }
}
