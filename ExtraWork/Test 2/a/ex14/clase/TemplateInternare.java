package a.ex14.clase;

public abstract class TemplateInternare {
    public final void internare(Pacient pacient)
    {
        analizaSanatate(pacient);
        if(disponibilitatePaturi()>0)
        {
            emitereFisa(pacient);
        }
        else
        {
            refuzaInternare(pacient);
        }
    }

    abstract void analizaSanatate(Pacient pacient);
    abstract int disponibilitatePaturi();
    abstract void emitereFisa(Pacient pacient);
    abstract void refuzaInternare(Pacient pacient);
}
