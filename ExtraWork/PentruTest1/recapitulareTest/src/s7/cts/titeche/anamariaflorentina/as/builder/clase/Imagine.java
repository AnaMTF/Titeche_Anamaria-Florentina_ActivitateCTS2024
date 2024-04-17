package s7.cts.titeche.anamariaflorentina.as.builder.clase;

import s7.cts.titeche.anamariaflorentina.as.builder.clase.ImagineVirtuala;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Imagine implements ImagineVirtuala{
    private String nume;
    private Map<String, Boolean> aplicatii;
    @Override
    public List<String> getAplicatiiInstalate() {
        List<String> listaAplicatii = new ArrayList<>();
        for(String aplicatie : this.aplicatii.keySet()){
            if(this.aplicatii.get(aplicatie)){
                listaAplicatii.add(aplicatie);
            }
        }
        return listaAplicatii;
    }

    public String getNume() {
        return nume;
    }

    @Override
    public void afiseazaDescriereImagineVirtuala() {
        System.out.println("Imaginea " + this.nume + " contine urmatoarele aplicatii: "+ this.getAplicatiiInstalate() );

    }

    @Override
    public void instaleazaAplicatie(String numeAplicatie) {
        this.aplicatii.put(numeAplicatie, true);
        System.out.println("Aplicatia " + numeAplicatie + " a fost instalata.");
    }

    public Imagine(String nume, Map<String, Boolean> aplicatii) {
        this.nume = nume;
        this.aplicatii = aplicatii;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAplicatii(Map<String, Boolean> aplicatii) {
        this.aplicatii = aplicatii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Imagine{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", aplicatii=").append(aplicatii);
        sb.append('}');
        return sb.toString();
    }
}
