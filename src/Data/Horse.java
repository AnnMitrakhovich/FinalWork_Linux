package Data;

public class Horse extends PackAnimal{
    public Horse(int id, String name, String birthday) {
        super(id, name, birthday);
    }

    @Override
    public String getName() {
        return "Horse " + super.getName();
    }
}
