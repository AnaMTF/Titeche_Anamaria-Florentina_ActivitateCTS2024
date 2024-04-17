package factoryMethod.fabrici;

import factoryMethod.clase.Medic;
import factoryMethod.clase.Personal;

public class FactoryMedic extends AbstractFactoryPersonalSpital{
    public FactoryMedic(String numePersonal, int aniExperienta) {
        super(numePersonal, aniExperienta);
    }

    @Override
    public Personal crearePersonal() {
        return new Medic(super.getNumePersonal(), super.getAniExperienta());
    }
}
