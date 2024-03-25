package s7.cts.titeche.anamariaflorentina.as.builder.clase;

import java.util.HashMap;
import java.util.Map;

public class ImagineBuilder implements Builder{

    private Imagine imagine;

    public ImagineBuilder() {
        this.imagine = new Imagine(null, new HashMap<>());
    }

    public ImagineBuilder setNume(String nume) {
        this.imagine.setNume(nume);
        return this;
    }

    public ImagineBuilder setAplicatii(Map<String, Boolean> aplicatii) {
        this.imagine.setAplicatii(aplicatii);
        return this;
    }

    @Override
    public Imagine build() {
        return imagine;
    }
}
