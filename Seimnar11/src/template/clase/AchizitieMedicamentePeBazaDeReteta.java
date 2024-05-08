package template.clase;

public class AchizitieMedicamentePeBazaDeReteta extends Template{
    private String numeMedicament;

    public AchizitieMedicamentePeBazaDeReteta(String numeMedicament) {
        super();
        this.numeMedicament = numeMedicament;
    }

    @Override
    protected void primireReteta() {
        System.out.println("Am primit reteta pentru medicamentul " + numeMedicament);
    }

    @Override
    protected boolean verificareStoc() {
        return super.stocuri.containsKey(numeMedicament);
    }

    @Override
    protected void incasare() {
        System.out.println("Am incasat banii pentru medicamentul " + numeMedicament);
    }

    @Override
    protected void aducereMedicamente() {
        System.out.println("Medicamentul " + numeMedicament + " este adus din depozit");
        if (super.stocuri.get(numeMedicament)>1){
            super.stocuri.replace(numeMedicament, super.stocuri.get(numeMedicament) - 1);
        }else{
            super.stocuri.remove(numeMedicament);
        }
    }

    @Override
    protected void emitereBon() {
        System.out.println("A fost emis bonul pentru medicamentul " + numeMedicament);
    }

    @Override
    protected void respingeAchizitie() {
        System.out.println("Achizitia a fost respinsa pentru medicamentul " + numeMedicament);
    }
}
