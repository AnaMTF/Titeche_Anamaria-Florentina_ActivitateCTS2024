package proxy.claseProxy;

import proxy.clase.Autobuz;
import proxy.clase.AutobuzAbstract;

import java.util.ArrayList;
import java.util.List;

public class AutobuzProtest implements AutobuzAbstract {
    List<String> listaStatiiInterzise = new ArrayList<>();
    AutobuzAbstract autobuz;

    public AutobuzProtest(AutobuzAbstract autobuz) {
        this.autobuz = autobuz;
    }

    public void adaugaStatieInterzisa(String statie){
        if (!listaStatiiInterzise.contains(statie)){
            listaStatiiInterzise.add(statie);
        }
    }

    @Override
    public void opresteInStatie(String statie) {
        if (listaStatiiInterzise.contains(statie)){
            System.out.println("Autobuzul " + autobuz.getNrAutobuz() + " nu opreste in statia " + statie + " pentru ca este protest.");
        }else{
            autobuz.opresteInStatie(statie);
        }
    }

    @Override
    public int getNrAutobuz() {
        return autobuz.getNrAutobuz();
    }

    @Override
    public int getNrCalatori() {
        return autobuz.getNrCalatori();
    }

    @Override
    public String getNumeSofer() {
        return autobuz.getNumeSofer();
    }
}
