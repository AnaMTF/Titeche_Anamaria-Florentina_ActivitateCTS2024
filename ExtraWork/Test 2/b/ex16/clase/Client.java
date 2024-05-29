package b.ex16.clase;

public class Client {
    private Fidelizabil client;

    public Client(String nrTelefon, String email)
    {
        Fidelizabil sms = new SMS(nrTelefon);
        Fidelizabil mail = new Email(email);
        Fidelizabil manager = new Manager();

        this.client = sms;
        sms.setSuccesor(mail);
        mail.setSuccesor(manager);
    }

    public void anunta()
    {
        this.client.trimite();
    }
}
