package Strategy.clase;

public class PlataCardCalatorii implements ModDePlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("S-a efectuat plata pt calatoria in valoare de " + pretBilet + " cu cardul de calatorii");
    }
}
