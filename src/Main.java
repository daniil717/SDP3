public class Main {
    public static void main(String[] args) {
        Exercise task1 = new Exercise("Low priority task", 1);
        Exercise task2 = new Exercise("Medium priority task", 2);
        Exercise task3 = new Exercise("High priority task", 3);

        ExerciseCollection ExerciseCollection = new ExerciseCollection();
        ExerciseCollection.addExercise(task1);
        ExerciseCollection.addExercise(task2);
        ExerciseCollection.addExercise(task3);

        ExerciseMediator mediator = new ExerciseMediator();
        for (Exercise task : ExerciseCollection) {
            mediator.processExercise(task);
        }

        for (Exercise task : ExerciseCollection) {
            mediator.executeExercise(task);
        }
    }
}
