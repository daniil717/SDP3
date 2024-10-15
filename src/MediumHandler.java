public class MediumHandler extends Handler {
    @Override
    public void handleExercise(Exercise exercise) {
        if (exercise.getPriority() == 2) {
            System.out.println("Processing medium-priority exercise: " + exercise.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleExercise(exercise);
        }
    }
}
