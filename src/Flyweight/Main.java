package Flyweight;

public class Main {
    public static void main(String[] args) {
        Animal cat1 = AnimalFactory.getCat("meow");
        cat1.printAnimalAttribute();

        Animal cat2 = AnimalFactory.getCat("meow");
        cat2.printAnimalAttribute();

        Animal cow = AnimalFactory.getCow("moo");
        cow.printAnimalAttribute();

        Animal dog = AnimalFactory.getDog("bhow");
        dog.printAnimalAttribute();

        System.out.println(cat1.hashCode());
        System.out.println(cat2.hashCode());
    }
}
