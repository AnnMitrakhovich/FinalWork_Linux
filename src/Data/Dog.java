package Data;

public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Dog " + super.getName();
    }
}
