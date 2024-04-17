package s3.singleton.main;

import s3.singleton.clase.Banner;
import s3.singleton.clase.RegistryBanner;

public class Main {
    public static void main(String[] args) {

        Banner banner1 = new Banner("Ion", "IT", 12,13);
        Banner banner2 = new Banner("Popa", "Marketing", 1235,153);
        Banner banner3 = new Banner("Andrei", "Medicina", 12,173);
        Banner banner4 = new Banner("Ana", "IT", 1232,13);

        try{
            RegistryBanner.inregistreazaBanner(banner1.getDomeniuActivitate(), banner1);
            RegistryBanner.inregistreazaBanner(banner2.getDomeniuActivitate(), banner2);
            RegistryBanner.inregistreazaBanner(banner3.getDomeniuActivitate(), banner3);
            RegistryBanner.inregistreazaBanner(banner4.getDomeniuActivitate(), banner4);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

    }
}
