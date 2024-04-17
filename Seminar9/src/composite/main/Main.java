package composite.main;

import composite.clase.Agentie;
import composite.clase.Filiala;
import composite.clase.Sediu;
import composite.clase.Sucursala;

public class Main {
    public static void main(String[] args) {
        Sediu agentieMama = new Agentie("Banca", 10);
        Sediu sucursalaBucuresti = new Sucursala("Banca Bucuresti", 5);
        Sediu agentieFiica = new Agentie("BancaS4", 100);
        Sediu agentieFiu = new Agentie("BancaS3", 200);
        Sediu filialaFiuFiica = new Filiala("Gradistei", 15);
        Sediu filialaFiicaFiica = new Filiala("Progresul", 40);
        Sediu filialaFiicaFiu = new Filiala("Matei Basarab", 25);

        agentieMama.adauga(agentieFiu);
        agentieMama.adauga(agentieFiica);
        agentieFiica.adauga(filialaFiicaFiica);
        agentieFiica.adauga(filialaFiicaFiu);
        agentieFiu.adauga(sucursalaBucuresti);
        sucursalaBucuresti.adauga(filialaFiuFiica);

        agentieMama.afisare("");

        System.out.printf("Numărul total de angajați din %s este %d.", ((Agentie)agentieMama).getNume(), agentieMama.numaraAngajati());
    }
}