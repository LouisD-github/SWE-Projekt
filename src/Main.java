
public class Main {

	public static void main(String[] args) {

        TaskManager manager = new TaskManager();
        manager.addTask("Learn Java");
        manager.addTask("Write Code");
        manager.addTask("Learn JVScript");
        manager.showTasks();

        manager.markTaskAsCompleted(1);
        manager.showCompletedTasks();
	}

}
