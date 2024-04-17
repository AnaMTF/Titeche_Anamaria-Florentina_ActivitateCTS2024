package singletonTS.main;

import singletonTS.clase.ProdusBio;
import singletonTS.clase.STSProdusGeneric;

public class Main {
    public static void main(String[] args) {
        STSProdusGeneric produsBio = ProdusBio.getInstantaProdus("lapte", 33);
        STSProdusGeneric produsBio2 = ProdusBio.getInstantaProdus("lapte2", 33);
        STSProdusGeneric produsBio3 = ProdusBio.getInstantaProdus("lapte2", 33);

        produsBio.afiseazaDescriereProdus();
        produsBio2.afiseazaDescriereProdus();
        produsBio3.afiseazaDescriereProdus();
    }
}
