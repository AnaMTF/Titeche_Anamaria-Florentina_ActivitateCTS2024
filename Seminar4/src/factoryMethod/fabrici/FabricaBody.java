package factoryMethod.fabrici;

import factoryMethod.clase.Body;
import factoryMethod.clase.Medicament;

public class FabricaBody extends FabricaMedicamente{
    public FabricaBody(String nume, float pret) {
        super(nume, pret);
    }

    @Override
    public Medicament creareMedicament() {
        return new Body(super.getNume(), super.getPret());
    }
}
