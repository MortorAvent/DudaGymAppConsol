package pl.DudaGymConsol.GUI;


import pl.DudaGymConsol.Exercises.DeadLiftService;
import pl.DudaGymConsol.Exercises.Exercises;
import pl.DudaGymConsol.Exercises.TrainingPlanService;

import java.util.Scanner;

public class ViewProfileManagement {
    Scanner scanner = new Scanner(System.in);
    TrainingPlanService trainingPlanService = new TrainingPlanService();
    DeadLiftService deadLiftService = new DeadLiftService();

    public void ViewProfileManagement(){

        boolean continueLoops = true;

        while (continueLoops) {
            System.out.println("1. Stwórz plan treningowy");
            System.out.println("2. Wyświetl ćwiczenia");
            System.out.println("3. Wyświetl Mój Plan");
            System.out.println("0. Wstecz");

            int chooseOption = scanner.nextInt();

            switch(chooseOption){
                case 1 -> trainingPlanService.addExercisesToList();
                case 2 -> System.out.println("Wyświetl ćwiczenia");
                case 3 -> trainingPlanService.displayTrainingPlan();
                case 0 -> continueLoops = false;

            }
        }


    }
}
