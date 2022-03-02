package pl.DudaGymConsol.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquadService {
    List<Squad> squadProperites = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);



    public void addSquad(){
        String name = "Przysiad";
        System.out.println(name);
        System.out.println("Podaj ilość serii: ");
        int set = scanner.nextInt();
        System.out.println("Podaj ilość powtórzeń: ");
        int reps = scanner.nextInt();
        System.out.println("Podaj ciężar: ");
        int weight = scanner.nextInt();

        Squad squad = new Squad(name,set,reps,weight);
        squadProperites.add(squad);
        System.out.println("Dodałeś ćwiczenie !");

    }
}

