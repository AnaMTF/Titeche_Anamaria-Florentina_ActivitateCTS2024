package state.main;

import state.clase.Reteta;

public class Main {
    public static void main(String[] args) {
        Reteta reteta = new Reteta(5, 13.5f, 11);
        reteta.respingeReteta();
        reteta.cumparaMedicament();
        reteta.cereMedicamente();
        reteta.respingeReteta();
        reteta.cereMedicamente();
        reteta.cumparaMedicament();
    }
}
