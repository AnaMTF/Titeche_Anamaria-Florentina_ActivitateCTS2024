package builder.imagine.clase;

import java.util.List;

public class Imagine implements ImagineVirtuala{
    private  boolean areContPremium;
    private  boolean areExtensie;
    private List<String> aplicatiiInstalate;

    public boolean isAreContPremium() {
        return areContPremium;
    }

    public void setAreContPremium(boolean areContPremium) {
        this.areContPremium = areContPremium;
    }

    public boolean isAreExtensie() {
        return areExtensie;
    }

    public void setAreExtensie(boolean areExtensie) {
        this.areExtensie = areExtensie;
    }

    @Override
    public boolean getAreContPremium() {
        return areContPremium;
    }

    @Override
    public boolean getAreExtensie() {
        return areExtensie;
    }

    @Override
    public List<String> getAplicatiiInstalate() {
        return this.aplicatiiInstalate;
    }

    public void setAplicatiiInstalate(List<String> aplicatiiInstalate) {
        this.aplicatiiInstalate = aplicatiiInstalate;
    }

    @Override
    public void afiseazaDescriereImagineVirtuala() {
        System.out.println("aplicatiile instalate sunt " + this.aplicatiiInstalate);
    }

    @Override
    public void instaleazaAplicatie(String numeAplicatie) {
        aplicatiiInstalate.add(numeAplicatie);
    }

    public Imagine(boolean areContPremium, boolean areExtensie, List<String> aplicatiiInstalate) {
        this.areContPremium = areContPremium;
        this.areExtensie = areExtensie;
        this.aplicatiiInstalate = aplicatiiInstalate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imagine{");
        sb.append("areContPremium=").append(areContPremium);
        sb.append(", areExtensie=").append(areExtensie);
        sb.append(", aplicatiiInstalate=").append(aplicatiiInstalate);
        sb.append('}');
        return sb.toString();
    }
}
