package d.ex12.clase;

public class Banca extends Subiect{
    private String mesaj;
    public Banca(String mesaj)
    {
        this.mesaj = mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void notifica() {
        super.trimiteAbonatilor(this.mesaj);
    }
}
