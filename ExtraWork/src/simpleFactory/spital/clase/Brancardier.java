package simpleFactory.spital.clase;

public class Brancardier extends PersonalSpital{
    public Brancardier(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetaliiPersonal() {
        System.out.println("Angajatul are numele " + super.getNume() + " si salariul " + super.getSalariu());
    }
}
