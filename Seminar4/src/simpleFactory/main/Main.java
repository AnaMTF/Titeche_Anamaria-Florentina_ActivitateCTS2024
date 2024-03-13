package simpleFactory.main;

import simpleFactory.clase.Medicament;
import simpleFactory.clase.TipMedicament;
import simpleFactory.clase.factory.MedicamentFactory;

public class Main {
    public static void main(String[] args) {
        MedicamentFactory medicamentFactory = new MedicamentFactory();

        try {
            Medicament medicamentGripa = MedicamentFactory.createMedicament(TipMedicament.GRIPA, "Aspirina", 20, 30);
            Medicament medicamentDurere = MedicamentFactory.createMedicament(TipMedicament.DURERE, "Nurofen", 10, 30);
            Medicament medicamentRaceala = MedicamentFactory.createMedicament(TipMedicament.RACEALA, "Paracetamol", 5, 30);
            Medicament medicamentBody = MedicamentFactory.createMedicament(TipMedicament.BODY, "Nivea", 15, 21);
            medicamentBody.afisareDetalii();
            medicamentDurere.afisareDetalii();
            medicamentRaceala.afisareDetalii();
            medicamentGripa.afisareDetalii();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}