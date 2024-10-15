import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExerciseCollection implements Iterable<Exercise> {
    private List<Exercise> exercises = new ArrayList<>();

    public void addExercise(Exercise exercise) {
        exercises.add(exercise);
    }
    @Override
    public Iterator<Exercise> iterator() {
        return exercises.iterator();
    }
}
