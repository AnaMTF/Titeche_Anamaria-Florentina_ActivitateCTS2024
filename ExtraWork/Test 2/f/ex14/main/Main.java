package f.ex14.main;

import com.github.javafaker.Faker;
import f.ex14.clase.Autobuz;

public class Main {
    static Faker faker = new Faker();
    public static void main(String[] args) {
        String[] statii = new String[]
        {
                faker.address().streetName(),
                faker.address().streetName(),
                faker.address().streetName(),
                faker.address().streetName(),
                faker.address().streetName(),
                faker.address().streetName()
        };
        Autobuz autobuz = new Autobuz(faker.number().numberBetween(100, 999), faker.name().fullName(), statii);

        autobuz.parcurge();
        autobuz.parcurge();
    }
}
