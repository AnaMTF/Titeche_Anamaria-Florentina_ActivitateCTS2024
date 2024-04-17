package flyweight.clase;

public class Cont {
    private int nrCont;
    private float sold;

    public Cont(int nrCont, float sold) {
        this.nrCont = nrCont;
        this.sold = sold;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cont{");
        sb.append("nrCont='").append(nrCont).append('\'');
        sb.append(", sold=").append(sold);
        sb.append('}');
        return sb.toString();
    }
}