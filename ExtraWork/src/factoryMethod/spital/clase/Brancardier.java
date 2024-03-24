package factoryMethod.spital.clase;

public class Brancardier extends Personal{
    public Brancardier(String nume, int aniExperienta) {
        super(nume, aniExperienta);
    }

    @Override
    public void afisareDetaliiPersonal() {
        System.out.println("Numele personalului este " + super.getNume() + "si are " + super.getAniExperienta() + " ani de experienta.");
    }
}
