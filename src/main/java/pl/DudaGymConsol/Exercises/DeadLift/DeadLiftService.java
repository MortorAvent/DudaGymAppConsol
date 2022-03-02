package pl.DudaGymConsol.Exercises.DeadLift;

import pl.DudaGymConsol.Exercises.Exercises;
import pl.DudaGymConsol.Exercises.Squad.Squad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DeadLiftService implements Exercises {
    List<DeadLift> deadLiftPropertise = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void addExercises() {
        String name = "Martwy Ciąg";
        System.out.println(name);
        System.out.println("Podaj ilość serii");
        int set = scanner.nextInt();
        System.out.println("Podaj ilość powtórzeń");
        int reps = scanner.nextInt();
        System.out.println("Podaj ciężar");
        int weight = scanner.nextInt();

        DeadLift deadLift = new DeadLift(name, set, reps, weight);
        deadLiftPropertise.add(deadLift);
        System.out.println("Dodałeś ćwiczenie !");
    }

    @Override
    public void listExercises() {
        for (DeadLift list : deadLiftPropertise) {
            System.out.println(list.getName());

        }
    }
}
