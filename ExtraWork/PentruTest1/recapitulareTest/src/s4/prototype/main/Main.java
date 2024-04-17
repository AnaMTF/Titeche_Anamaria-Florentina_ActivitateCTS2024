package s4.prototype.main;

import s4.prototype.clase.Banner;
import s4.prototype.clase.IAbstractBanner;

public class Main {
    public static void main(String[] args) {
        Banner banner = new Banner("Laptop", "Bucuresti", 100, 50);
        IAbstractBanner bannerCopie = banner.copiaza();
        System.out.println(banner);
        System.out.println(bannerCopie);
    }
}
