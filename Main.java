import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList();
        boolean running = true;

        while (running) {
            System.out.println("\nTo-Do List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Delete Task");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 2:
                    toDoList.viewTasks();
                    break;
                case 3:
                    toDoList.viewTasks();
                    System.out.print("Enter task index to mark as completed: ");
                    int completeIndex = scanner.nextInt();
                    toDoList.markTaskAsCompleted(completeIndex);
                    break;
                case 4:
                    toDoList.viewTasks();
                    System.out.print("Enter task index to delete: ");
                    int deleteIndex = scanner.nextInt();
                    toDoList.deleteTask(deleteIndex);
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
