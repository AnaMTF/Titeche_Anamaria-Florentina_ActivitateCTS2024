package factoryMethod.fabrici;

import factoryMethod.clase.PachetGeneric;
import factoryMethod.clase.PachetTransport;

public class FabricaPachetTransport extends FabricaPachetGeneric{
    public FabricaPachetTransport(String numePachet, float pret) {
        super(numePachet, pret);
    }

    @Override
    public PachetGeneric crearePachet() {
        return new PachetTransport(super.getNumePachet(), super.getPret());
    }
}
