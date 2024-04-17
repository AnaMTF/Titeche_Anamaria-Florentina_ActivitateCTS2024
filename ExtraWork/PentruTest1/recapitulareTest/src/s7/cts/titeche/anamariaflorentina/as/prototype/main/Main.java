package s7.cts.titeche.anamariaflorentina.as.prototype.main;

import s7.cts.titeche.anamariaflorentina.as.prototype.model.Imagine;
import s7.cts.titeche.anamariaflorentina.as.prototype.model.ImagineVirtuala;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        List<String> aplicatii = new ArrayList<>();
        aplicatii.add("PhotoShop");
        aplicatii.add("Facebook");
        aplicatii.add("Instagram");
        ImagineVirtuala imagine1 = new Imagine("Aplicatii telefon", aplicatii);
        ImagineVirtuala imagine2 = ((Imagine) imagine1).clone();
        ImagineVirtuala imagine3 = ((Imagine) imagine1).clone();
        ImagineVirtuala imagine4 = ((Imagine) imagine1).clone();
        ImagineVirtuala imagine5 = ((Imagine) imagine1).clone();
        System.out.println(imagine1);
        System.out.println(imagine2);
        System.out.println(imagine3);
        System.out.println(imagine4);
        System.out.println(imagine5);
    }
}
