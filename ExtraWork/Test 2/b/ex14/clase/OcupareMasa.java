package b.ex14.clase;

public class OcupareMasa extends OcupareAbstracta{
    @Override
    void curata() {
        System.out.println("Masa a fost curățată.");
    }

    @Override
    void asaza() {
        System.out.println("Șervețelele au fost așezate.");
    }

    @Override
    void pune() {
        System.out.println("Tacâmurile au fost puse.");
    }

    @Override
    void invita(Persoana... persoane) {
        for (Persoana persoana : persoane) {
            System.out.printf("Poftește la masă, %s!%n", persoana);
        }
    }
}
