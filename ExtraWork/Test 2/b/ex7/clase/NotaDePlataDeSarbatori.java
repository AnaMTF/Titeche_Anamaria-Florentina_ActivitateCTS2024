package b.ex7.clase;

public class NotaDePlataDeSarbatori extends ADecorator{

    public NotaDePlataDeSarbatori(Printabil chitanta) {
        super(chitanta);
    }

    @Override
    public void tipareste() {
        super.chitanta.tipareste();
        System.out.printf("Sărbători fericite!%n");
    }
}
