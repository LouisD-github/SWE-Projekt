public class TaskManager {
    private Task[] tasks;
    private int taskCount;

    public TaskManager() {
        this.tasks = new Task[99];
        this.taskCount = 0;
    }

    public void addTask(String description) {
        tasks[taskCount] = new Task(taskCount + 1, description);
        taskCount++;
    }

    public void showTasks() {
        for (int i = 0; i < taskCount; i++) {
            System.out.println(tasks[i]);
        }
    }

    public void markTaskAsCompleted(int taskId) {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].getId() == taskId) {
                tasks[i].markCompleted();
                break;
            }
        }
    }

    public void showCompletedTasks() {
        for (int i = 0; i < taskCount; i++) {
            if (tasks[i].isCompleted()) {
                System.out.println(tasks[i]);
            }
        }
    }
}