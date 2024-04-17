package s3.factory.main;

import s3.factory.fabrica.FabricaProduseMarketing;
import s3.factory.fabrica.TipProdusMarketing;
import s3.factory.model.ProdusMarketing;

public class Main {
    public static void main(String[] args) {
        FabricaProduseMarketing fabricaProduseMarketing = new FabricaProduseMarketing();
        try{
            ProdusMarketing flyer = fabricaProduseMarketing.creareProdus(TipProdusMarketing.FLYER, "Client1", "Domeniu1", 10, 20);
            ProdusMarketing poster = fabricaProduseMarketing.creareProdus(TipProdusMarketing.POSTER, "Client2", "Domeniu2", 20, 30);
            ProdusMarketing sticker = fabricaProduseMarketing.creareProdus(TipProdusMarketing.STICKER, "Client3", "Domeniu3", 30, 40);
            System.out.println(flyer);
            System.out.println(poster);
            System.out.println(sticker);

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
