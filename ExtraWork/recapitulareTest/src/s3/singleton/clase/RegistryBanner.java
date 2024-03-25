package s3.singleton.clase;

import java.util.HashMap;
import java.util.Map;

public class RegistryBanner {
    static Map<String, Banner> colectieBanners = new HashMap<>();

    private RegistryBanner() {}

    public static void inregistreazaBanner(String domeniu, Banner banner) throws RuntimeException {
        //banners.putIfAbsent(domeniu, banner);
        if (colectieBanners.containsKey(domeniu)){
            throw new RuntimeException("In domeniul " + domeniu + " clientul este " + colectieBanners.get(domeniu).getNumeClient() + " si nu poate fi inregistrat");
        }else {
            colectieBanners.put(domeniu, banner);
            System.out.println("Clientul " + banner.getNumeClient() + " a fost inregistrat cu succes in domeniul " + domeniu);
        }
    }
    
    public Banner getBanner(String domeniu) {
        return colectieBanners.get(domeniu);
    }
}
