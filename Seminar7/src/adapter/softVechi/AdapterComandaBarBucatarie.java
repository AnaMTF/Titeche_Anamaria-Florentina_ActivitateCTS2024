package adapter.softVechi;

import adapter.softNou.Bar;
import adapter.softNou.Bautura;

public class AdapterComandaBarBucatarie extends Bar implements SoftBucatarie {

    @Override
    public void printareBon() {
        super.printareBonBauturi();
    }

    @Override
    public void adaugaProdus(Produs produs) {
        //nu e recomandat asa... trebuia adapter de clase
        super.adaugaBautura(new Bautura(produs.getNume(), produs.getPret(), 0));
    }
}
