package pl.DudaGymConsol.Exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercises {
  Scanner scanner = new Scanner(System.in);
  DeadLiftService deadLiftService =  new DeadLiftService();
  SquadService squadService = new SquadService();




  public void Exercises(){
    boolean continueLoops = true;
    while(continueLoops) {
      System.out.println("Wybierz ćwiczenie: ");
      System.out.println("1. Martwy Ciąg");
      System.out.println("2. Przysiad");
      System.out.println("0. Wstecz");

      int chooseOption = scanner.nextInt();

      switch (chooseOption){

        case 1 -> deadLiftService.addDeadLift();
        case 2 -> squadService.addSquad();
        case 0 -> continueLoops = false;

      }
    }
  }
}
