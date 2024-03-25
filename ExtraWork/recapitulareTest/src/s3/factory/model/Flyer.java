package s3.factory.model;

public class Flyer implements ProdusMarketing{
    String numeClient;
    String domeniuActivitate;
    int latime;
    int inaltime;

    public Flyer(String numeClient, String domeniuActivitate, int latime, int inaltime) {
        this.numeClient = numeClient;
        this.domeniuActivitate = domeniuActivitate;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public String getNumeClient() {
        return numeClient;
    }

    @Override
    public String getDomeniuActivitate() {
        return domeniuActivitate;
    }

    @Override
    public int getLatime() {
        return latime;
    }

    @Override
    public int getInaltime() {
        return inaltime;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flyer{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", domeniuActivitate='").append(domeniuActivitate).append('\'');
        sb.append(", latime=").append(latime);
        sb.append(", inaltime=").append(inaltime);
        sb.append('}');
        return sb.toString();
    }
}
