package factoryMethod.pachetAgentie.fabrici;

import factoryMethod.pachetAgentie.clase.PachetGeneric;
import factoryMethod.pachetAgentie.clase.PachetTransport;

public class FabricaPachetTransport extends FabricaPachetGeneric{
    public FabricaPachetTransport(String numePachet, float pret) {
        super(numePachet, pret);
    }

    @Override
    public PachetGeneric crearePachet() {
        return new PachetTransport(super.getNumePachet(), super.getPret());
    }
}
