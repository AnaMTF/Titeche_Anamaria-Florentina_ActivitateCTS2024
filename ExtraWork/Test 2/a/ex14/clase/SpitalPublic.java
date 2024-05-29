package a.ex14.clase;

public class SpitalPublic extends TemplateInternare {
    private String numeSpital;
    private int nrPaturiLibere;

    public SpitalPublic(String numeSpital, int nrPaturiLibere)
    {
        this.numeSpital = numeSpital;
        this.nrPaturiLibere = nrPaturiLibere;
    }
    @Override
    void analizaSanatate(Pacient pacient) {
        pacient.setStareSanatate((pacient.getNume().length()%5)+1);
        System.out.printf("Pacientul %s are starea %d.%n", pacient.getNume(), pacient.getStareSanatate());
    }

    @Override
    int disponibilitatePaturi() {
        return this.nrPaturiLibere;
    }

    @Override
    void emitereFisa(Pacient pacient) {
        this.nrPaturiLibere--;
        System.out.printf("Pacientului %s i s-a emis fisa.%n", pacient.getNume());
    }

    @Override
    void refuzaInternare(Pacient pacient) {
        System.out.printf("Pacientul %s este trimis către un alt spital deoarece spitalul %s nu are locuri.%n", pacient.getNume(), this.numeSpital);
    }
}
