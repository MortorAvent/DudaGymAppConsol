package pl.DudaGymConsol.Exercises;

import java.util.ArrayList;
import java.util.List;

public class ExercisesRepository {

    List<Exercises> exercisesList = new ArrayList<>();

    Exercises createNewExercises(String name, int set, int reps, int weight){
        Exercises newExercises = new Exercises(name,set,reps,weight);
        this.exercisesList.add(newExercises);
        System.out.println("Utworzyłem nowe ćwiczenie: "+name);
        return newExercises;
    }
}
