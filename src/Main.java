import Controller.AnimalController;
import Data.*;
import Registry.AnimalRepository;
import View.AnimalView;


import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        AnimalRepository myFarm = new AnimalRepository();
        AnimalController animalController = new AnimalController(myFarm);
        AnimalView viewAnimal = new AnimalView(animalController);
        animalController.start();

    }
}