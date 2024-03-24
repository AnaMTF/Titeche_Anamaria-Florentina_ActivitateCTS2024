package factoryMethod.spital.fabrici;

import factoryMethod.spital.clase.Medic;
import factoryMethod.spital.clase.Personal;

public class FactoryMedic extends AbstractFactoryPersonalSpital{
    public FactoryMedic(String numePersonal, int aniExperienta) {
        super(numePersonal, aniExperienta);
    }

    @Override
    public Personal crearePersonal() {
        return new Medic(super.getNumePersonal(), super.getAniExperienta());
    }
}
