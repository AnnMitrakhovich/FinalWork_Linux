package Data;

public class Horse extends PackAnimal{
    public Horse(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Horse " + super.getName();
    }
}
