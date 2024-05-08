package Data;

public class Hamster extends Pet{
    public Hamster(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Hamster " + super.getName();
    }
}
