public class LowHandler extends Handler {
    @Override
    public void handleExercise(Exercise exercise) {
        if (exercise.getPriority() == 1) {
            System.out.println("Processing low-priority exercise: " + exercise.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleExercise(exercise);
        }
    }
}
