package e.ex8.main;

import e.ex8.clase.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static final int NR_MAX_PERSOANE = 100;
    static final int VARSTA_MAX = 100;
    static final Random rng = new Random();
    static List<Vandabil> getPersoane(Class<?> tip)
    {
        if(!Vandabil.class.isAssignableFrom(tip))
        {
            throw new IllegalArgumentException("Tipul dat nu implementează interfața Vandabil.");
        }
        int nrPersoane = rng.nextInt(NR_MAX_PERSOANE)+1;
        List<Vandabil> persoane = new ArrayList<>(nrPersoane);
        for (int i = 0; i < nrPersoane; i++) {
            try {
                Vandabil persoana = (Vandabil) tip.getConstructor(int.class).newInstance(rng.nextInt(VARSTA_MAX)+1);
                persoane.add(persoana);
            } catch (Exception e) {
                try {
                    Vandabil persoana = (Vandabil) tip.getConstructor(Vandabil.class).newInstance(new VanzareBilet(rng.nextInt(VARSTA_MAX)+1));
                    persoane.add(persoana);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        return persoane;
    }
    public static void main(String[] args) {
        System.out.println("-----FĂRĂ PROXY-----");
        List<Vandabil> persoane = getPersoane(VanzareBilet.class);
        persoane.forEach(Vandabil::vinde);
        System.out.println("-----CU PROXY-----");
        persoane = getPersoane(Proxy.class);
        persoane.forEach(Vandabil::vinde);
    }
}
