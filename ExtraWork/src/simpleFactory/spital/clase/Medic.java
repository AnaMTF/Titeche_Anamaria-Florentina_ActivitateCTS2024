package simpleFactory.spital.clase;

public class Medic extends PersonalSpital {


    public Medic(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetaliiPersonal() {
        System.out.println("Angajatul are numele " + super.getNume() + " si salariul " + super.getSalariu());
    }
}
