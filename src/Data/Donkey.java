package Data;

public class Donkey extends PackAnimal{
    public Donkey(int id, String name, String birthday) {
        super(id, name, birthday);
    }

    @Override
    public String getName() {
        return "Donkey " + super.getName();
    }
}
