package factoryMethod.fabrici;

import factoryMethod.clase.Asistent;
import factoryMethod.clase.Personal;

public class FactoryAsistent extends AbstractFactoryPersonalSpital{
    public FactoryAsistent(String numePersonal, int aniExperienta) {
        super(numePersonal, aniExperienta);
    }

    @Override
    public Personal crearePersonal() {
        return new Asistent(super.getNumePersonal(),super.getAniExperienta());
    }
}
