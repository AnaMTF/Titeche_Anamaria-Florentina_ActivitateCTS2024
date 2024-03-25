package s4.prototype.clase;

public class Banner implements IReclama, IAbstractBanner{
    private String numeProdusPromovat;
    private String orasPromovare;
    private int latime;
    private int inaltime;

    public Banner(String numeProdusPromovat, String orasPromovare, int latime, int inaltime) {
        this.numeProdusPromovat = numeProdusPromovat;
        this.orasPromovare = orasPromovare;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public String getNumeProdusPromovat() {
        return this.numeProdusPromovat;
    }

    @Override
    public int getLatime() {
        return this.latime;
    }

    @Override
    public int getInaltime() {
        return this.inaltime;
    }

    @Override
    public String getOrasPromovare() {
        return this.orasPromovare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banner{");
        sb.append("numeProdusPromovat='").append(numeProdusPromovat).append('\'');
        sb.append(", orasPromovare='").append(orasPromovare).append('\'');
        sb.append(", latime=").append(latime);
        sb.append(", inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IAbstractBanner copiaza() {
        return new Banner(this.numeProdusPromovat, this.orasPromovare, this.latime, this.inaltime);
    }
}
