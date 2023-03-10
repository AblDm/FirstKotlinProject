package trainingClasses;

public class Main {
    public static void main(String[] args) {

        Example ex;
        ex = ((x, y) -> x+y);

        int result = ex.calculate(5,190);
        System.out.println(result);
        /**
         * Тренировка классы в котлин
         */
        TrainingClassK trainingClassK = new TrainingClassK("Тренировка", true);
        TrainingClassJ trainingClassJ = new TrainingClassJ("Тренировка", true);

        System.out.println(trainingClassK.getName().toLowerCase());
        System.out.println(trainingClassK.isPassed());

        System.out.println(trainingClassJ.getName().toLowerCase());
        System.out.println(trainingClassJ.getPassed());



    }

}
interface Example {
    int calculate(int x, int y);
}