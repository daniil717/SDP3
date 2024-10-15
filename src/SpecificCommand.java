public class SpecificCommand implements Command {
    private Exercise exercise;

    public SpecificCommand(Exercise exercise) {
        this.exercise = exercise;
    }
    @Override
    public void execute() {
        System.out.println("Executing exercise: " + exercise.getDescription());
    }
}
