import java.time.LocalDate;

public class ToDoItem {
    String name;
    LocalDate deadline;
    int priority;

    ToDoItem(String name, LocalDate deadline, int priority) {
        this.name = name;
        this.deadline = deadline;
        this.priority = priority;
    }

    public String toString() {
        return "name: " + name + ", deadline: " + deadline + ", priority: " + priority;
    }
}
