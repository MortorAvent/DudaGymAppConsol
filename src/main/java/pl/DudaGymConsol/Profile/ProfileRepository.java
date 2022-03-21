package pl.DudaGymConsol.Profile;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ProfileRepository {

    List<Profile> profiles = new ArrayList<>();

    Profile createNewProfile(String name, String surname, int age, double weight, int height) {

        Profile newProfile = new Profile(name, surname, age, weight, height);
        this.profiles.add(newProfile);
        System.out.println("Utworzyłem nowy profil: " + newProfile.getName() + " " + newProfile.getSurname());
        return newProfile;

    }


    void readAll() {
        Gson gson = new Gson();
        try {
            FileReader fileReader = new FileReader("./profiles.json");
            List<Profile> loadedProfiles = gson.fromJson(fileReader, new TypeToken<List<Profile>>() {
            }.getType());
            this.profiles.addAll(loadedProfiles);
            this.profiles.forEach(profile -> {
                System.out.println("Załadowano Profil: " + profile.getName() + " " + profile.getSurname());
            });
        } catch (FileNotFoundException e) {
            System.out.println("Problem");
        }


    }

    void saveAll() throws IOException {
        Gson gson = new Gson();
        FileWriter fileWriter = new FileWriter("./profiles.json");
        gson.toJson(this.profiles, fileWriter);
        fileWriter.flush();
        fileWriter.close();
    }

}
