package View;

import Data.Animal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataBase {
    public List<Animal> animals = new ArrayList<>();

    public void createDatabase(Animal animal, String command) {
        // Запись данных в базу данных
        try (FileWriter writer = new FileWriter("DataBase.csv", true)) {
            String animalType = String.valueOf(animal.getClass());
            String animalName = animal.getName();
            String line = animalType + "," + animalName + "," + command + "\n";
            writer.write(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readDatabase() {
        // Создание файла базы данных, если он не существует
        File databaseFile = new File("DataBase.csv");
        if (!databaseFile.exists()) {
            try {
                databaseFile.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Чтение данных из базы данных
        try (BufferedReader reader = new BufferedReader(new FileReader(databaseFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 2) {
                    String animalName = data[0];
                    String command = data[1];
                    Animal animal = animals.stream().filter(a -> a.getName().equals(animalName)).findFirst().orElse(null);
                    if (animal != null) {
                       animal.getAnimalCommands();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
