package factoryMethod.main;

import factoryMethod.clase.PachetGeneric;
import factoryMethod.fabrici.FabricaPachetCazare;
import factoryMethod.fabrici.FabricaPachetGeneric;

public class Main {
    public static void main(String[] args) {
        FabricaPachetGeneric fabricaPachetCazare = new FabricaPachetCazare("Pachet cazare", 200);
        PachetGeneric pachetCazare = fabricaPachetCazare.crearePachet();
        pachetCazare.afiseazaDecrierePachet();
    }
}
