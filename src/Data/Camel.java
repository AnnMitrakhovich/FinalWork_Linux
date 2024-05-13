package Data;

public class Camel extends PackAnimal{
    public Camel(int id, String name, String birthday) {
        super(id, name, birthday);
    }

    @Override
    public String getName() {
        return "Camel " + super.getName();
    }
}
