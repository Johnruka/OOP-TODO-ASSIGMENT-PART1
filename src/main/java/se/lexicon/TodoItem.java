package se.lexicon;

import java.time.LocalDate;

public class TodoItem {

    private int id;
    private String title;
    private String description;
    private LocalDate deadLine;
    private boolean done;
    private Person creator;

    public TodoItem(int id, String title, String description, LocalDate deadLine, boolean done, Person creator) {
        this(title, description, deadLine, done, creator);
        this.id = id;
    }

    public TodoItem(String title, String description, LocalDate deadLine, boolean done, Person creator) {
        setTitle(title);
        setDescription(description);
        setDeadLine(deadLine);
        setDone(done);
        setCreator(creator);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.trim().isEmpty()) throw new IllegalArgumentException("title is null or empty.");
        this.title = title;
    }

    public String getTaskDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        if (deadLine == null) throw new IllegalArgumentException("deadLine is null.");
        this.deadLine = deadLine;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        if (creator == null) throw new IllegalArgumentException("creator is null.");
        this.creator = creator;
    }

    public boolean isOverdue() {
        return LocalDate.now().isAfter(deadLine);
    }

    public String getSummary() {
        String todoItemSummary = "TodoItem ID: " + getId() + " Title: " + getTitle() + " Description: " + getTaskDescription() +
                " Deadline: " + getDeadLine() + "\nCreator Details: ";
        if(getCreator() != null) {
            todoItemSummary += getCreator().getSummary() + "\n";
        } else {
            todoItemSummary += "Creator Detail is not present\n";
        }
        return todoItemSummary;
    }
}
