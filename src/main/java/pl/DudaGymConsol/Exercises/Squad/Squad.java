package pl.DudaGymConsol.Exercises.Squad;

public class Squad {
    private String name;
    private int set;
    private int reps;
    private int weight;


    public Squad(String name, int set, int reps, int weight) {
        this.name = name;
        this.set = set;
        this.reps = reps;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public void displaySquadPropertites() {
        System.out.println(name);
        System.out.println("Serie: " + set);
        System.out.println("Powtórzenia: " + reps);
        System.out.println("Ciężar: " + weight);
    }

}
