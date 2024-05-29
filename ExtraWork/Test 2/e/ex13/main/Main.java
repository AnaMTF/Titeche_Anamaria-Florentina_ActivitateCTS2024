package e.ex13.main;

import e.ex13.clase.Loc;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static final int NR_MAX_LOC = 100;
    static final Random rng = new Random();
    static final Method[] COMENZI_STARI_LOC = Arrays.stream(Loc.class.getMethods()).filter(comanda -> comanda.getDeclaringClass() != Object.class).toArray(Method[]::new);
    public static void main(String[] args) {
        Loc loc = new Loc(rng.nextInt(NR_MAX_LOC)+1);
        while(true)
        {
            try {
                COMENZI_STARI_LOC[rng.nextInt(COMENZI_STARI_LOC.length)].invoke(loc);
                Thread.sleep(1500);
            } catch (IllegalAccessException | InvocationTargetException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
