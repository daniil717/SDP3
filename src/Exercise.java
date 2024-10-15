public class Exercise {
    private String description;
    private int priority;

    public Exercise(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }
    public int getPriority() {
        return priority;
    }
    public String getDescription() {
        return description;
    }
}
