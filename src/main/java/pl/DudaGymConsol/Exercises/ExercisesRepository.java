package pl.DudaGymConsol.Exercises;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import pl.DudaGymConsol.Profile.Profile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExercisesRepository {

    List<Exercises> exercisesList = new ArrayList<>();

    Exercises createNewExercises(String name, int set, int reps, int weight){
        Exercises newExercises = new Exercises(name,set,reps,weight);
        this.exercisesList.add(newExercises);
        System.out.println("Utworzyłem nowe ćwiczenie: "+newExercises.getName());
        return newExercises;
    }

    void readAllExercises(){
        Gson gson = new Gson();
        try {
            FileReader fileReader = new FileReader("./exercises.json");
            List<Exercises> loadedExercises = gson.fromJson(fileReader, new TypeToken<List<Exercises>>() {
            }.getType());
            this.exercisesList.addAll(loadedExercises);
            this.exercisesList.forEach(exercises -> {
                System.out.println("Załadowano ćwiczenia: " + exercises.getName() );
            });
        } catch (FileNotFoundException e) {
            System.out.println("Problem");
        }
    }
    void saveAllExercises() throws IOException {
        Gson gson = new Gson();
        FileWriter fileWriter = new FileWriter("./exercises.json");
        gson.toJson(this.exercisesList, fileWriter);
        fileWriter.flush();
        fileWriter.close();
    }
}
