package b.ex16.clase;

public class Email extends Fidelizabil{
    private String email;
    public Email(String email)
    {
        this.email = email;
    }
    @Override
    void trimite() {
        if(this.email!=null)
        {
            System.out.printf("S-a trimis e-mail la %s%n", this.email);
        }
        else
        {
            super.succesor.trimite();
        }
    }
}
