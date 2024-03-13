package simpleFactory.clase.factory;

import simpleFactory.clase.TipMedicament;
import simpleFactory.clase.*;


public class MedicamentFactory {
    public static Medicament createMedicament(TipMedicament tipMedicament, String nume, float pret, int valabilitate) throws Exception {
        switch (tipMedicament) {
            case BODY:
                return new Body(nume, pret, valabilitate);
            case RACEALA:
                return new Raceala(nume, pret, valabilitate);
            case DURERE:
                return new Durere(nume, pret, valabilitate);
            case GRIPA:
                return new Gripa(nume, pret, valabilitate);
            default:
                throw new Exception("Tipul nu este corect");
        }
    }
}
