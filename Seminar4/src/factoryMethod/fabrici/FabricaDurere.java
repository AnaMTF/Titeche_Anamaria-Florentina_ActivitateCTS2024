package factoryMethod.fabrici;

import factoryMethod.clase.Durere;
import factoryMethod.clase.Medicament;

public class FabricaDurere extends FabricaMedicamente{
    public FabricaDurere(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Durere(super.getNume(), super.getPret());
    }
}
