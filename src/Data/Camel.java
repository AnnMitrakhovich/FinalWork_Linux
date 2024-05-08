package Data;

public class Camel extends PackAnimal{
    public Camel(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Camel " + super.getName();
    }
}
