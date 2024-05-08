package template.clase;

import java.util.HashMap;
import java.util.Map;

public abstract class Template {
    protected Map<String, Integer> stocuri;

    public Template() {
        this.stocuri = new HashMap<>();
        stocuri.put("Nurofen", 12);
        stocuri.put("Paracetamol", 2);
        stocuri.put("Ibuprofen", 4);
    }

    public final void cumparaMedicament(){
        primireReteta();
        if (verificareStoc()){
            aducereMedicamente();
            incasare();
            emitereBon();
        }else {
            respingeAchizitie();
        }
    }

    protected abstract void primireReteta();
    protected abstract boolean verificareStoc();
    protected abstract void incasare();
    protected abstract void aducereMedicamente();
    protected abstract void emitereBon();
    protected abstract void respingeAchizitie();
}
