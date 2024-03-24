package simpleFactory.spital.main;

import simpleFactory.spital.clase.Asistent;
import simpleFactory.spital.clase.PersonalSpital;
import simpleFactory.spital.clase.TipPersonal;
import simpleFactory.spital.clase.factory.PersonalFactory;

public class Main {
    public static void main(String[] args) {
        PersonalFactory personalFactory = new PersonalFactory();
        try {
            PersonalSpital asistent = personalFactory.crearePersonal(TipPersonal.Asistent, "Ana", 3600.3f);
            System.out.println(asistent);
            PersonalSpital brancardier = personalFactory.crearePersonal(TipPersonal.Brancardier, "Ion", 2900);
            System.out.println(brancardier);
            PersonalSpital medic = personalFactory.crearePersonal(TipPersonal.Medic, "Andreea", 69873);
            System.out.println(medic);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
