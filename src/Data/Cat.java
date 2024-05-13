package Data;

public class Cat extends Pet {
    public Cat(int id, String name, String birthday) {
        super(id, name, birthday);
    }

    @Override
    public String getName() {
        return "Cat " + super.getName();
    }
}
