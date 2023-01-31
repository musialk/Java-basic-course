import java.time.LocalDate;

class class_methods {
    public static void main(String[] args) {
        tasks tasks = new tasks();
        ToDoItem toDoItem1 = new ToDoItem("zadanie1", LocalDate.of(2020, 10, 4), 9);
        tasks.addToDoItem(0, toDoItem1);
        ToDoItem toDoItem2 = new ToDoItem("zadanie2", LocalDate.of(2020, 11, 3), 2);
        tasks.addToDoItem(1, toDoItem2);
        ToDoItem toDoItem3 = new ToDoItem("zadanie3", LocalDate.of(2020, 11, 8), 0);
        tasks.addToDoItem(2, toDoItem3);

        ToDoItem retrieved = tasks.getToDoItem(2);

        System.out.println(retrieved);

        ToDoItem[] todoitems = tasks.toDoItems;
        for (ToDoItem todoitem : todoitems) {
            System.out.println(todoitem);
        }
    }
}
