/**
 * @author Arek, Niklas Louis
 * @vesion 1.0
 */

public class TaskManager {
    private Task[] tasks;
    private int taskCount;

    /**
     * 
     * @param Task[] Liste der Tasks
     * @param taskCount Anzahl der Task in der Liste
     * 
     */
    public TaskManager() {
        this.tasks = new Task[99];
        this.taskCount = 0;
    }

    public void addTask(String description) {
        tasks[taskCount] = new Task(taskCount + 1, description);
        taskCount++;
    }
    /**
     * Fügt Task in die Liste hinzu
     * @return
     */

    public void showTasks() {
        for (int i = 0; i < taskCount; i++) {
            System.out.println(tasks[i]);
        }
    }
    /**
     * Zeigt alle Task in der Liste an
     * @param taskId
     */

    public void markTaskAsCompleted(int taskId) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == taskId) {
                tasks[i].markCompleted();
                break;
            }
        }
    }
    /**
     * Setzt gewuenschte Task auf erledigt
     * @param taskId
     */

    public void showCompletedTasks() {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted()) {
                System.out.println(tasks[i]);
            }
        }
    }
    /**
     * Zeigt alle erledigten Task an
     * @return
     */
}