import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        System.out.println("Hello in 'To Do List'");
        System.out.println("Insert in format: operation;name;deadline;priority");
        System.out.println("If u want exit type 'end': ");

        ToDoListProject toDoList = new ToDoListProject();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String command = scanner.nextLine();
            if (command.equals("end")) break;
            String[] split = command.split(";");
            String operation = split[0];
            switch (operation) {
                case "new" -> toDoList.add(split);
                case "edit" -> toDoList.edit(split);
                case "delete" -> toDoList.delete(split[1]);
                case "read_all" -> toDoList.read_all();
                case "deadline_count" -> toDoList.deadline_count();
            }
        }
    }
}
