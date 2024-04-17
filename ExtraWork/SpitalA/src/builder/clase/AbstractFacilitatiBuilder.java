package builder.clase;

public interface AbstractFacilitatiBuilder {
    Pacient build();

    AbstractFacilitatiBuilder adaugaPatRabatabil(boolean arePatRabatabil);
    AbstractFacilitatiBuilder adaugaMicDejun(boolean areMicDejun);
    AbstractFacilitatiBuilder adaugaPapuciCamera(boolean arePapuciCamera);
    AbstractFacilitatiBuilder adaugaHalatInterior(boolean areHalatInterior);

}
