package factoryMethod.spital.main;

import factoryMethod.spital.clase.Asistent;
import factoryMethod.spital.clase.Personal;
import factoryMethod.spital.fabrici.AbstractFactoryPersonalSpital;
import factoryMethod.spital.fabrici.FactoryAsistent;
import factoryMethod.spital.fabrici.FactoryBrancardier;
import factoryMethod.spital.fabrici.FactoryMedic;

public class Main {
    public static void main(String[] args) {
        AbstractFactoryPersonalSpital factoryAsistent = new FactoryAsistent("Ana", 22);
        AbstractFactoryPersonalSpital factoryBrancardier = new FactoryBrancardier("Mara", 9);
        AbstractFactoryPersonalSpital factoryMedic = new FactoryMedic("Andrei", 40);

        Personal asistent1 = factoryAsistent.crearePersonal();
        Personal brancardier1 = factoryBrancardier.crearePersonal();
        Personal medic1 = factoryMedic.crearePersonal();

        asistent1.afisareDetaliiPersonal();
        brancardier1.afisareDetaliiPersonal();
        medic1.afisareDetaliiPersonal();
    }
}
