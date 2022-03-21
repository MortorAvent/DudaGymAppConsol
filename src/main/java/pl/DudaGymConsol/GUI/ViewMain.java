package pl.DudaGymConsol.GUI;

import pl.DudaGymConsol.Exercises.ExercisesService;
import pl.DudaGymConsol.Profile.ProfileService;

import java.util.Scanner;

public class ViewMain {
    ProfileService profileService = new ProfileService();
    ExercisesService exercisesService = new ExercisesService();
    Scanner scanner = new Scanner(System.in);


    public ViewMain() {
        this.profileService.readAll();
        this.exercisesService.readAllExercises();
        System.out.println("Wybierz Opcję: ");

        boolean continueLoops = true;

        while (continueLoops) {

            System.out.println("1. Wybierz profil");
            System.out.println("2. Dodaj Profil");
            System.out.println("3. Usuń Profil");
            System.out.println("4. Wyświetl informacje o profilach");
            System.out.println("0. Wyjście");

            int chooseOption = scanner.nextInt();
            switch (chooseOption) {
                case 1 -> profileService.displayChooseProfiles();
                case 2 -> profileService.addProfile();
                case 3 -> profileService.deleteProfile();
                case 4 -> profileService.displayProfiles();
                case 0 -> {
                    System.out.println("Zapisuje dane");
                    this.profileService.saveAll();
                    System.out.println("Kończe działanie programu. Do zobaczenia !");
                    continueLoops = false;
                }
            }
        }
    }
}
