package Flyweight;

public class Dog implements Animal{
    private String name = null;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printAnimalAttribute() {
        System.out.println("Name of animal is " + this.name);
        System.out.println("Number of eyes is " + CommonShareable.eyes);
        System.out.println("Number of nose is " + CommonShareable.nose);
        System.out.println("Number of legs is " + CommonShareable.legs);
        System.out.println("Number of tail is " + CommonShareable.tail);
    }
}
