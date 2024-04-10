package proxy.main;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzAbstract;
import proxy.claseProxy.AutobuzDeNoapte;
import proxy.claseProxy.AutobuzProtest;

public class Main {
    public static void main(String[] args) {
        AutobuzAbstract autobuz1 = new Autobuz(4,355,"Gigel");
        autobuz1.opresteInStatie("Piata Romana");
        AutobuzAbstract autobuzN1 = new AutobuzDeNoapte(autobuz1);
        autobuzN1.opresteInStatie("Titan");

        AutobuzAbstract autobuz2 = new Autobuz(0,102,"Gigelescu");
        autobuz2.opresteInStatie("Unirii");
        AutobuzAbstract autobuzN2 = new AutobuzDeNoapte(autobuz2);
        autobuzN2.opresteInStatie("Dristor");

        AutobuzProtest autobuzProtest1 = new AutobuzProtest(autobuz1);
        AutobuzProtest autobuzProtestN1 = new AutobuzProtest(autobuzN1);

        autobuzProtest1.adaugaStatieInterzisa("Piata Romana");
        autobuzProtestN1.adaugaStatieInterzisa("Titan");

        autobuzProtest1.opresteInStatie("Piata Romana");
        autobuzProtestN1.opresteInStatie("Titan");


    }
}
