package model.zoo;


import model.animale.Vietate;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String name;
    private ZooKeeper keeper;
    private Map<Vietate, String> animals;

    public Zoo(String name, ZooKeeper keeper) {
        this.name = name;
        this.keeper = keeper;
        this.animals = null;
    }

    public void addVietate(Vietate animal, String food) {
        if (animals == null) {
            animals = new HashMap<>();
        }
        animals.put(animal, food);
    }

    public void feedAllAnimals(){
        for (Vietate v : animals.keySet()){
            keeper.feedAnimal(v, animals.get(v));
        }
    }
}

