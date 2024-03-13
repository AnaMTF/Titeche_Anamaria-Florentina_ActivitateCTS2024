package factoryMethod.fabrici;

import factoryMethod.clase.Gripa;
import factoryMethod.clase.Medicament;

public class FabricaGripa extends FabricaMedicamente{
    public FabricaGripa(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Gripa(super.getNume(), super.getPret());
    }
}
