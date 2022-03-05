package pl.DudaGymConsol.GUI;

import pl.DudaGymConsol.Exercises.ExercisesService;

import java.util.Scanner;

public class ViewProfileManagement {
        Scanner scanner = new Scanner(System.in);
        ExercisesService exercisesService = new ExercisesService();

    public void ViewProfileManagement() {

        boolean continueLoops = true;

        while (continueLoops) {
            System.out.println("1. Stwórz plan treningowy");
            System.out.println("2. Wyświetl Mój Plan");
            System.out.println("0. Wstecz");

            int chooseOption = scanner.nextInt();

            switch (chooseOption) {
                case 1 -> exercisesService.addExercises();
                case 2 -> exercisesService.displayExercises();
                case 0 -> continueLoops = false;

            }
        }


    }
}
