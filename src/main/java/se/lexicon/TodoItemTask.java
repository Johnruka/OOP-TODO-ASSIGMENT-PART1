package se.lexicon;

public class TodoItemTask {

    private int id;
    private boolean assigned;
    private TodoItem todoItem;
    private Person assignee;

    public TodoItemTask(TodoItem todoItem, Person assignee) {
        setTodoItem(todoItem);
        setAssignee(assignee);
    }

    public TodoItemTask(TodoItem todoItem) {
        setTodoItem(todoItem);
    }

    public TodoItemTask(int id, TodoItem todoItem, Person assignee) {
        this(todoItem, assignee);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned() {
        return assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("todoItem is null");
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
        this.assigned = (this.assignee != null);
    }

    public String getSummary() {
        String todoItemTaskSummary = "TodoItemTask ID: " + getId() + " Assigned: " + String.valueOf(isAssigned()).toUpperCase() + " " +
                getTodoItem().getSummary();
        if(isAssigned()) {
            String isOverdue;
            if(todoItem.isDone()) {
                isOverdue = "Todo Item was FINISHED by the ";
            } else if(todoItem.isOverdue()) {
                isOverdue = "Todo Item is OVERDUE on the ";
            } else {
                isOverdue = "Todo Item is NOT OVERDUE and needs to be completed before deadline by the ";
            }
            todoItemTaskSummary += isOverdue + "Assigned Person: " + getAssignee().getSummary();
        } else {
            todoItemTaskSummary += "Not assigned to anyone";
        }
        return todoItemTaskSummary;
    }
}
