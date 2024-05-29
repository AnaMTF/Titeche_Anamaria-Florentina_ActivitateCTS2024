package c.ex7.clase;

public class BonDeSarbatori extends DecoratorAbstract{
    public BonDeSarbatori(Printabil bon) {
        super(bon);
    }

    @Override
    public void tipareste() {
        System.out.println("La Mulți ani!");
        super.bon.tipareste();
    }
}
