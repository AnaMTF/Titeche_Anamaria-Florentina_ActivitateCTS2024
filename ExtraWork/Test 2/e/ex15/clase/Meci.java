package e.ex15.clase;

import java.util.Date;

public class Meci {
    private Date data;
    private String echipaGazda;
    private String echipaMusafiri;
    private int nrSpectatori;

    public void seteazaDetalii(Date data, String echipaGazda, String echipaMusafiri, int nrSpectatori) {
        this.data = data;
        this.echipaGazda = echipaGazda;
        this.echipaMusafiri = echipaMusafiri;
        this.nrSpectatori = nrSpectatori;
    }

    public Memento creeazaMemento()
    {
        return new Memento(this.data, this.echipaGazda, this.echipaMusafiri, this.nrSpectatori);
    }

    public void restaureazaMemento(Memento memento)
    {
        this.data = memento.data;
        this.echipaGazda = memento.echipaGazda;
        this.echipaMusafiri = memento.echipaMusafiri;
        this.nrSpectatori = memento.nrSpectatori;
    }

    public static class Memento
    {
        private final Date data;
        private final String echipaGazda;
        private final String echipaMusafiri;
        private final int nrSpectatori;

        public Memento(Date data, String echipaGazda, String echipaMusafiri, int nrSpectatori) {
            this.data = data;
            this.echipaGazda = echipaGazda;
            this.echipaMusafiri = echipaMusafiri;
            this.nrSpectatori = nrSpectatori;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Memento{");
            sb.append("data=").append(data);
            sb.append(", echipaGazda='").append(echipaGazda).append('\'');
            sb.append(", echipaMusafiri='").append(echipaMusafiri).append('\'');
            sb.append(", nrSpectatori=").append(nrSpectatori);
            sb.append('}');
            return sb.toString();
        }
    }
}
