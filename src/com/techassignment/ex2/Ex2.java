package com.techassignment.ex2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Ex2 {

    private static String FILE_NAME = "user.txt";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        User user = new User("firstName", "lastName", "userName");
        Task task = new Task( "Task title", "task description");
        Task task2 = new Task("Task title2", "task description2");


        List<Task> tasks = new ArrayList();
        tasks.add(task);
        tasks.add(task2);

        user.setTasks(tasks);


        saveUsers(user);
        getUser();
    }

    private static void getUser() throws IOException, ClassNotFoundException {
        // Reading the object from a file
        FileInputStream file = new FileInputStream(FILE_NAME);
        ObjectInputStream in = new ObjectInputStream(file);

        // Method for deserialization of object
        User newUser = (User) in.readObject();

        in.close();
        file.close();

        System.out.println("Object has been deserialized ");
        System.out.println(newUser.toString());
    }

    private static void saveUsers(User user) throws IOException {
        // Serialization
        //Saving of object in a file

        //creaza
        FileOutputStream file = new FileOutputStream(FILE_NAME);
        //inscrie
        ObjectOutputStream out = new ObjectOutputStream(file);

        // Method for serialization of object
        out.writeObject(user);

        out.flush();
        file.close();

        System.out.println("Object has been serialized");
    }
}
