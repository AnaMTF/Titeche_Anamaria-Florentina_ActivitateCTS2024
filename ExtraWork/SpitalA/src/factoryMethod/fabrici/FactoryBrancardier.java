package factoryMethod.fabrici;

import factoryMethod.clase.Brancardier;
import factoryMethod.clase.Personal;

public class FactoryBrancardier extends AbstractFactoryPersonalSpital{
    public FactoryBrancardier(String numePersonal, int aniExperienta) {
        super(numePersonal, aniExperienta);
    }

    @Override
    public Personal crearePersonal() {
        return new Brancardier(super.getNumePersonal(),super.getAniExperienta());
    }
}
