package factoryMethod.pachetAgentie.fabrici;

import factoryMethod.pachetAgentie.clase.PachetGeneric;
import factoryMethod.pachetAgentie.clase.PachetTuristic;

public class FabricaPachetTuristic extends FabricaPachetGeneric{
    public FabricaPachetTuristic(String numePachet, float pret) {
        super(numePachet, pret);
    }

    @Override
    public PachetGeneric crearePachet() {
        return new PachetTuristic(super.getNumePachet(), super.getPret());
    }
}
