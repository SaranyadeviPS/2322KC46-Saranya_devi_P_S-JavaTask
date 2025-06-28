package Day_5;

import java.io.*;
import java.util.*;

public class MiniStudentManager {
    static HashMap<Integer, String> studentDB = new HashMap<>();

    public static void addStudent(int id, String name) {
        studentDB.put(id, name);
        System.out.println("Added: " + name);
    }

    public static void deleteStudent(int id) {
        if (studentDB.containsKey(id)) {
            System.out.println("Removed: " + studentDB.remove(id));
        } else {
            System.out.println("Student not found.");
        }
    }

    public static void displayAll() {
        for (Map.Entry<Integer, String> e : studentDB.entrySet()) {
            System.out.println("ID: " + e.getKey() + ", Name: " + e.getValue());
        }
    }

    public static void main(String[] args) {
        addStudent(101, "Arun");
        addStudent(102, "Divya");
        displayAll();
        deleteStudent(101);
        displayAll();
    }
}

