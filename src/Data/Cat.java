package Data;

public class Cat extends Pet{
    public Cat(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Cat " + super.getName();
    }
}
