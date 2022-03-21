package pl.DudaGymConsol.GUI;

import com.google.gson.internal.bind.util.ISO8601Utils;
import pl.DudaGymConsol.Exercises.ExercisesService;

import java.util.Scanner;

public class ViewProfileManagement {
        Scanner scanner = new Scanner(System.in);
        ExercisesService exercisesService = new ExercisesService();

    public void ViewProfileManagement() {

        boolean continueLoops = true;

        while (continueLoops) {
            System.out.println("1. Dodaj ćwiczenie");
            System.out.println("2. Wyświetl ćwiczenia");
            System.out.println("3. Usuń ćwiczenie");
            System.out.println("0. Wstecz");

            int chooseOption = scanner.nextInt();

            switch (chooseOption) {
                case 1 -> exercisesService.addExercises();
                case 2 -> exercisesService.displayExercises();
                case 3 -> System.out.println("Delete");
                case 0 -> {
                    this.exercisesService.saveAllExercises();
                    System.out.println("Zapisuje dane.");
                    continueLoops = false;
                }

            }
        }


    }
}
