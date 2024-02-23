package model.zoo;

import model.animale.Vietate;

public class ZooKeeper {
    public ZooKeeper(String name) {
        this.name = name;
    }

    private String name;

    public void feedAnimal(Vietate vietate, String food) {
        vietate.eat(food);
    }
}
