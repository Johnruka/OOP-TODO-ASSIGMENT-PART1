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
        String todoItemTaskDetails = todoItemTask1.getSummary();
        System.out.println(todoItemTaskDetails);

        System.out.println();




    }
}
