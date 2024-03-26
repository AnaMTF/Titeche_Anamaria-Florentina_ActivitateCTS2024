package factoryMethod.fabrici;

import factoryMethod.clase.PachetGeneric;
import factoryMethod.clase.PachetTuristic;

public class FabricaPachetTuristic extends FabricaPachetGeneric{
    public FabricaPachetTuristic(String numePachet, float pret) {
        super(numePachet, pret);
    }

    @Override
    public PachetGeneric crearePachet() {
        return new PachetTuristic(super.getNumePachet(), super.getPret());
    }
}
