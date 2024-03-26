package singletonRegistry.clase;

public class Pachet implements PachetTuristic{
    private String numePachet;
    private String tipPachet;
    private float pret;

    public Pachet(String numePachet, String tipPachet, float pret) {
        this.numePachet = numePachet;
        this.tipPachet = tipPachet;
        this.pret = pret;
    }

    @Override
    public float getPret() {
        return this.pret;
    }

    @Override
    public String getNumePachet() {
        return this.numePachet;
    }

    @Override
    public String getTipPachet() {
        return this.tipPachet;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("numePachet='").append(numePachet).append('\'');
        sb.append(", tipPachet='").append(tipPachet).append('\'');
        sb.append(", pret=").append(pret);
        sb.append('}');
        return sb.toString();
    }
}
