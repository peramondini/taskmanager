import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private List<Task> tasks;

    public TaskManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description, String status){
        Task newTask = new Task(description, status);
        tasks.add(newTask);
    }

    public void removeTask(int index){
        if (index >= 0 && index < tasks.size()){
            tasks.remove(index);
        } else{
            System.out.println("Invalid task index");
        }
    }

    public void displayTasks(){
        if (tasks.isEmpty()){
            System.out.println("No tasks available");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                System.out.println(tasks.get(i));
            }
        }
    }
}
