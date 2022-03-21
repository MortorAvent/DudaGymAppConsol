package pl.DudaGymConsol.Exercises;

import java.io.IOException;
import java.util.Scanner;

public class ExercisesService {

    Scanner scanner = new Scanner(System.in);
    ExercisesRepository exercisesRepository = new ExercisesRepository();

    public void addExercises() {


        System.out.println("Podaj nazwę ćwiczenia: ");
        String name = scanner.nextLine();
        System.out.println("Podaj ilość serii");
        int set = scanner.nextInt();
        System.out.println("Podaj ilość powtórzeń: ");
        int reps = scanner.nextInt();
        System.out.println("Podaj cieżar: ");
        int weight = scanner.nextInt();

        exercisesRepository.createNewExercises(name, set, reps, weight);

    }
    public void displayExercises(){
        System.out.println("Nazwa | Ilość serii | Ilość powtórzeń | Ciężar");
        for(Exercises exercises: exercisesRepository.exercisesList) {
            System.out.println(exercises.getName() + " | " + exercises.getSet()+ " | "+ exercises.getReps() + " | " + exercises.getWeight());

        }
   }
    public void readAllExercises(){
        this.exercisesRepository.readAllExercises();

    }
    public void saveAllExercises(){
        try {
            this.exercisesRepository.saveAllExercises();
        } catch (IOException e) {
            System.out.println("Problem");
        }
    }
}
