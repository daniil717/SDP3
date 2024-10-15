public class ExerciseMediator {
    private Handler lowHandler;
    private Handler mediumHandler;
    private Handler highHandler;

    public ExerciseMediator() {
        lowHandler = new LowHandler();
        mediumHandler = new MediumHandler();
        highHandler = new HighHandler();

        lowHandler.setNextHandler(mediumHandler);
        mediumHandler.setNextHandler(highHandler);
    }
    public void processExercise(Exercise exercise) {
        lowHandler.handleExercise(exercise);
    }
    public void executeExercise(Exercise exercise) {
        SpecificCommand command = new SpecificCommand(exercise);
        Invoker invoker = new Invoker();
        invoker.setCommand(command);
        invoker.executeCommand();
    }
}
