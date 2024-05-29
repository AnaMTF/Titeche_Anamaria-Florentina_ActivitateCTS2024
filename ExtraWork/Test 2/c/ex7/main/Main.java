package c.ex7.main;

import c.ex7.clase.BonDeCasa;
import c.ex7.clase.BonDeSarbatori;
import c.ex7.clase.DecoratorAbstract;
import c.ex7.clase.Printabil;

public class Main {
    public static void main(String[] args) {
        Printabil bonNormal = new BonDeCasa();
        bonNormal.tipareste();

        DecoratorAbstract bonDeSarbatori = new BonDeSarbatori(bonNormal);
        DecoratorAbstract bonDeAnulNou = new BonDeSarbatori(bonDeSarbatori);
        bonDeSarbatori.tipareste();
        bonDeAnulNou.tipareste();
    }
}
