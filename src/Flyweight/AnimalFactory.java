package Flyweight;

import java.util.HashMap;

public class AnimalFactory {
    private static final HashMap<String, Animal> mp = new HashMap<>();

    public static Animal getCat(String name){
        String key = name + "-CAT";
        Animal animal = mp.get(key);

        if(animal != null) return animal;
        else {
            animal = new Cat();
            animal.setName(name);
            mp.put(key, animal);
        }
        return animal;
    }

    public static Animal getDog(String name){
        String key = name + "-DOG";
        Animal animal = mp.get(key);

        if(animal != null) return animal;
        else {
            animal = new Dog();
            animal.setName(name);
            mp.put(key, animal);
        }
        return animal;
    }

    public static Animal getCow(String name){
        String key = name + "-COW";
        Animal animal = mp.get(key);

        if(animal != null) return animal;
        else {
            animal = new Cow();
            animal.setName(name);
            mp.put(key, animal);
        }
        return animal;
    }
}
