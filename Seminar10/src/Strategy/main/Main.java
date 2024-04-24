package Strategy.main;

import Strategy.clase.PlataCardBancar;
import Strategy.clase.PlataCardCalatorii;
import Strategy.clase.PlataSMS;
import Strategy.clase.Validator;

public class Main {
    public static void main(String[] args) {
        Validator validator = new Validator(23, new PlataCardBancar());
        validator.efectueazaPlata(3);
        validator.setModDePlata(new PlataSMS());
        validator.efectueazaPlata(3.99);
        validator.setModDePlata(new PlataCardCalatorii());
        validator.efectueazaPlata(4);
    }
}
