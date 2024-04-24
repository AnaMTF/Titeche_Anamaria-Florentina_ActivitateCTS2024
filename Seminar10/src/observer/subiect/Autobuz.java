package observer.subiect;

public class Autobuz extends Subject{
    public void anuntaDeviereTraseu(){
        super.notificareObservers("Autobuzul deviaza de la traseul initial");
    }
    @Override
    public void anuntaPlecare() {
        super.notificareObservers("Autobuzul pleaca de la capat.");
    }
}
