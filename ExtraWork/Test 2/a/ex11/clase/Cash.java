package a.ex11.clase;

public class Cash implements Platibil{
    @Override
    public String plateste() {
        return String.format("bani gheață.%n");
    }
}
