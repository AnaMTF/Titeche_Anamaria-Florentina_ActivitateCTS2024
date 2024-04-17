package prototype.reclamaBanner.clase;

import java.util.ArrayList;
import java.util.List;

public class Banner implements IReclama, PrototipBanner{
    private String numeProdusPromovat;
    private int latime;
    private int inaltime;
    private List<String> orasePromovare = new ArrayList<>();

    public Banner(String numeProdusPromovat, int latime, int inaltime, List<String> orasePromovare) {
        if(numeProdusPromovat.length() == 0){
            throw new IllegalArgumentException("NUMELE E GOL");
        }
        this.numeProdusPromovat = numeProdusPromovat;
        this.latime = latime;
        this.inaltime = inaltime;
        this.orasePromovare = orasePromovare;
    }

    public void setOrasePromovare(List<String> orasePromovare) {
        this.orasePromovare = orasePromovare;
    }

    public Banner() {
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
    public List<String> getOrasePromovare() {
        return this.orasePromovare;
    }

    @Override
    public PrototipBanner copiaza() {
        Banner banner = new Banner();
        banner.inaltime = this.inaltime;
        banner.latime = this.latime;
        banner.numeProdusPromovat = this.numeProdusPromovat;
        List<String> orasePromovareTemp = new ArrayList<String>();
        for (String oras : this.orasePromovare){
            orasePromovareTemp.add(oras);
        }
        banner.setOrasePromovare(orasePromovareTemp);
        return banner;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Banner{");
        sb.append("numeProdusPromovat='").append(numeProdusPromovat).append('\'');
        sb.append(", latime=").append(latime);
        sb.append(", inaltime=").append(inaltime);
        sb.append(", orasePromovare=").append(orasePromovare);
        sb.append('}');
        return sb.toString();
    }
}
