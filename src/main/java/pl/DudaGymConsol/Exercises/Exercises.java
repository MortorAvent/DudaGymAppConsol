package pl.DudaGymConsol.Exercises;

public class Exercises {
    String name;
    int set;
    int reps;
    int weight;

    public Exercises(String name, int set, int reps, int weight) {
        this.name = name;
        this.set = set;
        this.reps = reps;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getSet() {
        return set;
    }

    public int getReps() {
        return reps;
    }

    public int getWeight() {
        return weight;

    }

}
