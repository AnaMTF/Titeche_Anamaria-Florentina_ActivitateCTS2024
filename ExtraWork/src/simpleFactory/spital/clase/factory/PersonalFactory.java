package simpleFactory.spital.clase.factory;

import simpleFactory.spital.clase.*;

public class PersonalFactory {
    public static PersonalSpital crearePersonal(TipPersonal tipPersonal, String nume, float salariu) throws Exception {
        switch (tipPersonal){
            case Medic:
                return new Medic(nume, salariu);
            case Asistent:
                return new Asistent(nume, salariu);
            case Brancardier:
                return  new Brancardier(nume, salariu);
            default:
                throw new Exception("Nu este tipul corect");
        }

    }
}
