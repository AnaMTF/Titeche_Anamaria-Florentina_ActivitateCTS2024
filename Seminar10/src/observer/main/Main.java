package observer.main;

import observer.clase.Client;
import observer.subiect.Autobuz;
import observer.subiect.Subject;
import observer.subiect.Tramvai;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Ana");
        Client client2 = new Client("Ionut");
        Subject tramvai = new Tramvai(41);
        tramvai.abonareObserver(client);
        tramvai.abonareObserver(client2);
        tramvai.anuntaPlecare();
        tramvai.dezabonareObserver(client2);
        Client client3 = new Client("Andreea");
        tramvai.abonareObserver(client3);
        tramvai.anuntaPlecare();

        Subject autobuz = new Autobuz();
        autobuz.abonareObserver(client);
        autobuz.abonareObserver(client2);
        autobuz.anuntaPlecare();
        ((Autobuz)autobuz).anuntaDeviereTraseu();
    }
}
