package Registry;

import Data.Animal;

import java.util.ArrayList;
import java.util.List;

public class AnimalRepository {
    private List<Animal> animals;

    public AnimalRepository() {
        this.animals = new ArrayList<Animal>();
    }

    public List<Animal> getAll() {
        return animals;
    }

    public Animal getById(int id) {
        if(id >= 0 && id < animals.size()) {
            return animals.get(id);
        }
        return null;
    }

    public void add(Animal animal) {
        animals.add(animal);

    }

    public void delete(Animal animal) {
        animals.remove(animal);
    }
}