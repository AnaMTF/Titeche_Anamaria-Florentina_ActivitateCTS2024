package f.ex16.clase;

import java.util.LinkedList;
import java.util.Queue;

public class Operator {
    private Queue<Command> comenziPlecare = new LinkedList<>();

    public void adaugaComanda(Command command)
    {
        this.comenziPlecare.offer(command);
    }

    public void executaComenzi()
    {
        while(!this.comenziPlecare.isEmpty())
        {
            Command command = this.comenziPlecare.poll();
            command.executa();
        }
    }
}
