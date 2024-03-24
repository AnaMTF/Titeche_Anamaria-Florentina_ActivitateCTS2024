package factoryMethod.spital.clase;

public class Medic extends Personal{
    public Medic(String nume, int aniExperienta) {
        super(nume, aniExperienta);
    }

    @Override
    public void afisareDetaliiPersonal() {
        System.out.println("Numele personalului este " + super.getNume() + "si are " + super.getAniExperienta() + " ani de experienta.");
    }
}
