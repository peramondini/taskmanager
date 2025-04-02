import java.util.Scanner;

public class TaskManagerApp {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\nTask manager menu:");
            System.out.println("1- Add task");
            System.out.println("2- View tasks");
            System.out.println("3- Remove task");
            System.out.println("4- Exit");
            System.out.println("5- Enter your choice: ");
            choice = scanner.nextLine();

            switch (choice){
                case "1":
                    System.out.println("Enter task descriptiom");
                    String description = scanner.nextLine();
                    System.out.println("Enter task status Pending/Completed: ");
                    String status = scanner.nextLine();
                    taskManager.addTask(description,status);
                    break;

                case "2":
                    taskManager.displayTasks();
                    break;
                case "3":
                    System.out.println("Enter text index to remove: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    taskManager.removeTask(index);
                    break;
                case "4":
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");

            }
        }while (!choice.equals("4"));
        scanner.close();
    }
}

