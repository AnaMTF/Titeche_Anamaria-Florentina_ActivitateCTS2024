package e.ex12.clase;

public class Meci extends Subiect{
    private String tip;

    public Meci(String tip) {
        this.tip = tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    @Override
    public void trimite() {
        super.notifica(this.tip);
    }
}
