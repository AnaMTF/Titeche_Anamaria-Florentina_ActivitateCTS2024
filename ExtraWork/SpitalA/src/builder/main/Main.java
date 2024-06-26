package builder.main;

import builder.clase.AbstractFacilitatiBuilder;
import builder.clase.FacilitatiBuilder;
import builder.clase.Pacient;

public class Main {
    public static void main(String[] args) {
        FacilitatiBuilder builder1 = new FacilitatiBuilder();
        Pacient pacient1 = builder1.adaugaHalatInterior(true).adaugaPapuciCamera(true).build();
        System.out.println(pacient1);
        FacilitatiBuilder builder2 = new FacilitatiBuilder();
        Pacient pacient2 = builder2.adaugaMicDejun(true).adaugaPatRabatabil(true).adaugaPapuciCamera(true).build();
        System.out.println(pacient2);
    }
}
