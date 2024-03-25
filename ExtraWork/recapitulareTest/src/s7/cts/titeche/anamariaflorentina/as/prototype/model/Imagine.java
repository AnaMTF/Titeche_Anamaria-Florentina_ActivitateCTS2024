package s7.cts.titeche.anamariaflorentina.as.prototype.model;

import java.util.ArrayList;
import java.util.List;

public class Imagine implements ImagineVirtuala, Cloneable{
    String descriereAplicatie;
    List<String> aplicatiiInstalate = new ArrayList<>();

    public Imagine(String numeAplicatie, List<String> aplicatiiInstalate) {
        this.descriereAplicatie = numeAplicatie;
        this.aplicatiiInstalate = aplicatiiInstalate;
    }

    public Imagine(){
        this.descriereAplicatie = "N/A";
        this.aplicatiiInstalate = new ArrayList<>();
    }

    @Override
    public List<String> getAplicatiiInstalate() {
        return this.aplicatiiInstalate;
    }

    @Override
    public void afiseazaDescriereImagineVirtuala() {
        System.out.println("Numele aplicatiei este: " + this.descriereAplicatie);
    }

    @Override
    public void instaleazaAplicatie(String numeAplicatie) {
        this.aplicatiiInstalate.add(numeAplicatie);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imagine{");
        sb.append("descreireAplicatie='").append(descriereAplicatie).append('\'');
        sb.append(", aplicatiiInstalate=").append(aplicatiiInstalate);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ImagineVirtuala clone() throws CloneNotSupportedException {
        ImagineVirtuala clonaAplicatie = new Imagine();
        for (String element : aplicatiiInstalate){
            clonaAplicatie.instaleazaAplicatie(element);
        }
        ((Imagine) clonaAplicatie).descriereAplicatie = this.descriereAplicatie;
        return clonaAplicatie;
    }
}
