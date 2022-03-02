package pl.DudaGymConsol.Exercises;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainingPlanService {
    String namePlan;
    List<String> namePlanList = new ArrayList();
    Scanner scanner = new Scanner(System.in);
    Exercises exercises = new Exercises();



    public void addPlanToList(){
        namePlanList.add(namePlan);
    }

    public void addExercisesToList() {
        System.out.println("Nazwij swój plan:");
        namePlan = scanner.nextLine();

        exercises.Exercises();
        addPlanToList();
    }

    public void displayTrainingPlan(){
        for(String namePlans: namePlanList){
            System.out.println(namePlans);
        }
    }


}
