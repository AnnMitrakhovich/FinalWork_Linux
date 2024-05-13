package Data;

public class Dog extends Pet{
    public Dog(int id, String name, String birthday) {
        super(id, name, birthday);
    }

    @Override
    public String getName() {
        return "Dog " + super.getName();
    }
}
