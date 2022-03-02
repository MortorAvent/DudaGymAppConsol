package pl.DudaGymConsol.Exercises.TrainingPlan;

import pl.DudaGymConsol.Exercises.ViewExercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainingPlanService {
    List<TrainingPlan> namePlanList = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    ViewExercises exercises = new ViewExercises();



    public void addPlanToList(){
        System.out.println("Nazwij swój plan:");
        String name = scanner.nextLine();
        TrainingPlan trainingPlan = new TrainingPlan(name);
        namePlanList.add(trainingPlan);

    }

    public void addExercisesToPlan() {
        exercises.ViewExercises();
    }

    public void displayTrainingPlan(){
        for(TrainingPlan namePlans: namePlanList){
            System.out.println(namePlans.name);
        }
    }


}
