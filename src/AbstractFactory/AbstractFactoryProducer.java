package AbstractFactory;

public class AbstractFactoryProducer {
    public static AbstractFactory getProfession(boolean isIntern) {
        if(isIntern) return new InternAbsFact();
        else return new FulltimeAbsFact();
    }
}
