package builder.imagine.main;

import builder.imagine.clase.Imagine;
import builder.imagine.clase.ImagineBuilder;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaAplicatii = new ArrayList<>();
        listaAplicatii.add("Instagram");
        listaAplicatii.add("Youtube");
        listaAplicatii.add("TikTok");
        listaAplicatii.add("Twitter");
        ImagineBuilder imagineBuilder = new ImagineBuilder();

        Imagine imagine1 = imagineBuilder.setAplicatiiInstalate(listaAplicatii).setHasContPremium(true).build();
        System.out.println(imagine1);

    }
}
