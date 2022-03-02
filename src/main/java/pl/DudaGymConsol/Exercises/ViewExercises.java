package pl.DudaGymConsol.Exercises;

import pl.DudaGymConsol.Exercises.DeadLift.DeadLiftService;
import pl.DudaGymConsol.Exercises.Squad.SquadService;

import java.util.Scanner;

public class ViewExercises {
  Scanner scanner = new Scanner(System.in);
  DeadLiftService deadLiftService =  new DeadLiftService();
  SquadService squadService = new SquadService();




  public void ViewExercises(){
    boolean continueLoops = true;
    while(continueLoops) {
      System.out.println("Wybierz ćwiczenie: ");
      System.out.println("1. Martwy Ciąg");
      System.out.println("2. Przysiad");
      System.out.println("0. Wstecz");

      int chooseOption = scanner.nextInt();

      switch (chooseOption){

        case 1 -> deadLiftService.addExercises();
        case 2 -> squadService.addExercises();
        case 0 -> continueLoops = false;

      }
    }
  }
}
