package model.animale;

public class Zebra extends Animal{
    public Zebra(int age, String name, int nrPicioare) {
        super(age, name, nrPicioare);
    }

    @Override
    public void eat(String food) {
        var sb = new StringBuilder();
        sb.append("The zebra ");
        sb.append(getName());
        sb.append(" eats ");
        sb.append(food);
        System.out.println(sb.toString());
    }
}
