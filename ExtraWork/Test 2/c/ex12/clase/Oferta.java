package c.ex12.clase;

public class Oferta extends Notificare{
    private String mesaj;

    public Oferta(String mesaj) {
        this.mesaj = mesaj;
    }

    public void setMesaj(String mesaj) {
        this.mesaj = mesaj;
    }

    @Override
    public void trimite() {
        super.notifica(this.mesaj);
    }
}
