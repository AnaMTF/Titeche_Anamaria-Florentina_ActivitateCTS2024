package model.acvatice;

public class Caras extends Peste{
    public Caras ( int nrInotatoare, String rasa) {
        super(nrInotatoare, rasa);
    }

     @Override
    public void eat(String food) {
        var sb = new StringBuilder();
        sb.append("The fish ");
        sb.append(getRasa());
        sb.append(" eats ");
        sb.append(food);
        System.out.println(sb);
    }
}
