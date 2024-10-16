import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a description for the low priority task: ");
        String lowDesc = scanner.nextLine();
        Exercise exercise1 = new Exercise(lowDesc, 1);

        System.out.print("Enter a description for the medium priority task: ");
        String mediumDesc = scanner.nextLine();
        Exercise exercise2 = new Exercise(mediumDesc, 2);

        System.out.print("Enter a description for the high priority task: ");
        String highDesc = scanner.nextLine();
        Exercise exercise3 = new Exercise(highDesc, 3);

        //Exercise collection
        ExerciseCollection exerciseCollection = new ExerciseCollection();
        exerciseCollection.addExercise(exercise1);
        exerciseCollection.addExercise(exercise2);
        exerciseCollection.addExercise(exercise3);

        //Chain of Responsibility
        ExerciseMediator mediator = new ExerciseMediator();
        for (Exercise exercise : exerciseCollection) {
            mediator.processExercise(exercise);
        }

        //Command pattern
        for (Exercise exercise : exerciseCollection) {
            mediator.executeExercise(exercise);
        }
        scanner.close();
    }
}
