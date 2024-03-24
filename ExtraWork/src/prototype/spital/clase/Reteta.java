package prototype.spital.clase;

import java.util.ArrayList;
import java.util.List;

public class Reteta implements PrototipReteta, Cloneable{
    String numeMedicament;
    float cantitate;
    List<String> ingrediente = new ArrayList<>();

    public Reteta(String numeMedicament, float cantitate, List<String> ingrediente) {
        if (numeMedicament.length() == 0){
            throw new RuntimeException("Numele nu poate sa fie gol");
        }
        this.numeMedicament = numeMedicament;
        if (cantitate <= 0 ){
            throw new RuntimeException("Cantitatea trebuie sa fie un numar strict pozitiv");
        }
        this.cantitate = cantitate;
        if (ingrediente.size()==0){
            throw new RuntimeException("Reteta trebuie sa contina cel putin un ingredient");
        }
        this.ingrediente = ingrediente;
    }

    public Reteta() {
        this.numeMedicament = "nimic";
        this.cantitate = 0;
        this.ingrediente = new ArrayList<>();
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public void setCantitate(float cantitate) {
        this.cantitate = cantitate;
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Reteta{");
        sb.append("numeMedicament='").append(numeMedicament).append('\'');
        sb.append(", cantitate=").append(cantitate);
        sb.append(", ingrediente=").append(ingrediente);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public PrototipReteta copiaza() {
        Reteta copieReteta = new Reteta();
        copieReteta.cantitate = this.cantitate;
        copieReteta.numeMedicament = this.numeMedicament;
        for (String element : ingrediente){
            copieReteta.ingrediente.add(element);
        }
        return copieReteta;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Reteta copyReteta = new Reteta();
        copyReteta.numeMedicament = this.numeMedicament;
        copyReteta.cantitate = this.cantitate;
        ingrediente.forEach(ingredient ->{
            copyReteta.ingrediente.add(ingredient);
        });
        return copyReteta;
    }
}
