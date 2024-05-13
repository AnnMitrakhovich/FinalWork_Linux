package Controller;

import Data.*;
import Registry.AnimalRepository;
import View.AnimalView;

import java.util.List;

public class AnimalController {
    private static AnimalRepository animalRepository;


    public AnimalController(AnimalRepository animalRepository) {

        this.animalRepository = animalRepository;

    }

    public static void start() throws Exception {
        AnimalView.run();
    }

    public void addCat(int id, String name, String birthday) {
        Cat cat = new Cat(id, name, birthday);
        animalRepository.add(cat);
    }

    public void addDog(int id, String name, String birthday) {
        Dog dog = new Dog(id, name, birthday);
        animalRepository.add(dog);
    }

    public void addHamster(int id, String name, String birthday) {
        Hamster hamster = new Hamster(id, name, birthday);
        animalRepository.add(hamster);
    }

    public void addHorse(int id, String name, String birthday) {
        Horse horse = new Horse(id, name, birthday);
        animalRepository.add(horse);
    }

    public void addDonkey(int id, String name, String birthday) {
        Donkey donkey = new Donkey(id, name, birthday);
        animalRepository.add(donkey);
    }

    public void addCamel(int id, String name, String birthday) {
        Camel camel = new Camel(id, name, birthday);
        animalRepository.add(camel);
    }

    public List<Animal> getAll() {
        return animalRepository.getAll();
    }

    public Animal getAnimal(int id) {
        return searchForID(id);
    }

    public void addCommand(int id, String command) { // добавляем команду
        Animal item = searchForID(id);
        item.addCommand(command);
    }

    public Animal searchForID(int id) {  //поиск по id
        for (Animal animal: animalRepository.getAll()             ) {
           if (animal.getId() == id)
               return animal;
        }

        return null;
    }

    public String getCommands(int id) {
        return searchForID(id).getAnimalCommands();
    }

    public void deleteAnimal(int id) {
        animalRepository.delete(searchForID(id));
    }
}
