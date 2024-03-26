package factoryMethod.pachetAgentie.main;

import factoryMethod.pachetAgentie.clase.PachetGeneric;
import factoryMethod.pachetAgentie.fabrici.FabricaPachetCazare;
import factoryMethod.pachetAgentie.fabrici.FabricaPachetGeneric;

public class Main {
    public static void main(String[] args) {
        FabricaPachetGeneric fabricaPachetCazare = new FabricaPachetCazare("Pachet cazare", 200);
        PachetGeneric pachetCazare = fabricaPachetCazare.crearePachet();
        pachetCazare.afiseazaDecrierePachet();
    }
}
