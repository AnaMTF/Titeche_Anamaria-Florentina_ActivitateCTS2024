package factoryMethod.clase;

public class Asistent extends Personal{
    public Asistent(String nume, int aniExperienta) {
        super(nume, aniExperienta);
    }

    @Override
    public void afisareDetaliiPersonal() {
        System.out.println("Numele personalului este " + super.getNume() + "si are " + super.getAniExperienta() + " ani de experienta.");
    }
}
