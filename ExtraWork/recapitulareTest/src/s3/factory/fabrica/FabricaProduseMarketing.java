package s3.factory.fabrica;

import s3.factory.model.Flyer;
import s3.factory.model.Poster;
import s3.factory.model.ProdusMarketing;
import s3.factory.model.Sticker;

public class FabricaProduseMarketing {
    public static ProdusMarketing creareProdus(TipProdusMarketing tipProdusMarketing, String numeClient, String domeniuActivitate, int latime, int inaltime) throws Exception {
        switch (tipProdusMarketing) {
            case FLYER:
                return new Flyer(numeClient, domeniuActivitate, latime, inaltime);
            case POSTER:
                return new Poster(numeClient, domeniuActivitate, latime, inaltime);
            case STICKER:
                return new Sticker(numeClient, domeniuActivitate, latime, inaltime);
            default:
                throw new Exception("Tipul nu este corect");
        }
    }
}
