package pl.DudaGymConsol.Exercises;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

public class TrainingPlanService {
    String namePlan;
    ArrayList namePlanList = new ArrayList();
    DeadLiftService deadLiftService = new DeadLiftService();
    Scanner scanner = new Scanner(System.in);
    Exercises exercises = new Exercises();


    public void addToListExercises() {
        System.out.println("Nazwij swój plan:");
        namePlan = scanner.nextLine();
        exercises.Exercises();

    }

    public void displayTrainingPlan(){
        System.out.println(namePlan);
    }

}
