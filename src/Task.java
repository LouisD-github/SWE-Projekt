/**
 * @author Arek, Niklas Louis
 * @vesion 1.0
 */

public class Task {
    private int id;
    private String description;
    private boolean completed;
    
/**
 * 
 * @param id Eindeutige Kennung einer Task
 * @param description Beschreibung der Task
 * @param completed Zustand der Task (erledigt oder nicht erledigt)
 * 
 */
    public Task(int id, String description) {
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void markCompleted() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task: id: " + id + ", description: '" + description + "', completed: " + completed;
    }
}