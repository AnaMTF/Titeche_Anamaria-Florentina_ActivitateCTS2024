package prototype.reclamaBanner.main;

import prototype.reclamaBanner.clase.Banner;
import prototype.reclamaBanner.clase.PrototipBanner;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> listaOrasePromovare = new ArrayList<>();
        listaOrasePromovare.add("Bucuresti1");
        listaOrasePromovare.add("Bucuresti2");
        listaOrasePromovare.add("Bucuresti3");
        listaOrasePromovare.add("Bucuresti4");

        PrototipBanner prototipBanner1 = new Banner("Sticker", 30, 44,listaOrasePromovare);
        PrototipBanner prototipBanner2 = ((Banner)prototipBanner1).copiaza();

        System.out.println(prototipBanner1);
        System.out.println(prototipBanner2);
    }
}
