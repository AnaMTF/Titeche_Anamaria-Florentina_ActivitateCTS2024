package d.ex7.clase;

public class Operator {
    private String id;

    public Operator(String id) {
        this.id = id;
    }

    public boolean areVarstaLegala(int varsta)
    {
        return varsta > 13;
    }

    public boolean eUrmaritDePolitie(boolean eUrmaritDePolitie)
    {
        return eUrmaritDePolitie;
    }

    public boolean areCreanteLaAlteBanci(boolean areCreante)
    {
        return areCreante;
    }

    public void inscrieClient(Persoana client)
    {
        if(areVarstaLegala(client.getVarsta()))
        {
            if(eUrmaritDePolitie(client.isUrmaritPolitie()))
            {
                if(areCreanteLaAlteBanci(client.isCreanteBanci()))
                {
                    System.out.println("Clientul a fost înregistrat în sistem.");
                }
                else
                {
                    System.out.println("Clientul are creanțe la alte bănci. Nu ne poate fi client.");
                }
            }
            else
            {
                System.out.println("Clientul este urmărit de poliție, deci nu ne poate fi client.");
            }
        }
        else
        {
            System.out.println("Clientul nu are vârsta legală pentru a fi clientul nostru.");
        }
    }
}
