package a.ex12.clase;

public class CoronaVirus extends Subiect{
    private static final String NUME = "CoronaVirus";

    public CoronaVirus() {
        super();
    }

    @Override
    public void anuntaVirus(String cartier) {
        super.anuntVirusNou(String.format("%s în cartierul %s", NUME, cartier));
    }
}
