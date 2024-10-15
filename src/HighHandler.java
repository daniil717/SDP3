public class HighHandler extends Handler {
    @Override
    public void handleExercise(Exercise exercise) {
        if (exercise.getPriority() == 3) {
            System.out.println("Processing high-priority exercise: " + exercise.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleExercise(exercise);
        }
    }
}
