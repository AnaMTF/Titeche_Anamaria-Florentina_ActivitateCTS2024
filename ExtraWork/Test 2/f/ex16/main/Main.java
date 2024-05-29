package f.ex16.main;

import com.github.javafaker.Faker;
import f.ex16.clase.Autobuz;
import f.ex16.clase.ComandaPlecare;
import f.ex16.clase.Operator;

public class Main {
    static Faker faker = new Faker();
    public static void main(String[] args) {
        Operator operator = new Operator();
        Autobuz autobuz1 = new Autobuz(faker.name().fullName());
        Autobuz autobuz2 = new Autobuz(faker.name().fullName());

        operator.adaugaComanda(new ComandaPlecare(autobuz1, faker.number().numberBetween(100, 1000)));
        operator.adaugaComanda(new ComandaPlecare(autobuz1, faker.number().numberBetween(100, 1000)));
        operator.adaugaComanda(new ComandaPlecare(autobuz2, faker.number().numberBetween(100, 1000)));
        operator.adaugaComanda(new ComandaPlecare(autobuz2, faker.number().numberBetween(100, 1000)));

        operator.executaComenzi();
    }
}
