package d.ex15.clase;

import java.util.Stack;

public class Functionar {
    private Stack<Executabil> comenzi = new Stack<>();

    public void trimiteComanda(Executabil comanda)
    {
        comanda.execute();
        this.comenzi.push(comanda);
    }

    public void anuleazaUltimaComanda()
    {
        if(!this.comenzi.isEmpty())
        {
            this.comenzi.pop().undo();
        }
        else
        {
            System.out.println("Nu există comenzi de anulat!");
        }
    }
}
