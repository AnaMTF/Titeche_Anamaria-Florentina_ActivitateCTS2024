package b.ex16.clase;

public class SMS extends Fidelizabil{
    private String nrTelefon;

    public SMS(String nrTelefon)
    {
        this.nrTelefon = nrTelefon;
    }
    @Override
    void trimite() {
        if(this.nrTelefon!=null)
        {
            System.out.printf("S-a trimis SMS la %s%n", this.nrTelefon);
        }
        else
        {
            super.succesor.trimite();
        }
    }
}
