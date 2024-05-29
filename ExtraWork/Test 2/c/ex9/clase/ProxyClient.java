package c.ex9.clase;

public class ProxyClient implements Achizitionabil{
    private Achizitionabil client;

    public ProxyClient(Achizitionabil client)
    {
        this.client = client;
    }

    @Override
    public void achizitioneazaMedicament(Medicament m) {
        Client client1 = (Client)client;
        if(client1.isAreReteta())
        {
            client1.achizitioneazaMedicament(m);
        }
        else
        {
            System.out.printf("Clientul %s nu are rețetă!%n", client1.getNume());
        }
    }
}
