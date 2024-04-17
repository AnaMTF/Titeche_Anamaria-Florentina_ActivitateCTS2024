package factoryMethod.fabrici;

import factoryMethod.clase.Personal;

public abstract class AbstractFactoryPersonalSpital {
    String numePersonal;
    int aniExperienta;

    public AbstractFactoryPersonalSpital(String numePersonal, int aniExperienta) {
        this.numePersonal = numePersonal;
        this.aniExperienta = aniExperienta;
    }

    public String getNumePersonal() {
        return numePersonal;
    }

    public int getAniExperienta() {
        return aniExperienta;
    }

    public abstract Personal crearePersonal();
}
