package f.ex15.main;

import com.github.javafaker.Faker;
import f.ex15.clase.Autobuz;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    static Faker faker = new Faker();
    static Method[] metodeAutobuz = Arrays.stream(Autobuz.class.getDeclaredMethods()).filter(metoda -> Modifier.isPublic(metoda.getModifiers())).toArray(Method[]::new);
    public static void main(String[] args) {
        Autobuz autobuz = new Autobuz(faker.number().numberBetween(100, 999), faker.name().fullName());
        while(true)
        {
            try {
                metodeAutobuz[faker.number().numberBetween(0, metodeAutobuz.length)].invoke(autobuz);
                Thread.sleep(1500);
            } catch (IllegalAccessException | InvocationTargetException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
