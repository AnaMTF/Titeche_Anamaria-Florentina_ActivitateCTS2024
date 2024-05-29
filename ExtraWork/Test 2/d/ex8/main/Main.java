package d.ex8.main;

import d.ex8.clase.Cont;
import d.ex8.clase.Creditabil;
import d.ex8.clase.Proxy;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    static int NR_MAX_CONTURI = 20;
    static Random random = new Random();
    static List<String> VALUTE = List.of(
            "RON",
            "GBP",
            "EUR",
            "HUF",
            "BTC"
    );

    static List<Creditabil> getConturi(Class<?> tip)
    {
        if(!tip.getInterfaces()[0].getSimpleName().equals("Creditabil"))
            throw new RuntimeException("Clasa trebuie să implementeze Creditabil!");
        else
        {
            int nrConturi = random.nextInt(NR_MAX_CONTURI)+1;
            List<Creditabil> conturi = new ArrayList<>();
            for (int i = 0; i < nrConturi; i++) {
                try {
                    conturi.add((Creditabil) tip.getConstructor(String.class).newInstance(VALUTE.get(random.nextInt(VALUTE.size()))));
                } catch (NoSuchMethodException e) {
                    try {
                        conturi.add((Creditabil) tip.getConstructor(Creditabil.class).newInstance(new Cont(VALUTE.get(random.nextInt(VALUTE.size())))));
                    } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                             NoSuchMethodException ex) {
                        throw new RuntimeException(ex);
                    }
                } catch (InvocationTargetException | InstantiationException | IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            }
            return conturi;
        }
    }
    public static void main(String[] args) {
        System.out.println("----------FĂRĂ PROXY------------");
        getConturi(Cont.class).forEach(Creditabil::crediteaza);
        System.out.println("----------CU PROXY--------------");
        getConturi(Proxy.class).forEach(Creditabil::crediteaza);
    }
}
