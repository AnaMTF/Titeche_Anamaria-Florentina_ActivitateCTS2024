package f.ex13.clase;

public class Autobuz {
    private String sofer;
    private float consum;
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(int nrLocuri, String model, int anFabricatie) {
        this.nrLocuri = nrLocuri;
        this.model = model;
        this.anFabricatie = anFabricatie;
    }

    public void setSofer(String sofer) {
        this.sofer = sofer;
    }

    public void setConsum(float consum) {
        this.consum = consum;
    }

    static class Memento
    {
        private final String sofer;
        private final float consum;

        public Memento(float consum, String sofer) {
            this.consum = consum;
            this.sofer = sofer;
        }

        @Override
        public String toString() {
            final StringBuffer sb = new StringBuffer("Memento{");
            sb.append("consum=").append(consum);
            sb.append(", sofer='").append(sofer).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    public Memento creeazaMemento()
    {
        return new Memento(this.consum, this.sofer);
    }

    public void restaureazaMemento(Memento memento)
    {
        this.sofer = memento.sofer;
        this.consum = memento.consum;
    }
}
