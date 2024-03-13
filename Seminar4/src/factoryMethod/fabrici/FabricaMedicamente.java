package factoryMethod.fabrici;

import factoryMethod.clase.Medicament;

public abstract class FabricaMedicamente {

    private String nume;
    private float pret;

    public FabricaMedicamente(String nume, float pret) {
        this.nume = nume;
        this.pret = pret;

    }

    public String getNume() {
        return nume;
    }

    public float getPret() {
        return pret;
    }



    public abstract Medicament creareMedicament();
}
