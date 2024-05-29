package a.ex11.main;

import a.ex11.clase.Card;
import a.ex11.clase.Cash;
import a.ex11.clase.Factura;
import a.ex11.clase.Platibil;

public class Main {
    public static void main(String[] args) {
        Platibil card = new Card();
        Platibil cash = new Cash();

        Factura factura1 = new Factura("Eliza");
        factura1.setModPlata(card);
        factura1.plateste(100.2f);
        Factura factura2 = new Factura("Liviu");
        factura2.setModPlata(cash);
        factura2.plateste(1000f);
    }
}
