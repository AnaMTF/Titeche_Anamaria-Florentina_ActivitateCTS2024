package a.ex11.clase;

public class Card implements Platibil{
    @Override
    public String plateste() {
        return String.format("cardul.%n");
    }
}
