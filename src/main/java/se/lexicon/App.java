package se.lexicon;


import java.time.LocalDate;

public class App {
    public static void main(String[] args) {

        Person person1 = new Person("John", "Land", "john@gmail.com");
        String personDetails1 = person1.getSummary();
        System.out.println(personDetails1);

        Person person2 = new Person("David", "Mark", "david@gmail.com");
        String personDetails2 = person2.getSummary();
        System.out.println(personDetails2);

        Person person3 = new Person("George", "Lund", "george@gmail.com");
        String personDetails3 = person2.getSummary();
        System.out.println(personDetails3);

        System.out.println("----------------------------------");

        TodoItem todoItem1 = new TodoItem("Change Tires", "Preferrable to use MRF brand",
                        LocalDate.of(2024, 2, 10), false, person1);

        TodoItemTask todoItemTask1 = new TodoItemTask(todoItem1, person1);
        String todoItemTaskDetails1 = todoItemTask1.getSummary();
        System.out.println(todoItemTaskDetails1);

        System.out.println();

        TodoItem todoItem2 = new TodoItem("Check oil", "Check brakes",
                        LocalDate.of(2024, 4, 2), false, person2);

        TodoItemTask todoItemTask2 = new TodoItemTask(todoItem2, person2);
        String todoItemTaskDetails2 = todoItemTask2.getSummary();
        System.out.println(todoItemTaskDetails2);

        System.out.println();

        TodoItemTask todoItemTask3 = new TodoItemTask(todoItem2, person3);
        String todoItemTaskDetails3 = todoItemTask3.getSummary();
        System.out.println(todoItemTaskDetails3);

        System.out.println();





    }
}
