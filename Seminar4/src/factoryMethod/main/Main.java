package factoryMethod.main;

import factoryMethod.clase.Medicament;
import factoryMethod.fabrici.FabricaDurere;
import factoryMethod.fabrici.*;

public class Main {

    public static void procesareMedicament(FabricaMedicamente fabricaMedicamente){
        Medicament medicament = fabricaMedicamente.creareMedicament();
        medicament.afisareDetaliiMedicament();
    }
    public static void main(String[] args) {
        FabricaMedicamente fabricaDurere = new FabricaDurere("Nivea", 10);
        FabricaMedicamente fabricaBody = new FabricaBody("Antinevralgic", 20);
        FabricaMedicamente fabricaRaceala = new FabricaRaceala("Paracetamol", 30, 100);

        Medicament medicamentBody = fabricaBody.creareMedicament();
        Medicament medicamentDurere = fabricaDurere.creareMedicament();
        Medicament medicamentRaceala = fabricaRaceala.creareMedicament();

        medicamentDurere.afisareDetaliiMedicament();
        medicamentRaceala.afisareDetaliiMedicament();
        medicamentBody.afisareDetaliiMedicament();

        procesareMedicament(fabricaDurere);

        procesareMedicament(new FabricaGripa( "Gripoviral", 15.5f));

    }
}
