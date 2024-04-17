package s3.factory.model;

public class Sticker implements ProdusMarketing{
    private String numeClient;
    private String domeniuActivitate;
    private int latime;
    private int inaltime;

    public Sticker(String numeClient, String domeniuActivitate, int latime, int inaltime) {
        this.numeClient = numeClient;
        this.domeniuActivitate = domeniuActivitate;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public String getNumeClient() {
        return this.numeClient;
    }

    @Override
    public String getDomeniuActivitate() {
        return this.domeniuActivitate;
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
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sticker{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", domeniuActivitate='").append(domeniuActivitate).append('\'');
        sb.append(", latime=").append(latime);
        sb.append(", inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }
}
