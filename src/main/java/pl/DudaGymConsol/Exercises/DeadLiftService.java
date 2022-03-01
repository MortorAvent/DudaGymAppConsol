package pl.DudaGymConsol.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeadLiftService {
    List<DeadLift> deadLiftPropertise = new ArrayList<>();
    List<Exercises> ExercisesList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void addDeadLift(){
        
        String name = "Martwy Ciąg";
        System.out.println(name);
        System.out.println("Podaj ilość serii");
        int set = scanner.nextInt();
        System.out.println("Podaj ilość powtórzeń");
        int reps = scanner.nextInt();
        System.out.println("Podaj ciężar");
        int weight = scanner.nextInt();

        DeadLift deadLift = new DeadLift(name,set,reps,weight);
        deadLiftPropertise.add(deadLift);
        System.out.println("Dodałeś ćwiczenie !");

    }



}
