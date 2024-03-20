package builder2;

public class Rezervare {
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaRacoritoare;
    private boolean muzicaAmbientala;
    private String genMuzica;

    public Rezervare(boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaRacoritoare, boolean muzicaAmbientala, String genMuzica) {
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaRacoritoare = bauturaRacoritoare;
        this.muzicaAmbientala = muzicaAmbientala;
        this.genMuzica = genMuzica;
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isBauturaRacoritoare() {
        return bauturaRacoritoare;
    }

    void setBauturaRacoritoare(boolean bauturaRacoritoare) {
        this.bauturaRacoritoare = bauturaRacoritoare;
    }

    public boolean isMuzicaAmbientala() {
        return muzicaAmbientala;
    }

    void setMuzicaAmbientala(boolean muzicaAmbientala) {
        this.muzicaAmbientala = muzicaAmbientala;
    }

    public String getGenMuzica() {
        return genMuzica;
    }

    void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        return "Rezervare{" +
                "mancareInclusa=" + mancareInclusa +
                ", scaunErgonomic=" + scaunErgonomic +
                ", bauturaRacoritoare=" + bauturaRacoritoare +
                ", muzicaAmbientala=" + muzicaAmbientala +
                ", genMuzica='" + genMuzica + '\'' +
                '}';
    }
}
