package f.ex9.clase;

public class Autobuz {
    private String model;
    private int anFabricatie;
    private int nrLocuri;

    public Autobuz(int anFabricatie, String model, int nrLocuri) {
        this.anFabricatie = anFabricatie;
        this.model = model;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public String toString() {
        return String.format("%s fabricat în anul %d cu %d locuri.%n", this.model, this.anFabricatie, this.nrLocuri);
    }
}
