package pl.DudaGymConsol.GUI;


import pl.DudaGymConsol.Exercises.DeadLift.DeadLiftService;
import pl.DudaGymConsol.Exercises.Squad.SquadService;
import pl.DudaGymConsol.Exercises.TrainingPlan.TrainingPlanService;

import java.util.Scanner;

public class ViewProfileManagement {
    Scanner scanner = new Scanner(System.in);
    TrainingPlanService trainingPlanService = new TrainingPlanService();
    DeadLiftService deadLiftService = new DeadLiftService();
    SquadService squadService = new SquadService();


    public void ViewProfileManagement(){

        boolean continueLoops = true;

        while (continueLoops) {
            System.out.println("1. Stwórz plan treningowy");
            System.out.println("2. Pokaż wszystkie ćwiczenia");
            System.out.println("3. Wyświetl Mój Plan");
            System.out.println("0. Wstecz");

            int chooseOption = scanner.nextInt();

            switch(chooseOption){
                case 1 -> {trainingPlanService.addPlanToList();
                    trainingPlanService.addExercisesToPlan();
                    }
                case 2 -> squadService.listExercises();
                case 3 -> trainingPlanService.displayTrainingPlan();
                case 0 -> continueLoops = false;

            }
        }


    }
}
