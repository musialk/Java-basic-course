import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ToDoListProject {

    List<ToDoItemProject> toDoItemProjects = new ArrayList<>();

    void add(String[] args) {
        ToDoItemProject toDoItemProject = createToDoItem(args);
        toDoItemProjects.add(toDoItemProject);
        System.out.println("Add task: " + toDoItemProject.name);
    }
    void edit(String[] args) {
        ToDoItemProject toDoItemProject = createToDoItem(args);
        int indeks = findIndeks(args[1]);
        if (indeks < 0) {
            System.out.println("Given wrong name");
            return;
        }
        toDoItemProjects.set(indeks, toDoItemProject);
        System.out.println("Task update: " + toDoItemProject.name);
    }
    void delete(String name) {
        int indeks = findIndeks(name);
        if (indeks < 0) {
            System.out.println("Given wrong name");
            return;
        }
        toDoItemProjects.remove(indeks);
        System.out.println("Element delete: " + name);
    }
    void read_all(){
        System.out.println("All task: ");
        for (ToDoItemProject toDoItemProject : toDoItemProjects) {
            System.out.println(toDoItemProject);
        }
    }
    void deadline_count() {
        Map<LocalDate, Integer> deadline_count = new HashMap<>();
        for (ToDoItemProject toDoItemProject : toDoItemProjects)
            if (deadline_count.get(toDoItemProject.deadline) == null) {
                deadline_count.put(toDoItemProject.deadline, 1);
            } else {
                int oldCounter = deadline_count.get(toDoItemProject.deadline);
                deadline_count.put(toDoItemProject.deadline, oldCounter + 1);
            }
        for (Map.Entry<LocalDate, Integer> entry : deadline_count.entrySet()) {
            System.out.println("Deadline: [" + entry.getKey() + "], has: [" + entry.getValue() + "] items");
        }
    }
    ToDoItemProject createToDoItem(String[] input) {
        return new ToDoItemProject(input[1], LocalDate.parse(input[2]), Integer.parseInt(input[3]));
    }

    int findIndeks(String name) {
        int expectedIndeks = -1;
        for (int i = 0; i < toDoItemProjects.size(); i++) {
            if (toDoItemProjects.get(i).name.equals(name)) {
                expectedIndeks = i;
                break;
            }
        }
        return expectedIndeks;
    }
}
