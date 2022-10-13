package AbstractFactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory absFact = AbstractFactoryProducer.getProfession(true);
        Profession engineer = absFact.getProfession("qa");
        engineer.print();
    }
}
