package builder.imagine.clase;

import java.util.List;

public interface ImagineVirtuala {
    boolean getAreContPremium();
    boolean getAreExtensie();
    List<String> getAplicatiiInstalate();
    void afiseazaDescriereImagineVirtuala();
    void instaleazaAplicatie(String numeAplicatie);
}
