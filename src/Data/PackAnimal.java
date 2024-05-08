package Data;

import Data.Animal;

public class PackAnimal extends Animal {
    public PackAnimal(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Pack Animal: " + super.getName();
    }
}
