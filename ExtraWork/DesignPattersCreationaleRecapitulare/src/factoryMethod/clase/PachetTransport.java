package factoryMethod.clase;

public class PachetTransport implements PachetGeneric{
     private String numePachet;
    private float pretPachet;

    public PachetTransport(String numePachet, float pretPachet) {
        this.numePachet = numePachet;
        this.pretPachet = pretPachet;
    }

    @Override
    public float getPret() {
        return pretPachet;
    }

    @Override
    public void afiseazaDecrierePachet() {
        System.out.println("Pachetul TRANSPORT " + this.numePachet + " are pretul de" + this.pretPachet + " RON");
    }

    @Override
    public String getNumePachet() {
        return this.numePachet;
    }

    @Override
    public void crestePret(float pret) {
        float pretInitial = this.pretPachet;
        this.pretPachet += pret;
        System.out.println("Pretul pachetului " + this.numePachet + " a crescut de la " + pretInitial + " la " + this.pretPachet);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PachetTuristic{");
        sb.append("numePachet='").append(numePachet).append('\'');
        sb.append(", pretPachet=").append(pretPachet);
        sb.append('}');
        return sb.toString();
    }
}
