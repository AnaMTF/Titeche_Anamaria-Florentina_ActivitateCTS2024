package factoryMethod.fabrici;

import factoryMethod.clase.Medicament;
import factoryMethod.clase.Raceala;

public class FabricaRaceala extends FabricaMedicamente {
    private int stoc;

    public FabricaRaceala(String nume, float pret, int stoc) {
        super(nume, pret);
        this.stoc = stoc;
    }

    @Override
    public Medicament creareMedicament() {
        return new Raceala(super.getNume(), super.getPret(), this.stoc);
    }
}
