package Data;

public class Hamster extends Pet{
    public Hamster(int id, String name, String birthday) {
        super(id, name, birthday);
    }

    @Override
    public String getName() {
        return "Hamster " + super.getName();
    }
}
