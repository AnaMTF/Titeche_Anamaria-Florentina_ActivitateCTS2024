package prototype;

import java.util.ArrayList;
import java.util.List;

public class Client implements AbstractPrototype{
    private String nume;
    private int varsta;
    private List<String> listaAccesorii;

    public Client(String nume, int varsta, List<String> listaAccesorii) {
        this.nume = nume;

        if (varsta < 14){
            throw new RuntimeException("Varsta nu poate fi mai mica de 14 ani");
        }

        this.varsta = varsta;

        if (listaAccesorii.size() >= 5){
            throw new RuntimeException("Prea multe accesorii");
        }

        this.listaAccesorii = listaAccesorii;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public void setListaAccesorii(List<String> listaAccesorii) {
        this.listaAccesorii = listaAccesorii;
    }

    private Client (){}

    @Override
    public AbstractPrototype copiaza() {
        Client client = new Client();
        client.nume = this.nume;
        client.varsta = this.varsta;
        client.listaAccesorii = new ArrayList<>();
        this.listaAccesorii.forEach(accesoriu -> {
            client.listaAccesorii.add(accesoriu);
        });
        return client;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", listaAccesorii=" + listaAccesorii +
                '}';
    }
}
