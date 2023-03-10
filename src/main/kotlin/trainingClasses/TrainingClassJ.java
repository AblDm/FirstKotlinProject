package trainingClasses;

public class TrainingClassJ {
    private final String name;
    private final Boolean isPassed;

    public TrainingClassJ(String name, Boolean isPassed) {
        this.name = name;
        this.isPassed = isPassed;
    }

    public String getName() {
        return name;
    }

    public Boolean getPassed() {
        return isPassed;
    }
}
