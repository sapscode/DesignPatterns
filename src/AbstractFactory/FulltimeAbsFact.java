package AbstractFactory;

public class FulltimeAbsFact extends AbstractFactory{
    @Override
    public Profession getProfession(String type) {
        if(type.equalsIgnoreCase("sde")) return new SDE();
        else if(type.equalsIgnoreCase("qa")) return new QA();
        return null;
    }
}
