package builder.spital.clase;

public class FacilitatiBuilder implements AbstractFacilitatiBuilder{
    boolean arePatRabatabil;
    boolean areMicDejun;
    boolean arePapuciCamera;
    boolean areHalatInterior;

    public FacilitatiBuilder() {
        this.areHalatInterior = false;
        this.areMicDejun = false;
        this.arePapuciCamera = false;
        this.arePatRabatabil = false;
    }

    @Override
    public Pacient build() {
        return new Pacient(arePatRabatabil, areMicDejun, arePapuciCamera,areHalatInterior);
    }

    @Override
    public AbstractFacilitatiBuilder adaugaPatRabatabil(boolean arePatRabatabil) {
        this.arePatRabatabil = arePatRabatabil;
        return this;
    }

    @Override
    public AbstractFacilitatiBuilder adaugaMicDejun(boolean areMicDejun) {
        this.areMicDejun = areMicDejun;
        return this;
    }

    @Override
    public AbstractFacilitatiBuilder adaugaPapuciCamera(boolean arePapuciCamera) {
        this.arePapuciCamera = arePapuciCamera;
        return this;
    }

    @Override
    public AbstractFacilitatiBuilder adaugaHalatInterior(boolean areHalatInterior) {
        this.areHalatInterior = areHalatInterior;
        return this;
    }


}
