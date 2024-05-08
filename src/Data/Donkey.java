package Data;

public class Donkey extends PackAnimal{
    public Donkey(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Donkey " + super.getName();
    }
}
