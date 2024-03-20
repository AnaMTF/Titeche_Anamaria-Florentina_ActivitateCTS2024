package builder1;

public class Rezervare {
    private boolean areMancare;
    private boolean areScaunErgonomic;
    private boolean areBautura;
    private boolean areMuzica;
    private String genMuzical;

    public Rezervare(boolean areMancare, boolean areScaunErgonomic, boolean areBautura, boolean areMuzica, String genMuzical) {
        this.areMancare = areMancare;
        this.areScaunErgonomic = areScaunErgonomic;
        this.areBautura = areBautura;
        this.areMuzica = areMuzica;
        this.genMuzical = genMuzical;
    }

    protected boolean isAreMancare() {
        return areMancare;
    }

    protected void setAreMancare(boolean areMancare) {
        this.areMancare = areMancare;
    }

    protected boolean isAreScaunErgonomic() {
        return areScaunErgonomic;
    }

    protected void setAreScaunErgonomic(boolean areScaunErgonomic) {
        this.areScaunErgonomic = areScaunErgonomic;
    }

    protected boolean isAreBautura() {
        return areBautura;
    }

    protected void setAreBautura(boolean areBautura) {
        this.areBautura = areBautura;
    }

    protected boolean isAreMuzica() {
        return areMuzica;
    }

    protected void setAreMuzica(boolean areMuzica) {
        this.areMuzica = areMuzica;
    }

    protected String getGenMuzical() {
        return genMuzical;
    }

    protected void setGenMuzical(String genMuzical) {
        this.genMuzical = genMuzical;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "areMancare=" + areMancare +
                ", areScaunErgonomic=" + areScaunErgonomic +
                ", areBautura=" + areBautura +
                ", areMuzica=" + areMuzica +
                ", genMuzical='" + genMuzical + '\'' +
                '}';
    }
}
