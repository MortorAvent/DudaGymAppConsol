package pl.DudaGymConsol.Profile;

import pl.DudaGymConsol.GUI.ViewProfileManagement;

import java.io.IOException;

import java.util.Scanner;

public class ProfileService {

    private final Scanner scanner = new Scanner(System.in);
    private final ViewProfileManagement viewProfileManagement = new ViewProfileManagement();
    ProfileRepository repository = new ProfileRepository();


    public void addProfile() {

        System.out.println("Podaj imię: ");
        String name = scanner.nextLine();

        System.out.println("Podaj nazwisko: ");
        String surname = scanner.nextLine();

        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();

        System.out.println("Podaj wagę: ");
        int weight = scanner.nextInt();

        System.out.println("Podaj wzrost: ");
        int height = scanner.nextInt();

        repository.createNewProfile(name, surname,age, weight,height);
    }

    public void deleteProfile(){
        int j = 1;
        int i = 1;
        boolean continueLoops = true;

        System.out.println("Wybierz profil do usunięcia");


        while (continueLoops) {
            for (Profile profiles : repository.profiles) {
                System.out.print(j + ". ");
                System.out.println(profiles.getName() + " " + profiles.getSurname());
                j++;
            }
            System.out.println("0. Wstecz");
            int chooseOption = scanner.nextInt();
            switch (chooseOption) {
                case 1 ->{
                    repository.profiles.remove(0);
                    continueLoops = false;
                }
                case 2 -> {
                    repository.profiles.remove(1);
                    continueLoops = false;
                }
                case 3 -> {
                    repository.profiles.remove(2);
                    continueLoops = false;
                }

                case 0 -> continueLoops = false;
            }
        }

    }


    public void displayChooseProfiles() {
        boolean continueLoops = true;
        while (continueLoops) {

            System.out.println("Wybierz Profil: ");
            int j = 1;
            for (Profile profiles : repository.profiles) {
                System.out.print(j + ". ");
                j++;
                System.out.println(profiles.getName() + " " + profiles.getSurname());
            }
            System.out.println("0. Wstecz");
            int chooseOption = scanner.nextInt();

            switch (chooseOption) {
                case 1, 2, 3, 4, 5 -> viewProfileManagement.ViewProfileManagement();
                case 0 -> continueLoops = false;
            }
        }
    }

    public void displayProfiles() {
        for (Profile profiles : repository.profiles) {
            profiles.displayProfileInfo();
        }


    }
    public void readAll(){
        this.repository.readAll();

    }
    public void saveAll(){
        try {
            this.repository.saveAll();
        } catch (IOException e) {
            System.out.println("Problem");
        }
    }
}
