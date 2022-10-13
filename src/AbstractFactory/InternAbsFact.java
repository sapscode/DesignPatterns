package AbstractFactory;

public class InternAbsFact extends AbstractFactory {
    @Override
    public Profession getProfession(String type) {
        if(type.equalsIgnoreCase("sde")) return new SDEintern();
        else if(type.equalsIgnoreCase("qa")) return new QAintern();
        return null;
    }
}
