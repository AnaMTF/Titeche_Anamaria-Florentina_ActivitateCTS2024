package b.ex16.clase;

public class Manager extends Fidelizabil{
    @Override
    void trimite() {
        System.out.println("Clientul nu are nici telefon, nici email!");
    }
}
