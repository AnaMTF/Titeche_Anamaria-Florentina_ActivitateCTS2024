package a.ex9.clase;

public class Proxy implements Internabil{
    private Internabil spital;

    public Proxy(Internabil spital) {
        this.spital = spital;
    }

    @Override
    public void interneaza(Pacient pacient) {
        Spital s = (Spital) spital;
        if(pacient.isAreAsigurare())
        {
            System.out.printf("Nu se poate interna pacientul %s în spital deoarece nu are asigurare de sănătate!%n", pacient.getNume());
        }
        else {
            s.interneaza(pacient);
        }
    }
}
