package s7.cts.titeche.anamariaflorentina.as.builder.main;

import s7.cts.titeche.anamariaflorentina.as.builder.clase.Imagine;
import s7.cts.titeche.anamariaflorentina.as.builder.clase.ImagineBuilder;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Boolean> mapAplicatii = new HashMap<>();
        mapAplicatii.put("Aplicatie1", true);
        mapAplicatii.put("Aplicatie2", false);
        mapAplicatii.put("Aplicatie3", false);
        mapAplicatii.put("Aplicatie4", false);
        mapAplicatii.put("Aplicatie5", false);

        ImagineBuilder imagineBuilder = new ImagineBuilder();
        Imagine imagine = imagineBuilder.setNume("Imagine1").setAplicatii(mapAplicatii).build();
        imagine.afiseazaDescriereImagineVirtuala();
        imagine.instaleazaAplicatie("Aplicatie2");
        imagine.afiseazaDescriereImagineVirtuala();
    }
}
