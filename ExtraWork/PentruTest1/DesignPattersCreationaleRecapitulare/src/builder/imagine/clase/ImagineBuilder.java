package builder.imagine.clase;

import java.util.ArrayList;
import java.util.List;

public class ImagineBuilder implements Builder{
    private Imagine imagine;

    public ImagineBuilder() {
        imagine = new Imagine(false,false,new ArrayList<>());
    }

    public ImagineBuilder setHasContPremium(boolean hasContPremium){
        this.imagine.setAreContPremium(hasContPremium);
        return this;
    }
     public ImagineBuilder setHasExtensie(boolean hasExtensie){
        this.imagine.setAreExtensie(hasExtensie);
        return this;
    }

    public ImagineBuilder setAplicatiiInstalate(List<String> aplicatii){
        this.imagine.setAplicatiiInstalate(aplicatii);
        return this;
    }

    @Override
    public Imagine build() {
        return imagine;
    }
}
