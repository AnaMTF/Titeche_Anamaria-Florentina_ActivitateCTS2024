package factoryMethod.pachetAgentie.fabrici;

import factoryMethod.pachetAgentie.clase.PachetCazare;
import factoryMethod.pachetAgentie.clase.PachetGeneric;

public class FabricaPachetCazare extends FabricaPachetGeneric{
    public FabricaPachetCazare(String numePachet, float pret) {
        super(numePachet, pret);
    }

    @Override
    public PachetGeneric crearePachet() {
        return new PachetCazare(super.getNumePachet(), super.getPret());
    }
}
