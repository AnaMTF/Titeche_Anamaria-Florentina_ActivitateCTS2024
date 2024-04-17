package simpleFactory.clase;

public class Asistent extends PersonalSpital{
    public Asistent(String nume, float salariu) {
        super(nume, salariu);
    }

    @Override
    public void afisareDetaliiPersonal() {
        System.out.println("Angajatul are numele " + super.getNume() + " si salariul " + super.getSalariu());
    }
}
