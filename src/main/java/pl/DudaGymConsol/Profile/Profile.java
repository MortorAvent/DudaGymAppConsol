package pl.DudaGymConsol.Profile;

public class Profile {
    private String name;
    private String surname;
    private int age;
    private double weight;
    private int height;

    public Profile(String name, String surname, int age, double weight, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getSurname() {
        return surname;
    }

//    public void setSurname(String surname) {
//        this.surname = surname;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public double getWeight() {
//        return weight;
//    }
//
//    public void setWeight(double weight) {
//        this.weight = weight;
//    }
//
//    public int getHeight() {
//        return height;
//    }
//
//    public void setHeight(int height) {
//        this.height = height;
//    }

    public void displayProfileInfo() {
        System.out.println("Imię: " + name + ", Nazwisko: " + surname + ", Wiek: " + age + ", Waga: " + weight + " kg" + ", Wzrost: " + height + " cm");
    }
}
