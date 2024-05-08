package Data;

import Data.Animal;

public class Pet extends Animal {
    public Pet(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return "Pet: " + super.getName();
    }
}
