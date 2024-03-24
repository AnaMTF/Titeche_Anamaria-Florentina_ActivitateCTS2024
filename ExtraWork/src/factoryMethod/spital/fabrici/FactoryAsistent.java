package factoryMethod.spital.fabrici;

import factoryMethod.spital.clase.Asistent;
import factoryMethod.spital.clase.Personal;

public class FactoryAsistent extends AbstractFactoryPersonalSpital{
    public FactoryAsistent(String numePersonal, int aniExperienta) {
        super(numePersonal, aniExperienta);
    }

    @Override
    public Personal crearePersonal() {
        return new Asistent(super.getNumePersonal(),super.getAniExperienta());
    }
}
